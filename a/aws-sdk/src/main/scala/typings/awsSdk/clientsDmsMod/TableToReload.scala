package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableToReload extends StObject {
  
  /**
    * The schema name of the table to be reloaded.
    */
  var SchemaName: String
  
  /**
    * The table name of the table to be reloaded.
    */
  var TableName: String
}
object TableToReload {
  
  inline def apply(SchemaName: String, TableName: String): TableToReload = {
    val __obj = js.Dynamic.literal(SchemaName = SchemaName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToReload]
  }
  
  extension [Self <: TableToReload](x: Self) {
    
    inline def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
