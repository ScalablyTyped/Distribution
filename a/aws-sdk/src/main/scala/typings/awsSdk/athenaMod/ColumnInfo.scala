package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnInfo extends StObject {
  
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
  def apply(Name: String, Type: String): ColumnInfo = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
  
  @scala.inline
  implicit class ColumnInfoMutableBuilder[Self <: ColumnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "CaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "CaseSensitive", js.undefined)
    
    @scala.inline
    def setCatalogName(value: String): Self = StObject.set(x, "CatalogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogNameUndefined: Self = StObject.set(x, "CatalogName", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullable(value: ColumnNullable): Self = StObject.set(x, "Nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableUndefined: Self = StObject.set(x, "Nullable", js.undefined)
    
    @scala.inline
    def setPrecision(value: Integer): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "Precision", js.undefined)
    
    @scala.inline
    def setScale(value: Integer): Self = StObject.set(x, "Scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "Scale", js.undefined)
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
