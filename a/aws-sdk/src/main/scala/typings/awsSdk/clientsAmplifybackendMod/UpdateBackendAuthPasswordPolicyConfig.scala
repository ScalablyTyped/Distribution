package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendAuthPasswordPolicyConfig extends StObject {
  
  /**
    * Describes additional constraints on password requirements to sign in to the auth resource, configured as a part of your Amplify project.
    */
  var AdditionalConstraints: js.UndefOr[ListOfAdditionalConstraintsElement] = js.undefined
  
  /**
    * Describes the minimum length of the password required to sign in to the auth resource, configured as a part of your Amplify project.
    */
  var MinimumLength: js.UndefOr[double] = js.undefined
}
object UpdateBackendAuthPasswordPolicyConfig {
  
  inline def apply(): UpdateBackendAuthPasswordPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBackendAuthPasswordPolicyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBackendAuthPasswordPolicyConfig] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConstraints(value: ListOfAdditionalConstraintsElement): Self = StObject.set(x, "AdditionalConstraints", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConstraintsUndefined: Self = StObject.set(x, "AdditionalConstraints", js.undefined)
    
    inline def setAdditionalConstraintsVarargs(value: AdditionalConstraintsElement*): Self = StObject.set(x, "AdditionalConstraints", js.Array(value*))
    
    inline def setMinimumLength(value: double): Self = StObject.set(x, "MinimumLength", value.asInstanceOf[js.Any])
    
    inline def setMinimumLengthUndefined: Self = StObject.set(x, "MinimumLength", js.undefined)
  }
}
