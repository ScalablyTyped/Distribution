package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string
  
  /**
    * Required. The base64-encoded XML configuration.
    */
  var Data: string
  
  /**
    * The description of the configuration.
    */
  var Description: js.UndefOr[string] = js.undefined
}
object UpdateConfigurationRequest {
  
  inline def apply(ConfigurationId: string, Data: string): UpdateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationRequest]
  }
  
  extension [Self <: UpdateConfigurationRequest](x: Self) {
    
    inline def setConfigurationId(value: string): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setData(value: string): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
