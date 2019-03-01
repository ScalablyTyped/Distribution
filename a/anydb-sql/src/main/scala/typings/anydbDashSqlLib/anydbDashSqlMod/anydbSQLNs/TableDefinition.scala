package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition extends js.Object {
  var columns: anydbDashSqlLib.anydbDashSqlMod.Dictionary[ColumnDefinition]
  var has: js.UndefOr[anydbDashSqlLib.anydbDashSqlMod.Dictionary[anydbDashSqlLib.Anon_From]] = js.undefined
  var name: java.lang.String
}

object TableDefinition {
  @scala.inline
  def apply(
    columns: anydbDashSqlLib.anydbDashSqlMod.Dictionary[ColumnDefinition],
    name: java.lang.String,
    has: anydbDashSqlLib.anydbDashSqlMod.Dictionary[anydbDashSqlLib.Anon_From] = null
  ): TableDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("name")(name)
    if (has != null) __obj.updateDynamic("has")(has)
    __obj.asInstanceOf[TableDefinition]
  }
}

