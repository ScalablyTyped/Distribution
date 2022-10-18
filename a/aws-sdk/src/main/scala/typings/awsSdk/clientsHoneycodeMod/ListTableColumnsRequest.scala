package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTableColumnsRequest extends StObject {
  
  /**
    *  This parameter is optional. If a nextToken is not specified, the API returns the first page of data.   Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the table whose columns are being retrieved.  If a table with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var tableId: ResourceId
  
  /**
    * The ID of the workbook that contains the table whose columns are being retrieved.  If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object ListTableColumnsRequest {
  
  inline def apply(tableId: ResourceId, workbookId: ResourceId): ListTableColumnsRequest = {
    val __obj = js.Dynamic.literal(tableId = tableId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTableColumnsRequest]
  }
  
  extension [Self <: ListTableColumnsRequest](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTableId(value: ResourceId): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
