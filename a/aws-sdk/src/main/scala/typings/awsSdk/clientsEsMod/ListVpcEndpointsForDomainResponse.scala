package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointsForDomainResponse extends StObject {
  
  /**
    * Information about each endpoint associated with the domain.
    */
  var NextToken: typings.awsSdk.clientsEsMod.NextToken
  
  /**
    * Provides list of VpcEndpointSummary summarizing details of the VPC endpoints.
    */
  var VpcEndpointSummaryList: typings.awsSdk.clientsEsMod.VpcEndpointSummaryList
}
object ListVpcEndpointsForDomainResponse {
  
  inline def apply(NextToken: NextToken, VpcEndpointSummaryList: VpcEndpointSummaryList): ListVpcEndpointsForDomainResponse = {
    val __obj = js.Dynamic.literal(NextToken = NextToken.asInstanceOf[js.Any], VpcEndpointSummaryList = VpcEndpointSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVpcEndpointsForDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVpcEndpointsForDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointSummaryList(value: VpcEndpointSummaryList): Self = StObject.set(x, "VpcEndpointSummaryList", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointSummaryListVarargs(value: VpcEndpointSummary*): Self = StObject.set(x, "VpcEndpointSummaryList", js.Array(value*))
  }
}
