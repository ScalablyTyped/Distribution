package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcClassicLinkDnsSupportRequest extends StObject {
  
  /**
    * The maximum number of items to return for this request. To get the next page of items, make another request with the token returned in the output. For more information, see Pagination.
    */
  var MaxResults: js.UndefOr[DescribeVpcClassicLinkDnsSupportMaxResults] = js.undefined
  
  /**
    * The token returned from a previous paginated request. Pagination continues from the end of the items returned by the previous request.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.undefined
  
  /**
    * One or more VPC IDs.
    */
  var VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.undefined
}
object DescribeVpcClassicLinkDnsSupportRequest {
  
  inline def apply(): DescribeVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcClassicLinkDnsSupportRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: DescribeVpcClassicLinkDnsSupportMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: DescribeVpcClassicLinkDnsSupportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpcIds(value: VpcClassicLinkIdList): Self = StObject.set(x, "VpcIds", value.asInstanceOf[js.Any])
    
    inline def setVpcIdsUndefined: Self = StObject.set(x, "VpcIds", js.undefined)
    
    inline def setVpcIdsVarargs(value: VpcId*): Self = StObject.set(x, "VpcIds", js.Array(value*))
  }
}
