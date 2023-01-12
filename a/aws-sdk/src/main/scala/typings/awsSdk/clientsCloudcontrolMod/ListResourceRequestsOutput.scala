package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceRequestsOutput extends StObject {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call ListResources again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.NextToken] = js.undefined
  
  /**
    * The requests that match the specified filter criteria.
    */
  var ResourceRequestStatusSummaries: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ResourceRequestStatusSummaries] = js.undefined
}
object ListResourceRequestsOutput {
  
  inline def apply(): ListResourceRequestsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceRequestsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceRequestsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceRequestStatusSummaries(value: ResourceRequestStatusSummaries): Self = StObject.set(x, "ResourceRequestStatusSummaries", value.asInstanceOf[js.Any])
    
    inline def setResourceRequestStatusSummariesUndefined: Self = StObject.set(x, "ResourceRequestStatusSummaries", js.undefined)
    
    inline def setResourceRequestStatusSummariesVarargs(value: ProgressEvent*): Self = StObject.set(x, "ResourceRequestStatusSummaries", js.Array(value*))
  }
}
