package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition extends js.Object {
  var columns: Dictionary[ColumnDefinition]
  var has: js.UndefOr[Dictionary[anydbDashSqlLib.Anon_From]] = js.undefined
  var name: java.lang.String
}

object TableDefinition {
  @scala.inline
  def apply(
    columns: Dictionary[ColumnDefinition],
    name: java.lang.String,
    has: Dictionary[anydbDashSqlLib.Anon_From] = null
  ): TableDefinition = {
    val __obj = js.Dynamic.literal(columns = columns, name = name)
    if (has != null) __obj.updateDynamic("has")(has)
    __obj.asInstanceOf[TableDefinition]
  }
}

