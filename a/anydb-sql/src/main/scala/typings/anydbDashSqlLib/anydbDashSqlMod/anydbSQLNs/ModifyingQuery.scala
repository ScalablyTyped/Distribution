package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyingQuery
  extends Executable[scala.Unit] {
  def returning[U](nodes: js.Any*): Query[U]
  def where(nodes: js.Any*): ModifyingQuery
}

object ModifyingQuery {
  @scala.inline
  def apply(
    all: js.Function0[bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]]],
    allWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[js.Array[scala.Unit]]],
    exec: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    execWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    get: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    getWithin: js.Function1[DatabaseConnection, bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    returning: js.Function1[/* repeated */ js.Any, Query[js.Any]],
    toQuery: js.Function0[QueryLike],
    where: js.Function1[/* repeated */ js.Any, ModifyingQuery]
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("allWithin")(allWithin)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("execWithin")(execWithin)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getWithin")(getWithin)
    __obj.updateDynamic("returning")(returning)
    __obj.updateDynamic("toQuery")(toQuery)
    __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[ModifyingQuery]
  }
}

