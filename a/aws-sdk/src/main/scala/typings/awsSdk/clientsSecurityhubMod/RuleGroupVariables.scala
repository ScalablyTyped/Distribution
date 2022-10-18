package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupVariables extends StObject {
  
  /**
    * A list of IP addresses and address ranges, in CIDR notation.
    */
  var IpSets: js.UndefOr[RuleGroupVariablesIpSetsDetails] = js.undefined
  
  /**
    * A list of port ranges.
    */
  var PortSets: js.UndefOr[RuleGroupVariablesPortSetsDetails] = js.undefined
}
object RuleGroupVariables {
  
  inline def apply(): RuleGroupVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupVariables]
  }
  
  extension [Self <: RuleGroupVariables](x: Self) {
    
    inline def setIpSets(value: RuleGroupVariablesIpSetsDetails): Self = StObject.set(x, "IpSets", value.asInstanceOf[js.Any])
    
    inline def setIpSetsUndefined: Self = StObject.set(x, "IpSets", js.undefined)
    
    inline def setPortSets(value: RuleGroupVariablesPortSetsDetails): Self = StObject.set(x, "PortSets", value.asInstanceOf[js.Any])
    
    inline def setPortSetsUndefined: Self = StObject.set(x, "PortSets", js.undefined)
  }
}
