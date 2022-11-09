package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointsForDomainResponse extends StObject {
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: typings.awsSdk.clientsOpensearchMod.NextToken
  
  /**
    * Information about each endpoint associated with the domain.
    */
  var VpcEndpointSummaryList: typings.awsSdk.clientsOpensearchMod.VpcEndpointSummaryList
}
object ListVpcEndpointsForDomainResponse {
  
  inline def apply(NextToken: NextToken, VpcEndpointSummaryList: VpcEndpointSummaryList): ListVpcEndpointsForDomainResponse = {
    val __obj = js.Dynamic.literal(NextToken = NextToken.asInstanceOf[js.Any], VpcEndpointSummaryList = VpcEndpointSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVpcEndpointsForDomainResponse]
  }
  
  extension [Self <: ListVpcEndpointsForDomainResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointSummaryList(value: VpcEndpointSummaryList): Self = StObject.set(x, "VpcEndpointSummaryList", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointSummaryListVarargs(value: VpcEndpointSummary*): Self = StObject.set(x, "VpcEndpointSummaryList", js.Array(value*))
  }
}
