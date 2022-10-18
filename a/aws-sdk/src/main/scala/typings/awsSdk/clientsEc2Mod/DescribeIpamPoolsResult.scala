package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpamPoolsResult extends StObject {
  
  /**
    * Information about the IPAM pools.
    */
  var IpamPools: js.UndefOr[IpamPoolSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIpamPoolsResult {
  
  inline def apply(): DescribeIpamPoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpamPoolsResult]
  }
  
  extension [Self <: DescribeIpamPoolsResult](x: Self) {
    
    inline def setIpamPools(value: IpamPoolSet): Self = StObject.set(x, "IpamPools", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolsUndefined: Self = StObject.set(x, "IpamPools", js.undefined)
    
    inline def setIpamPoolsVarargs(value: IpamPool*): Self = StObject.set(x, "IpamPools", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
