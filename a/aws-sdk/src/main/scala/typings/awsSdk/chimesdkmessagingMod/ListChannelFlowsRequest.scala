package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelFlowsRequest extends StObject {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The maximum number of channel flows that you want to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested channel flows are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.NextToken] = js.undefined
}
object ListChannelFlowsRequest {
  
  inline def apply(AppInstanceArn: ChimeArn): ListChannelFlowsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelFlowsRequest]
  }
  
  extension [Self <: ListChannelFlowsRequest](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
