package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressTransfersRequest extends StObject {
  
  /**
    * The allocation IDs of Elastic IP addresses.
    */
  var AllocationIds: js.UndefOr[AllocationIdList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of address transfers to return in one page of results.
    */
  var MaxResults: js.UndefOr[DescribeAddressTransfersMaxResults] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeAddressTransfersRequest {
  
  inline def apply(): DescribeAddressTransfersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressTransfersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAddressTransfersRequest] (val x: Self) extends AnyVal {
    
    inline def setAllocationIds(value: AllocationIdList): Self = StObject.set(x, "AllocationIds", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdsUndefined: Self = StObject.set(x, "AllocationIds", js.undefined)
    
    inline def setAllocationIdsVarargs(value: AllocationId*): Self = StObject.set(x, "AllocationIds", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxResults(value: DescribeAddressTransfersMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
