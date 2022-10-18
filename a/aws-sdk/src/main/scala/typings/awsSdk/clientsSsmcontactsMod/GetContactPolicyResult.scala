package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactPolicyResult extends StObject {
  
  /**
    * The ARN of the contact or escalation plan.
    */
  var ContactArn: js.UndefOr[SsmContactsArn] = js.undefined
  
  /**
    * Details about the resource policy attached to the contact or escalation plan.
    */
  var Policy: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.Policy] = js.undefined
}
object GetContactPolicyResult {
  
  inline def apply(): GetContactPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactPolicyResult]
  }
  
  extension [Self <: GetContactPolicyResult](x: Self) {
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setContactArnUndefined: Self = StObject.set(x, "ContactArn", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
