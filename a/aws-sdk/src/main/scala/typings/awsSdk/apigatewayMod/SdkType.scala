package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkType extends StObject {
  
  /**
    * A list of configuration properties of an SdkType.
    */
  var configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty] = js.undefined
  
  /**
    * The description of an SdkType.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The user-friendly name of an SdkType instance.
    */
  var friendlyName: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of an SdkType instance.
    */
  var id: js.UndefOr[String] = js.undefined
}
object SdkType {
  
  @scala.inline
  def apply(): SdkType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkType]
  }
  
  @scala.inline
  implicit class SdkTypeMutableBuilder[Self <: SdkType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationProperties(value: ListOfSdkConfigurationProperty): Self = StObject.set(x, "configurationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationPropertiesUndefined: Self = StObject.set(x, "configurationProperties", js.undefined)
    
    @scala.inline
    def setConfigurationPropertiesVarargs(value: SdkConfigurationProperty*): Self = StObject.set(x, "configurationProperties", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
