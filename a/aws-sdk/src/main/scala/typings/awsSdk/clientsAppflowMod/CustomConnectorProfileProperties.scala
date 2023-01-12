package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomConnectorProfileProperties extends StObject {
  
  var oAuth2Properties: js.UndefOr[OAuth2Properties] = js.undefined
  
  /**
    * A map of properties that are required to create a profile for the custom connector.
    */
  var profileProperties: js.UndefOr[ProfilePropertiesMap] = js.undefined
}
object CustomConnectorProfileProperties {
  
  inline def apply(): CustomConnectorProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomConnectorProfileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    inline def setOAuth2Properties(value: OAuth2Properties): Self = StObject.set(x, "oAuth2Properties", value.asInstanceOf[js.Any])
    
    inline def setOAuth2PropertiesUndefined: Self = StObject.set(x, "oAuth2Properties", js.undefined)
    
    inline def setProfileProperties(value: ProfilePropertiesMap): Self = StObject.set(x, "profileProperties", value.asInstanceOf[js.Any])
    
    inline def setProfilePropertiesUndefined: Self = StObject.set(x, "profileProperties", js.undefined)
  }
}
