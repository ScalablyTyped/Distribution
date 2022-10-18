package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamPoolCidrsResult extends StObject {
  
  /**
    * Information about the CIDRs provisioned to an IPAM pool.
    */
  var IpamPoolCidrs: js.UndefOr[IpamPoolCidrSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object GetIpamPoolCidrsResult {
  
  inline def apply(): GetIpamPoolCidrsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIpamPoolCidrsResult]
  }
  
  extension [Self <: GetIpamPoolCidrsResult](x: Self) {
    
    inline def setIpamPoolCidrs(value: IpamPoolCidrSet): Self = StObject.set(x, "IpamPoolCidrs", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolCidrsUndefined: Self = StObject.set(x, "IpamPoolCidrs", js.undefined)
    
    inline def setIpamPoolCidrsVarargs(value: IpamPoolCidr*): Self = StObject.set(x, "IpamPoolCidrs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
