package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPolicyDetails extends StObject {
  
  /**
    * The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is false.
    */
  var EnableDebugLogDelivery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. For more information about Guard, see the Guard GitHub Repository.
    */
  var PolicyRuntime: typings.awsSdk.clientsConfigserviceMod.PolicyRuntime
  
  /**
    * The policy definition containing the logic for your Config Custom Policy rule.
    */
  var PolicyText: typings.awsSdk.clientsConfigserviceMod.PolicyText
}
object CustomPolicyDetails {
  
  inline def apply(PolicyRuntime: PolicyRuntime, PolicyText: PolicyText): CustomPolicyDetails = {
    val __obj = js.Dynamic.literal(PolicyRuntime = PolicyRuntime.asInstanceOf[js.Any], PolicyText = PolicyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPolicyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPolicyDetails] (val x: Self) extends AnyVal {
    
    inline def setEnableDebugLogDelivery(value: Boolean): Self = StObject.set(x, "EnableDebugLogDelivery", value.asInstanceOf[js.Any])
    
    inline def setEnableDebugLogDeliveryUndefined: Self = StObject.set(x, "EnableDebugLogDelivery", js.undefined)
    
    inline def setPolicyRuntime(value: PolicyRuntime): Self = StObject.set(x, "PolicyRuntime", value.asInstanceOf[js.Any])
    
    inline def setPolicyText(value: PolicyText): Self = StObject.set(x, "PolicyText", value.asInstanceOf[js.Any])
  }
}
