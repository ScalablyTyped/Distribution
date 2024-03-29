package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCodeSigningConfigRequest extends StObject {
  
  /**
    * Signing profiles for this code signing configuration.
    */
  var AllowedPublishers: typings.awsSdk.clientsLambdaMod.AllowedPublishers
  
  /**
    * The code signing policies define the actions to take if the validation checks fail. 
    */
  var CodeSigningPolicies: js.UndefOr[typings.awsSdk.clientsLambdaMod.CodeSigningPolicies] = js.undefined
  
  /**
    * Descriptive name for this code signing configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsLambdaMod.Description] = js.undefined
}
object CreateCodeSigningConfigRequest {
  
  inline def apply(AllowedPublishers: AllowedPublishers): CreateCodeSigningConfigRequest = {
    val __obj = js.Dynamic.literal(AllowedPublishers = AllowedPublishers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCodeSigningConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCodeSigningConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowedPublishers(value: AllowedPublishers): Self = StObject.set(x, "AllowedPublishers", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningPolicies(value: CodeSigningPolicies): Self = StObject.set(x, "CodeSigningPolicies", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningPoliciesUndefined: Self = StObject.set(x, "CodeSigningPolicies", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
