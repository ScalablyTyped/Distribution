package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectsOnCancelRequest extends StObject {
  
  /**
    * The Glue data catalog that contains the governed table. Defaults to the current account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The database that contains the governed table.
    */
  var DatabaseName: NameString
  
  /**
    * A list of VirtualObject structures, which indicates the Amazon S3 objects to be deleted if the transaction cancels.
    */
  var Objects: VirtualObjectList
  
  /**
    * The name of the governed table.
    */
  var TableName: NameString
  
  /**
    * ID of the transaction that the writes occur in.
    */
  var TransactionId: TransactionIdString
}
object DeleteObjectsOnCancelRequest {
  
  inline def apply(
    DatabaseName: NameString,
    Objects: VirtualObjectList,
    TableName: NameString,
    TransactionId: TransactionIdString
  ): DeleteObjectsOnCancelRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Objects = Objects.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsOnCancelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteObjectsOnCancelRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setObjects(value: VirtualObjectList): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: VirtualObject*): Self = StObject.set(x, "Objects", js.Array(value*))
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
