package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationProfileSummary extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The ID of the configuration profile.
    */
  var Id: js.UndefOr[typings.awsSdk.appconfigMod.Id] = js.undefined
  
  /**
    * The URI location of the configuration.
    */
  var LocationUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The name of the configuration profile.
    */
  var Name: js.UndefOr[LongName] = js.undefined
  
  /**
    * The type of configurations contained in the profile. AppConfig supports feature flags and freeform configurations. We recommend you create feature flag configurations to enable or disable new features and freeform configurations to distribute configurations to an application. When calling this API, enter one of the following values for Type:  AWS.AppConfig.FeatureFlags   AWS.Freeform 
    */
  var Type: js.UndefOr[ConfigurationProfileType] = js.undefined
  
  /**
    * The types of validators in the configuration profile.
    */
  var ValidatorTypes: js.UndefOr[ValidatorTypeList] = js.undefined
}
object ConfigurationProfileSummary {
  
  inline def apply(): ConfigurationProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationProfileSummary]
  }
  
  extension [Self <: ConfigurationProfileSummary](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLocationUri(value: Uri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    inline def setName(value: LongName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ConfigurationProfileType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValidatorTypes(value: ValidatorTypeList): Self = StObject.set(x, "ValidatorTypes", value.asInstanceOf[js.Any])
    
    inline def setValidatorTypesUndefined: Self = StObject.set(x, "ValidatorTypes", js.undefined)
    
    inline def setValidatorTypesVarargs(value: ValidatorType*): Self = StObject.set(x, "ValidatorTypes", js.Array(value*))
  }
}
