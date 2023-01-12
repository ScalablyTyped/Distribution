package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVaultAccessPolicyOutput extends StObject {
  
  /**
    * Contains the returned vault access policy as a JSON string.
    */
  var policy: js.UndefOr[VaultAccessPolicy] = js.undefined
}
object GetVaultAccessPolicyOutput {
  
  inline def apply(): GetVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVaultAccessPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVaultAccessPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: VaultAccessPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
