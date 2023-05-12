package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamDiscoveredResourceCidrsResult extends StObject {
  
  /**
    * Discovered resource CIDRs.
    */
  var IpamDiscoveredResourceCidrs: js.UndefOr[IpamDiscoveredResourceCidrSet] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object GetIpamDiscoveredResourceCidrsResult {
  
  inline def apply(): GetIpamDiscoveredResourceCidrsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIpamDiscoveredResourceCidrsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIpamDiscoveredResourceCidrsResult] (val x: Self) extends AnyVal {
    
    inline def setIpamDiscoveredResourceCidrs(value: IpamDiscoveredResourceCidrSet): Self = StObject.set(x, "IpamDiscoveredResourceCidrs", value.asInstanceOf[js.Any])
    
    inline def setIpamDiscoveredResourceCidrsUndefined: Self = StObject.set(x, "IpamDiscoveredResourceCidrs", js.undefined)
    
    inline def setIpamDiscoveredResourceCidrsVarargs(value: IpamDiscoveredResourceCidr*): Self = StObject.set(x, "IpamDiscoveredResourceCidrs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
