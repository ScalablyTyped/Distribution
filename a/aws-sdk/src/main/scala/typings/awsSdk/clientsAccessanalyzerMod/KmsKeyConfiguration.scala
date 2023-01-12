package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmsKeyConfiguration extends StObject {
  
  /**
    * A list of proposed grant configurations for the KMS key. If the proposed grant configuration is for an existing key, the access preview uses the proposed list of grant configurations in place of the existing grants. Otherwise, the access preview uses the existing grants for the key.
    */
  var grants: js.UndefOr[KmsGrantConfigurationsList] = js.undefined
  
  /**
    * Resource policy configuration for the KMS key. The only valid value for the name of the key policy is default. For more information, see Default key policy.
    */
  var keyPolicies: js.UndefOr[KmsKeyPoliciesMap] = js.undefined
}
object KmsKeyConfiguration {
  
  inline def apply(): KmsKeyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KmsKeyConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmsKeyConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGrants(value: KmsGrantConfigurationsList): Self = StObject.set(x, "grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "grants", js.undefined)
    
    inline def setGrantsVarargs(value: KmsGrantConfiguration*): Self = StObject.set(x, "grants", js.Array(value*))
    
    inline def setKeyPolicies(value: KmsKeyPoliciesMap): Self = StObject.set(x, "keyPolicies", value.asInstanceOf[js.Any])
    
    inline def setKeyPoliciesUndefined: Self = StObject.set(x, "keyPolicies", js.undefined)
  }
}
