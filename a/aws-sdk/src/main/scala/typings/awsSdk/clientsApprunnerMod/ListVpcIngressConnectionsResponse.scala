package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcIngressConnectionsResponse extends StObject {
  
  /**
    * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsApprunnerMod.NextToken] = js.undefined
  
  /**
    * A list of summary information records for VPC Ingress Connections. In a paginated request, the request returns up to MaxResults records for each call.
    */
  var VpcIngressConnectionSummaryList: typings.awsSdk.clientsApprunnerMod.VpcIngressConnectionSummaryList
}
object ListVpcIngressConnectionsResponse {
  
  inline def apply(VpcIngressConnectionSummaryList: VpcIngressConnectionSummaryList): ListVpcIngressConnectionsResponse = {
    val __obj = js.Dynamic.literal(VpcIngressConnectionSummaryList = VpcIngressConnectionSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVpcIngressConnectionsResponse]
  }
  
  extension [Self <: ListVpcIngressConnectionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpcIngressConnectionSummaryList(value: VpcIngressConnectionSummaryList): Self = StObject.set(x, "VpcIngressConnectionSummaryList", value.asInstanceOf[js.Any])
    
    inline def setVpcIngressConnectionSummaryListVarargs(value: VpcIngressConnectionSummary*): Self = StObject.set(x, "VpcIngressConnectionSummaryList", js.Array(value*))
  }
}
