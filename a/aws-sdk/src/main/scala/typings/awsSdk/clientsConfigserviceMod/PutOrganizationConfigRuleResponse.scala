package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutOrganizationConfigRuleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an organization Config rule.
    */
  var OrganizationConfigRuleArn: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object PutOrganizationConfigRuleResponse {
  
  inline def apply(): PutOrganizationConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOrganizationConfigRuleResponse]
  }
  
  extension [Self <: PutOrganizationConfigRuleResponse](x: Self) {
    
    inline def setOrganizationConfigRuleArn(value: StringWithCharLimit256): Self = StObject.set(x, "OrganizationConfigRuleArn", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConfigRuleArnUndefined: Self = StObject.set(x, "OrganizationConfigRuleArn", js.undefined)
  }
}
