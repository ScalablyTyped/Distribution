package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationProfileSummary extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  
  /**
    * The ID of the configuration profile.
    */
  var Id: js.UndefOr[typings.awsSdk.appconfigMod.Id] = js.native
  
  /**
    * The URI location of the configuration.
    */
  var LocationUri: js.UndefOr[Uri] = js.native
  
  /**
    * The name of the configuration profile.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.native
  
  /**
    * The types of validators in the configuration profile.
    */
  var ValidatorTypes: js.UndefOr[ValidatorTypeList] = js.native
}
object ConfigurationProfileSummary {
  
  @scala.inline
  def apply(): ConfigurationProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationProfileSummary]
  }
  
  @scala.inline
  implicit class ConfigurationProfileSummaryMutableBuilder[Self <: ConfigurationProfileSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLocationUri(value: Uri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValidatorTypes(value: ValidatorTypeList): Self = StObject.set(x, "ValidatorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorTypesUndefined: Self = StObject.set(x, "ValidatorTypes", js.undefined)
    
    @scala.inline
    def setValidatorTypesVarargs(value: ValidatorType*): Self = StObject.set(x, "ValidatorTypes", js.Array(value :_*))
  }
}
