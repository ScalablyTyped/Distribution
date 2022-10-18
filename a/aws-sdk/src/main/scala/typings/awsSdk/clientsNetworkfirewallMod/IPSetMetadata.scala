package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPSetMetadata extends StObject {
  
  /**
    * Describes the total number of CIDR blocks currently in use by the IP set references in a firewall. To determine how many CIDR blocks are available for you to use in a firewall, you can call AvailableCIDRCount.
    */
  var ResolvedCIDRCount: js.UndefOr[CIDRCount] = js.undefined
}
object IPSetMetadata {
  
  inline def apply(): IPSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPSetMetadata]
  }
  
  extension [Self <: IPSetMetadata](x: Self) {
    
    inline def setResolvedCIDRCount(value: CIDRCount): Self = StObject.set(x, "ResolvedCIDRCount", value.asInstanceOf[js.Any])
    
    inline def setResolvedCIDRCountUndefined: Self = StObject.set(x, "ResolvedCIDRCount", js.undefined)
  }
}
