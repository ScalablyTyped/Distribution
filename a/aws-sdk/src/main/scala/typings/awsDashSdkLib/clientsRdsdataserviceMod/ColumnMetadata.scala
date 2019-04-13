package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnMetadata extends js.Object {
  /**
    * Homogenous array base SQL type from java.sql.Types.
    */
  var arrayBaseColumnType: js.UndefOr[Integer] = js.undefined
  /**
    * Whether the designated column is automatically numbered
    */
  var isAutoIncrement: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether values in the designated column's case matters
    */
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether values in the designated column is a cash value
    */
  var isCurrency: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether values in the designated column are signed numbers
    */
  var isSigned: js.UndefOr[Boolean] = js.undefined
  /**
    * Usually specified by the SQL AS. If not specified, return column name.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Name of the column.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Indicates the nullability of values in the designated column. One of columnNoNulls (0), columnNullable (1), columnNullableUnknown (2)
    */
  var nullable: js.UndefOr[Integer] = js.undefined
  /**
    * Get the designated column's specified column size.For numeric data, this is the maximum precision.  For character data, this is the length in characters. For datetime datatypes, this is the length in characters of the String representation (assuming the maximum allowed precision of the fractional seconds component). For binary data, this is the length in bytes.  For the ROWID datatype, this is the length in bytes. 0 is returned for data types where the column size is not applicable.
    */
  var precision: js.UndefOr[Integer] = js.undefined
  /**
    * Designated column's number of digits to right of the decimal point. 0 is returned for data types where the scale is not applicable.
    */
  var scale: js.UndefOr[Integer] = js.undefined
  /**
    * Designated column's table's schema
    */
  var schemaName: js.UndefOr[String] = js.undefined
  /**
    * Designated column's table name
    */
  var tableName: js.UndefOr[String] = js.undefined
  /**
    * SQL type from java.sql.Types.
    */
  var `type`: js.UndefOr[Integer] = js.undefined
  /**
    * Database-specific type name.
    */
  var typeName: js.UndefOr[String] = js.undefined
}

object ColumnMetadata {
  @scala.inline
  def apply(
    arrayBaseColumnType: js.UndefOr[Integer] = js.undefined,
    isAutoIncrement: js.UndefOr[Boolean] = js.undefined,
    isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    isCurrency: js.UndefOr[Boolean] = js.undefined,
    isSigned: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    name: String = null,
    nullable: js.UndefOr[Integer] = js.undefined,
    precision: js.UndefOr[Integer] = js.undefined,
    scale: js.UndefOr[Integer] = js.undefined,
    schemaName: String = null,
    tableName: String = null,
    `type`: js.UndefOr[Integer] = js.undefined,
    typeName: String = null
  ): ColumnMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrayBaseColumnType)) __obj.updateDynamic("arrayBaseColumnType")(arrayBaseColumnType)
    if (!js.isUndefined(isAutoIncrement)) __obj.updateDynamic("isAutoIncrement")(isAutoIncrement)
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive)
    if (!js.isUndefined(isCurrency)) __obj.updateDynamic("isCurrency")(isCurrency)
    if (!js.isUndefined(isSigned)) __obj.updateDynamic("isSigned")(isSigned)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision)
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    if (typeName != null) __obj.updateDynamic("typeName")(typeName)
    __obj.asInstanceOf[ColumnMetadata]
  }
}

