package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTableRequest extends StObject {
  
  /**
    * The name of the keyspace of the to be deleted table.
    */
  var keyspaceName: KeyspaceName
  
  /**
    * The name of the table to be deleted.
    */
  var tableName: TableName
}
object DeleteTableRequest {
  
  inline def apply(keyspaceName: KeyspaceName, tableName: TableName): DeleteTableRequest = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableRequest]
  }
  
  extension [Self <: DeleteTableRequest](x: Self) {
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
