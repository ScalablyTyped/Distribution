package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamResourceCidrsResult extends StObject {
  
  /**
    * The resource CIDRs.
    */
  var IpamResourceCidrs: js.UndefOr[IpamResourceCidrSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object GetIpamResourceCidrsResult {
  
  inline def apply(): GetIpamResourceCidrsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIpamResourceCidrsResult]
  }
  
  extension [Self <: GetIpamResourceCidrsResult](x: Self) {
    
    inline def setIpamResourceCidrs(value: IpamResourceCidrSet): Self = StObject.set(x, "IpamResourceCidrs", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceCidrsUndefined: Self = StObject.set(x, "IpamResourceCidrs", js.undefined)
    
    inline def setIpamResourceCidrsVarargs(value: IpamResourceCidr*): Self = StObject.set(x, "IpamResourceCidrs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
