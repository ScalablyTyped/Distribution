package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplatesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * A structure containing information about the templates in the list.
    */
  var TemplateSummaryList: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TemplateSummaryList] = js.undefined
}
object ListTemplatesResponse {
  
  inline def apply(): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  
  extension [Self <: ListTemplatesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTemplateSummaryList(value: TemplateSummaryList): Self = StObject.set(x, "TemplateSummaryList", value.asInstanceOf[js.Any])
    
    inline def setTemplateSummaryListUndefined: Self = StObject.set(x, "TemplateSummaryList", js.undefined)
    
    inline def setTemplateSummaryListVarargs(value: TemplateSummary*): Self = StObject.set(x, "TemplateSummaryList", js.Array(value*))
  }
}
