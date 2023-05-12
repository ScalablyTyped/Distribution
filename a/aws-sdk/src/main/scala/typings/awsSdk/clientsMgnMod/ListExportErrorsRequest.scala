package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportErrorsRequest extends StObject {
  
  /**
    * List export errors request export id.
    */
  var exportID: ExportID
  
  /**
    * List export errors request max results.
    */
  var maxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * List export errors request next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListExportErrorsRequest {
  
  inline def apply(exportID: ExportID): ListExportErrorsRequest = {
    val __obj = js.Dynamic.literal(exportID = exportID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExportErrorsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportErrorsRequest] (val x: Self) extends AnyVal {
    
    inline def setExportID(value: ExportID): Self = StObject.set(x, "exportID", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
