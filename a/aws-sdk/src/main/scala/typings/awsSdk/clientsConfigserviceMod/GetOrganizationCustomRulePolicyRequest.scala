package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrganizationCustomRulePolicyRequest extends StObject {
  
  /**
    * The name of your organization Config Custom Policy rule. 
    */
  var OrganizationConfigRuleName: typings.awsSdk.clientsConfigserviceMod.OrganizationConfigRuleName
}
object GetOrganizationCustomRulePolicyRequest {
  
  inline def apply(OrganizationConfigRuleName: OrganizationConfigRuleName): GetOrganizationCustomRulePolicyRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationCustomRulePolicyRequest]
  }
  
  extension [Self <: GetOrganizationCustomRulePolicyRequest](x: Self) {
    
    inline def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = StObject.set(x, "OrganizationConfigRuleName", value.asInstanceOf[js.Any])
  }
}
