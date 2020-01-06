package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMetadata extends js.Object {
  /**
    * The type of the column.
    */
  var arrayBaseColumnType: js.UndefOr[Integer] = js.native
  /**
    * A value that indicates whether the column increments automatically.
    */
  var isAutoIncrement: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the column is case-sensitive.
    */
  var isCaseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the column contains currency values.
    */
  var isCurrency: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether an integer column is signed.
    */
  var isSigned: js.UndefOr[Boolean] = js.native
  /**
    * The label for the column.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The name of the column.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the column is nullable.
    */
  var nullable: js.UndefOr[Integer] = js.native
  /**
    * The precision value of a decimal number column.
    */
  var precision: js.UndefOr[Integer] = js.native
  /**
    * The scale value of a decimal number column.
    */
  var scale: js.UndefOr[Integer] = js.native
  /**
    * The name of the schema that owns the table that includes the column.
    */
  var schemaName: js.UndefOr[String] = js.native
  /**
    * The name of the table that includes the column.
    */
  var tableName: js.UndefOr[String] = js.native
  /**
    * The type of the column.
    */
  var `type`: js.UndefOr[Integer] = js.native
  /**
    * The database-specific data type of the column.
    */
  var typeName: js.UndefOr[String] = js.native
}

object ColumnMetadata {
  @scala.inline
  def apply(
    arrayBaseColumnType: Int | Double = null,
    isAutoIncrement: js.UndefOr[scala.Boolean] = js.undefined,
    isCaseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    isCurrency: js.UndefOr[scala.Boolean] = js.undefined,
    isSigned: js.UndefOr[scala.Boolean] = js.undefined,
    label: String = null,
    name: String = null,
    nullable: Int | Double = null,
    precision: Int | Double = null,
    scale: Int | Double = null,
    schemaName: String = null,
    tableName: String = null,
    `type`: Int | Double = null,
    typeName: String = null
  ): ColumnMetadata = {
    val __obj = js.Dynamic.literal()
    if (arrayBaseColumnType != null) __obj.updateDynamic("arrayBaseColumnType")(arrayBaseColumnType.asInstanceOf[js.Any])
    if (!js.isUndefined(isAutoIncrement)) __obj.updateDynamic("isAutoIncrement")(isAutoIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(isCurrency)) __obj.updateDynamic("isCurrency")(isCurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(isSigned)) __obj.updateDynamic("isSigned")(isSigned.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nullable != null) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetadata]
  }
}

