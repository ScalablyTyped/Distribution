package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupRuleDescription extends StObject {
  
  /**
    * The description of the security group rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the security group rule.
    */
  var SecurityGroupRuleId: js.UndefOr[String] = js.undefined
}
object SecurityGroupRuleDescription {
  
  inline def apply(): SecurityGroupRuleDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupRuleDescription]
  }
  
  extension [Self <: SecurityGroupRuleDescription](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSecurityGroupRuleId(value: String): Self = StObject.set(x, "SecurityGroupRuleId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleIdUndefined: Self = StObject.set(x, "SecurityGroupRuleId", js.undefined)
  }
}
