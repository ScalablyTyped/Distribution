package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkConfigurationProperty extends StObject {
  
  /**
    * The default value of an SdkType configuration property.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * The description of an SdkType configuration property.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The user-friendly name of an SdkType configuration property.
    */
  var friendlyName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a an SdkType configuration property.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean flag of an SdkType configuration property to indicate if the associated SDK configuration property is required (true) or not (false).
    */
  var required: js.UndefOr[Boolean] = js.undefined
}
object SdkConfigurationProperty {
  
  @scala.inline
  def apply(): SdkConfigurationProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkConfigurationProperty]
  }
  
  @scala.inline
  implicit class SdkConfigurationPropertyMutableBuilder[Self <: SdkConfigurationProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
