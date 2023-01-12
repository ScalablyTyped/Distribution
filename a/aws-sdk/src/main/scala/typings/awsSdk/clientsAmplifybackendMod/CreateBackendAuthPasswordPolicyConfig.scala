package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendAuthPasswordPolicyConfig extends StObject {
  
  /**
    * Additional constraints for the password used to access the backend of your Amplify project.
    */
  var AdditionalConstraints: js.UndefOr[ListOfAdditionalConstraintsElement] = js.undefined
  
  /**
    * The minimum length of the password used to access the backend of your Amplify project.
    */
  var MinimumLength: double
}
object CreateBackendAuthPasswordPolicyConfig {
  
  inline def apply(MinimumLength: double): CreateBackendAuthPasswordPolicyConfig = {
    val __obj = js.Dynamic.literal(MinimumLength = MinimumLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendAuthPasswordPolicyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBackendAuthPasswordPolicyConfig] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConstraints(value: ListOfAdditionalConstraintsElement): Self = StObject.set(x, "AdditionalConstraints", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConstraintsUndefined: Self = StObject.set(x, "AdditionalConstraints", js.undefined)
    
    inline def setAdditionalConstraintsVarargs(value: AdditionalConstraintsElement*): Self = StObject.set(x, "AdditionalConstraints", js.Array(value*))
    
    inline def setMinimumLength(value: double): Self = StObject.set(x, "MinimumLength", value.asInstanceOf[js.Any])
  }
}
