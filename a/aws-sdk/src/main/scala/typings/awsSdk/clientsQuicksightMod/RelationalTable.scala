package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationalTable extends StObject {
  
  /**
    * The catalog associated with a table.
    */
  var Catalog: js.UndefOr[RelationalTableCatalog] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the data source.
    */
  var DataSourceArn: Arn
  
  /**
    * The column schema of the table.
    */
  var InputColumns: InputColumnList
  
  /**
    * The name of the relational table.
    */
  var Name: RelationalTableName
  
  /**
    * The schema name. This name applies to certain relational database engines.
    */
  var Schema: js.UndefOr[RelationalTableSchema] = js.undefined
}
object RelationalTable {
  
  inline def apply(DataSourceArn: Arn, InputColumns: InputColumnList, Name: RelationalTableName): RelationalTable = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], InputColumns = InputColumns.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationalTable] (val x: Self) extends AnyVal {
    
    inline def setCatalog(value: RelationalTableCatalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "Catalog", js.undefined)
    
    inline def setDataSourceArn(value: Arn): Self = StObject.set(x, "DataSourceArn", value.asInstanceOf[js.Any])
    
    inline def setInputColumns(value: InputColumnList): Self = StObject.set(x, "InputColumns", value.asInstanceOf[js.Any])
    
    inline def setInputColumnsVarargs(value: InputColumn*): Self = StObject.set(x, "InputColumns", js.Array(value*))
    
    inline def setName(value: RelationalTableName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: RelationalTableSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
  }
}
