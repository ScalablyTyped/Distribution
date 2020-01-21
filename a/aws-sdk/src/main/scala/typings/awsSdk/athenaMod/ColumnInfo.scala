package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnInfo extends js.Object {
  /**
    * Indicates whether values in the column are case-sensitive.
    */
  var CaseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * The catalog to which the query results belong.
    */
  var CatalogName: js.UndefOr[String] = js.native
  /**
    * A column label.
    */
  var Label: js.UndefOr[String] = js.native
  /**
    * The name of the column.
    */
  var Name: String = js.native
  /**
    * Indicates the column's nullable status.
    */
  var Nullable: js.UndefOr[ColumnNullable] = js.native
  /**
    * For DECIMAL data types, specifies the total number of digits, up to 38. For performance reasons, we recommend up to 18 digits.
    */
  var Precision: js.UndefOr[Integer] = js.native
  /**
    * For DECIMAL data types, specifies the total number of digits in the fractional part of the value. Defaults to 0.
    */
  var Scale: js.UndefOr[Integer] = js.native
  /**
    * The schema name (database name) to which the query results belong.
    */
  var SchemaName: js.UndefOr[String] = js.native
  /**
    * The table name for the query results.
    */
  var TableName: js.UndefOr[String] = js.native
  /**
    * The data type of the column.
    */
  var Type: String = js.native
}

object ColumnInfo {
  @scala.inline
  def apply(
    Name: String,
    Type: String,
    CaseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    CatalogName: String = null,
    Label: String = null,
    Nullable: ColumnNullable = null,
    Precision: Int | Double = null,
    Scale: Int | Double = null,
    SchemaName: String = null,
    TableName: String = null
  ): ColumnInfo = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (!js.isUndefined(CaseSensitive)) __obj.updateDynamic("CaseSensitive")(CaseSensitive.asInstanceOf[js.Any])
    if (CatalogName != null) __obj.updateDynamic("CatalogName")(CatalogName.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (Nullable != null) __obj.updateDynamic("Nullable")(Nullable.asInstanceOf[js.Any])
    if (Precision != null) __obj.updateDynamic("Precision")(Precision.asInstanceOf[js.Any])
    if (Scale != null) __obj.updateDynamic("Scale")(Scale.asInstanceOf[js.Any])
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
}

