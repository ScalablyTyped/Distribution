package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyVariables extends StObject {
  
  /**
    * The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata HOME_NET variable. If your firewall uses an inspection VPC, you might want to override the HOME_NET variable with the CIDRs of your home networks. If you don't override HOME_NET with your own CIDRs, Network Firewall by default uses the CIDR of your inspection VPC.
    */
  var RuleVariables: js.UndefOr[IPSets] = js.undefined
}
object PolicyVariables {
  
  inline def apply(): PolicyVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyVariables] (val x: Self) extends AnyVal {
    
    inline def setRuleVariables(value: IPSets): Self = StObject.set(x, "RuleVariables", value.asInstanceOf[js.Any])
    
    inline def setRuleVariablesUndefined: Self = StObject.set(x, "RuleVariables", js.undefined)
  }
}
