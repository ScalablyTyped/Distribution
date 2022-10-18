package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableRequest extends StObject {
  
  /**
    * The name of the keyspace that the table is stored in.
    */
  var keyspaceName: KeyspaceName
  
  /**
    * The name of the table.
    */
  var tableName: TableName
}
object GetTableRequest {
  
  inline def apply(keyspaceName: KeyspaceName, tableName: TableName): GetTableRequest = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableRequest]
  }
  
  extension [Self <: GetTableRequest](x: Self) {
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
