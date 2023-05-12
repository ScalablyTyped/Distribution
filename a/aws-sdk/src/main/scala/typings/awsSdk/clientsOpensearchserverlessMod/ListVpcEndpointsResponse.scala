package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointsResponse extends StObject {
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Details about each VPC endpoint, including the name and current status.
    */
  var vpcEndpointSummaries: js.UndefOr[VpcEndpointSummaries] = js.undefined
}
object ListVpcEndpointsResponse {
  
  inline def apply(): ListVpcEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVpcEndpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVpcEndpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVpcEndpointSummaries(value: VpcEndpointSummaries): Self = StObject.set(x, "vpcEndpointSummaries", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointSummariesUndefined: Self = StObject.set(x, "vpcEndpointSummaries", js.undefined)
    
    inline def setVpcEndpointSummariesVarargs(value: VpcEndpointSummary*): Self = StObject.set(x, "vpcEndpointSummaries", js.Array(value*))
  }
}
