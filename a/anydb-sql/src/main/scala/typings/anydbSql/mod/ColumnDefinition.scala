package typings.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends js.Object {
  var dataType: js.UndefOr[String] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var references: js.UndefOr[typings.anydbSql.anon.Column] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    dataType: String = null,
    notNull: js.UndefOr[Boolean] = js.undefined,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    references: typings.anydbSql.anon.Column = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey.get.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
}

