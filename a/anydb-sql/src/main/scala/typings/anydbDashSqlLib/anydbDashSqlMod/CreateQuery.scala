package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQuery
  extends Executable[scala.Unit] {
  def ifNotExists(): Executable[scala.Unit]
}

object CreateQuery {
  @scala.inline
  def apply(
    all: () => bluebirdLib.bluebirdMod.^[js.Array[scala.Unit]],
    allWithin: DatabaseConnection => bluebirdLib.bluebirdMod.^[js.Array[scala.Unit]],
    exec: () => bluebirdLib.bluebirdMod.^[scala.Unit],
    execWithin: DatabaseConnection => bluebirdLib.bluebirdMod.^[scala.Unit],
    get: () => bluebirdLib.bluebirdMod.^[scala.Unit],
    getWithin: DatabaseConnection => bluebirdLib.bluebirdMod.^[scala.Unit],
    ifNotExists: () => Executable[scala.Unit],
    toQuery: () => QueryLike
  ): CreateQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), ifNotExists = js.Any.fromFunction0(ifNotExists), toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[CreateQuery]
  }
}

