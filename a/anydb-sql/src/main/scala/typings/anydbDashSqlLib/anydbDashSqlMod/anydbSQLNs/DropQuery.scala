package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropQuery
  extends Executable[scala.Unit] {
  def ifExists(): Executable[scala.Unit]
}

object DropQuery {
  @scala.inline
  def apply(
    all: () => bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]],
    allWithin: DatabaseConnection => bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]],
    exec: () => bluebirdLib.bluebirdMod.namespaced[scala.Unit],
    execWithin: DatabaseConnection => bluebirdLib.bluebirdMod.namespaced[scala.Unit],
    get: () => bluebirdLib.bluebirdMod.namespaced[scala.Unit],
    getWithin: DatabaseConnection => bluebirdLib.bluebirdMod.namespaced[scala.Unit],
    ifExists: () => Executable[scala.Unit],
    toQuery: () => QueryLike
  ): DropQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), ifExists = js.Any.fromFunction0(ifExists), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[DropQuery]
  }
}

