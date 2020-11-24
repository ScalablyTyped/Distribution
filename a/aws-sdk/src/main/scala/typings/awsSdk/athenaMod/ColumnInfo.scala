package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(Name: String, Type: String): ColumnInfo = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
  
  @scala.inline
  implicit class ColumnInfoOps[Self <: ColumnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("CaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("CaseSensitive", js.undefined)
    
    @scala.inline
    def setCatalogName(value: String): Self = this.set("CatalogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogName: Self = this.set("CatalogName", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    
    @scala.inline
    def setNullable(value: ColumnNullable): Self = this.set("Nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullable: Self = this.set("Nullable", js.undefined)
    
    @scala.inline
    def setPrecision(value: Integer): Self = this.set("Precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("Precision", js.undefined)
    
    @scala.inline
    def setScale(value: Integer): Self = this.set("Scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("Scale", js.undefined)
    
    @scala.inline
    def setSchemaName(value: String): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaName: Self = this.set("SchemaName", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
}
