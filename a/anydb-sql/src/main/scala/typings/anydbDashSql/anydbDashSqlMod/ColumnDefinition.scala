package typings.anydbDashSql.anydbDashSqlMod

import typings.anydbDashSql.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends js.Object {
  var dataType: js.UndefOr[String] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var references: js.UndefOr[Anon_Column] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    dataType: String = null,
    notNull: js.UndefOr[Boolean] = js.undefined,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    references: Anon_Column = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
}

