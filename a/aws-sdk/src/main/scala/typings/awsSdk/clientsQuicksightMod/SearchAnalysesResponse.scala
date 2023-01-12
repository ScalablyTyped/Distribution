package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAnalysesResponse extends StObject {
  
  /**
    * Metadata describing the analyses that you searched for.
    */
  var AnalysisSummaryList: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AnalysisSummaryList] = js.undefined
  
  /**
    * A pagination token that can be used in a subsequent request. 
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
}
object SearchAnalysesResponse {
  
  inline def apply(): SearchAnalysesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAnalysesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAnalysesResponse] (val x: Self) extends AnyVal {
    
    inline def setAnalysisSummaryList(value: AnalysisSummaryList): Self = StObject.set(x, "AnalysisSummaryList", value.asInstanceOf[js.Any])
    
    inline def setAnalysisSummaryListUndefined: Self = StObject.set(x, "AnalysisSummaryList", js.undefined)
    
    inline def setAnalysisSummaryListVarargs(value: AnalysisSummary*): Self = StObject.set(x, "AnalysisSummaryList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
