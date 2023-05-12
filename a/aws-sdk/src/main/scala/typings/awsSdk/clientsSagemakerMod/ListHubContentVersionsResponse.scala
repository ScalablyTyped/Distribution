package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHubContentVersionsResponse extends StObject {
  
  /**
    * The summaries of the listed hub content versions.
    */
  var HubContentSummaries: HubContentInfoList
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of hub content versions, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListHubContentVersionsResponse {
  
  inline def apply(HubContentSummaries: HubContentInfoList): ListHubContentVersionsResponse = {
    val __obj = js.Dynamic.literal(HubContentSummaries = HubContentSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHubContentVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListHubContentVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setHubContentSummaries(value: HubContentInfoList): Self = StObject.set(x, "HubContentSummaries", value.asInstanceOf[js.Any])
    
    inline def setHubContentSummariesVarargs(value: HubContentInfo*): Self = StObject.set(x, "HubContentSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
