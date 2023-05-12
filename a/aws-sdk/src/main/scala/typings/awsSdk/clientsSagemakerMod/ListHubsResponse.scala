package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHubsResponse extends StObject {
  
  /**
    * The summaries of the listed hubs.
    */
  var HubSummaries: HubInfoList
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of hubs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListHubsResponse {
  
  inline def apply(HubSummaries: HubInfoList): ListHubsResponse = {
    val __obj = js.Dynamic.literal(HubSummaries = HubSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHubsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListHubsResponse] (val x: Self) extends AnyVal {
    
    inline def setHubSummaries(value: HubInfoList): Self = StObject.set(x, "HubSummaries", value.asInstanceOf[js.Any])
    
    inline def setHubSummariesVarargs(value: HubInfo*): Self = StObject.set(x, "HubSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
