package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIDRSummary extends StObject {
  
  /**
    * The number of CIDR blocks available for use by the IP set references in a firewall.
    */
  var AvailableCIDRCount: js.UndefOr[CIDRCount] = js.undefined
  
  /**
    * The list of the IP set references used by a firewall.
    */
  var IPSetReferences: js.UndefOr[IPSetMetadataMap] = js.undefined
  
  /**
    * The number of CIDR blocks used by the IP set references in a firewall.
    */
  var UtilizedCIDRCount: js.UndefOr[CIDRCount] = js.undefined
}
object CIDRSummary {
  
  inline def apply(): CIDRSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CIDRSummary]
  }
  
  extension [Self <: CIDRSummary](x: Self) {
    
    inline def setAvailableCIDRCount(value: CIDRCount): Self = StObject.set(x, "AvailableCIDRCount", value.asInstanceOf[js.Any])
    
    inline def setAvailableCIDRCountUndefined: Self = StObject.set(x, "AvailableCIDRCount", js.undefined)
    
    inline def setIPSetReferences(value: IPSetMetadataMap): Self = StObject.set(x, "IPSetReferences", value.asInstanceOf[js.Any])
    
    inline def setIPSetReferencesUndefined: Self = StObject.set(x, "IPSetReferences", js.undefined)
    
    inline def setUtilizedCIDRCount(value: CIDRCount): Self = StObject.set(x, "UtilizedCIDRCount", value.asInstanceOf[js.Any])
    
    inline def setUtilizedCIDRCountUndefined: Self = StObject.set(x, "UtilizedCIDRCount", js.undefined)
  }
}
