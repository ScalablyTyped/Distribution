package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationProfileRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * The ID of the configuration profile.
    */
  var ConfigurationProfileId: Id
  
  /**
    * A description of the configuration profile.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * The name of the configuration profile.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Name] = js.undefined
  
  /**
    * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
    */
  var RetrievalRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * A list of methods for validating the configuration.
    */
  var Validators: js.UndefOr[ValidatorList] = js.undefined
}
object UpdateConfigurationProfileRequest {
  
  inline def apply(ApplicationId: Id, ConfigurationProfileId: Id): UpdateConfigurationProfileRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationProfileRequest]
  }
  
  extension [Self <: UpdateConfigurationProfileRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRetrievalRoleArn(value: RoleArn): Self = StObject.set(x, "RetrievalRoleArn", value.asInstanceOf[js.Any])
    
    inline def setRetrievalRoleArnUndefined: Self = StObject.set(x, "RetrievalRoleArn", js.undefined)
    
    inline def setValidators(value: ValidatorList): Self = StObject.set(x, "Validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "Validators", js.undefined)
    
    inline def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "Validators", js.Array(value*))
  }
}
