package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThemesResponse extends StObject {
  
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
    * Information about the themes in the list.
    */
  var ThemeSummaryList: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ThemeSummaryList] = js.undefined
}
object ListThemesResponse {
  
  inline def apply(): ListThemesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThemesResponse]
  }
  
  extension [Self <: ListThemesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThemeSummaryList(value: ThemeSummaryList): Self = StObject.set(x, "ThemeSummaryList", value.asInstanceOf[js.Any])
    
    inline def setThemeSummaryListUndefined: Self = StObject.set(x, "ThemeSummaryList", js.undefined)
    
    inline def setThemeSummaryListVarargs(value: ThemeSummary*): Self = StObject.set(x, "ThemeSummaryList", js.Array(value*))
  }
}
