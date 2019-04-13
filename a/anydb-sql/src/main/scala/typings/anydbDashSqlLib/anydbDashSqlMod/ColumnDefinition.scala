package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends js.Object {
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var notNull: js.UndefOr[scala.Boolean] = js.undefined
  var primaryKey: js.UndefOr[scala.Boolean] = js.undefined
  var references: js.UndefOr[anydbDashSqlLib.Anon_Column] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    dataType: java.lang.String = null,
    notNull: js.UndefOr[scala.Boolean] = js.undefined,
    primaryKey: js.UndefOr[scala.Boolean] = js.undefined,
    references: anydbDashSqlLib.Anon_Column = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull)
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey)
    if (references != null) __obj.updateDynamic("references")(references)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[ColumnDefinition]
  }
}

