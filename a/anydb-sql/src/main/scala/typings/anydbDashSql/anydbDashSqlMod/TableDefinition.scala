package typings.anydbDashSql.anydbDashSqlMod

import typings.anydbDashSql.Anon_From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition extends js.Object {
  var columns: Dictionary[ColumnDefinition]
  var has: js.UndefOr[Dictionary[Anon_From]] = js.undefined
  var name: String
}

object TableDefinition {
  @scala.inline
  def apply(columns: Dictionary[ColumnDefinition], name: String, has: Dictionary[Anon_From] = null): TableDefinition = {
    val __obj = js.Dynamic.literal(columns = columns, name = name)
    if (has != null) __obj.updateDynamic("has")(has)
    __obj.asInstanceOf[TableDefinition]
  }
}

