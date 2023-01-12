package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateTableRowsRequest extends StObject {
  
  /**
    *  The request token for performing the batch create operation. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will not perform the operation again.   Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    *  The list of rows to create at the end of the table. Each item in this list needs to have a batch item id to uniquely identify the element in the request and the cells to create for that row. You need to specify at least one item in this list.   Note that if one of the column ids in any of the rows in the request does not exist in the table, then the request fails and no updates are made to the table. 
    */
  var rowsToCreate: CreateRowDataList
  
  /**
    * The ID of the table where the new rows are being added.  If a table with the specified ID could not be found, this API throws ResourceNotFoundException. 
    */
  var tableId: ResourceId
  
  /**
    * The ID of the workbook where the new rows are being added.  If a workbook with the specified ID could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object BatchCreateTableRowsRequest {
  
  inline def apply(rowsToCreate: CreateRowDataList, tableId: ResourceId, workbookId: ResourceId): BatchCreateTableRowsRequest = {
    val __obj = js.Dynamic.literal(rowsToCreate = rowsToCreate.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateTableRowsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateTableRowsRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setRowsToCreate(value: CreateRowDataList): Self = StObject.set(x, "rowsToCreate", value.asInstanceOf[js.Any])
    
    inline def setRowsToCreateVarargs(value: CreateRowData*): Self = StObject.set(x, "rowsToCreate", js.Array(value*))
    
    inline def setTableId(value: ResourceId): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
