package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableObjectsRequest extends StObject {
  
  /**
    * The catalog containing the governed table to update. Defaults to the caller’s account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The database containing the governed table to update.
    */
  var DatabaseName: NameString
  
  /**
    * The governed table to update.
    */
  var TableName: NameString
  
  /**
    * The transaction at which to do the write.
    */
  var TransactionId: js.UndefOr[TransactionIdString] = js.undefined
  
  /**
    * A list of WriteOperation objects that define an object to add to or delete from the manifest for a governed table.
    */
  var WriteOperations: WriteOperationList
}
object UpdateTableObjectsRequest {
  
  inline def apply(DatabaseName: NameString, TableName: NameString, WriteOperations: WriteOperationList): UpdateTableObjectsRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], WriteOperations = WriteOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableObjectsRequest]
  }
  
  extension [Self <: UpdateTableObjectsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
    
    inline def setWriteOperations(value: WriteOperationList): Self = StObject.set(x, "WriteOperations", value.asInstanceOf[js.Any])
    
    inline def setWriteOperationsVarargs(value: WriteOperation*): Self = StObject.set(x, "WriteOperations", js.Array(value*))
  }
}
