package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteTableRowsRequest extends StObject {
  
  /**
    *  The request token for performing the delete action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will not perform the action again.   Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    *  The list of row ids to delete from the table. You need to specify at least one row id in this list.   Note that if one of the row ids provided in the request does not exist in the table, then the request fails and no rows are deleted from the table. 
    */
  var rowIds: RowIdList
  
  /**
    * The ID of the table where the rows are being deleted.  If a table with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var tableId: ResourceId
  
  /**
    * The ID of the workbook where the rows are being deleted.  If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object BatchDeleteTableRowsRequest {
  
  inline def apply(rowIds: RowIdList, tableId: ResourceId, workbookId: ResourceId): BatchDeleteTableRowsRequest = {
    val __obj = js.Dynamic.literal(rowIds = rowIds.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableRowsRequest]
  }
  
  extension [Self <: BatchDeleteTableRowsRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setRowIds(value: RowIdList): Self = StObject.set(x, "rowIds", value.asInstanceOf[js.Any])
    
    inline def setRowIdsVarargs(value: RowId*): Self = StObject.set(x, "rowIds", js.Array(value*))
    
    inline def setTableId(value: ResourceId): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
