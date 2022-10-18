package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpamsRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters for the request. For more information about filtering, see Filtering CLI output.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IDs of the IPAMs you want information on.
    */
  var IpamIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The maximum number of results to return in the request.
    */
  var MaxResults: js.UndefOr[IpamMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIpamsRequest {
  
  inline def apply(): DescribeIpamsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpamsRequest]
  }
  
  extension [Self <: DescribeIpamsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIpamIds(value: ValueStringList): Self = StObject.set(x, "IpamIds", value.asInstanceOf[js.Any])
    
    inline def setIpamIdsUndefined: Self = StObject.set(x, "IpamIds", js.undefined)
    
    inline def setIpamIdsVarargs(value: String*): Self = StObject.set(x, "IpamIds", js.Array(value*))
    
    inline def setMaxResults(value: IpamMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
