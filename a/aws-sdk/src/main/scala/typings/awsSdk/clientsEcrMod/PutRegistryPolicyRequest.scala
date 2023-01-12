package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRegistryPolicyRequest extends StObject {
  
  /**
    * The JSON policy text to apply to your registry. The policy text follows the same format as IAM policy text. For more information, see Registry permissions in the Amazon Elastic Container Registry User Guide.
    */
  var policyText: RegistryPolicyText
}
object PutRegistryPolicyRequest {
  
  inline def apply(policyText: RegistryPolicyText): PutRegistryPolicyRequest = {
    val __obj = js.Dynamic.literal(policyText = policyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRegistryPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRegistryPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicyText(value: RegistryPolicyText): Self = StObject.set(x, "policyText", value.asInstanceOf[js.Any])
  }
}
