package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnInfo extends js.Object {
  /**
    * Indicates whether values in the column are case-sensitive.
    */
  var CaseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * The catalog to which the query results belong.
    */
  var CatalogName: js.UndefOr[String] = js.undefined
  /**
    * A column label.
    */
  var Label: js.UndefOr[String] = js.undefined
  /**
    * The name of the column.
    */
  var Name: String
  /**
    * Indicates the column's nullable status.
    */
  var Nullable: js.UndefOr[ColumnNullable] = js.undefined
  /**
    * For DECIMAL data types, specifies the total number of digits, up to 38. For performance reasons, we recommend up to 18 digits.
    */
  var Precision: js.UndefOr[Integer] = js.undefined
  /**
    * For DECIMAL data types, specifies the total number of digits in the fractional part of the value. Defaults to 0.
    */
  var Scale: js.UndefOr[Integer] = js.undefined
  /**
    * The schema name (database name) to which the query results belong.
    */
  var SchemaName: js.UndefOr[String] = js.undefined
  /**
    * The table name for the query results.
    */
  var TableName: js.UndefOr[String] = js.undefined
  /**
    * The data type of the column.
    */
  var Type: String
}

object ColumnInfo {
  @scala.inline
  def apply(
    Name: String,
    Type: String,
    CaseSensitive: js.UndefOr[Boolean] = js.undefined,
    CatalogName: String = null,
    Label: String = null,
    Nullable: ColumnNullable = null,
    Precision: js.UndefOr[Integer] = js.undefined,
    Scale: js.UndefOr[Integer] = js.undefined,
    SchemaName: String = null,
    TableName: String = null
  ): ColumnInfo = {
    val __obj = js.Dynamic.literal(Name = Name, Type = Type)
    if (!js.isUndefined(CaseSensitive)) __obj.updateDynamic("CaseSensitive")(CaseSensitive)
    if (CatalogName != null) __obj.updateDynamic("CatalogName")(CatalogName)
    if (Label != null) __obj.updateDynamic("Label")(Label)
    if (Nullable != null) __obj.updateDynamic("Nullable")(Nullable.asInstanceOf[js.Any])
    if (!js.isUndefined(Precision)) __obj.updateDynamic("Precision")(Precision)
    if (!js.isUndefined(Scale)) __obj.updateDynamic("Scale")(Scale)
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    __obj.asInstanceOf[ColumnInfo]
  }
}

