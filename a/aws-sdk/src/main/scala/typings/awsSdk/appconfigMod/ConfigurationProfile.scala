package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationProfile extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The configuration profile description.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.undefined
  
  /**
    * The configuration profile ID.
    */
  var Id: js.UndefOr[typings.awsSdk.appconfigMod.Id] = js.undefined
  
  /**
    * The URI location of the configuration.
    */
  var LocationUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The name of the configuration profile.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.undefined
  
  /**
    * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
    */
  var RetrievalRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * A list of methods for validating the configuration.
    */
  var Validators: js.UndefOr[ValidatorList] = js.undefined
}
object ConfigurationProfile {
  
  inline def apply(): ConfigurationProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationProfile]
  }
  
  extension [Self <: ConfigurationProfile](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLocationUri(value: Uri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRetrievalRoleArn(value: RoleArn): Self = StObject.set(x, "RetrievalRoleArn", value.asInstanceOf[js.Any])
    
    inline def setRetrievalRoleArnUndefined: Self = StObject.set(x, "RetrievalRoleArn", js.undefined)
    
    inline def setValidators(value: ValidatorList): Self = StObject.set(x, "Validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "Validators", js.undefined)
    
    inline def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "Validators", js.Array(value :_*))
  }
}
