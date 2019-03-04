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
    all: js.Function0[bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]]],
    allWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]]],
    exec: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    execWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    get: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    getWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    ifExists: js.Function0[Executable[scala.Unit]],
    toQuery: js.Function0[QueryLike]
  ): DropQuery = {
    val __obj = js.Dynamic.literal(all = all, allWithin = allWithin, exec = exec, execWithin = execWithin, get = get, getWithin = getWithin, ifExists = ifExists, toQuery = toQuery)
  
    __obj.asInstanceOf[DropQuery]
  }
}

