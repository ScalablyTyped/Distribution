package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

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
    all: js.Function0[bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]]],
    allWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]]],
    exec: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    execWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    get: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    getWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    ifNotExists: js.Function0[Executable[scala.Unit]],
    toQuery: js.Function0[QueryLike]
  ): CreateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("allWithin")(allWithin)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("execWithin")(execWithin)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getWithin")(getWithin)
    __obj.updateDynamic("ifNotExists")(ifNotExists)
    __obj.updateDynamic("toQuery")(toQuery)
    __obj.asInstanceOf[CreateQuery]
  }
}

