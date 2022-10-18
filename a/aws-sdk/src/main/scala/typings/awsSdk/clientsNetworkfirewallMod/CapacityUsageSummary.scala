package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityUsageSummary extends StObject {
  
  /**
    * Describes the capacity usage of the CIDR blocks used by the IP set references in a firewall.
    */
  var CIDRs: js.UndefOr[CIDRSummary] = js.undefined
}
object CapacityUsageSummary {
  
  inline def apply(): CapacityUsageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityUsageSummary]
  }
  
  extension [Self <: CapacityUsageSummary](x: Self) {
    
    inline def setCIDRs(value: CIDRSummary): Self = StObject.set(x, "CIDRs", value.asInstanceOf[js.Any])
    
    inline def setCIDRsUndefined: Self = StObject.set(x, "CIDRs", js.undefined)
  }
}
