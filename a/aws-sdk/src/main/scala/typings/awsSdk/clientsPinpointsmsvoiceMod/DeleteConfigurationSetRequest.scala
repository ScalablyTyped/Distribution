package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationSetRequest extends StObject {
  
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String
}
object DeleteConfigurationSetRequest {
  
  inline def apply(ConfigurationSetName: _String): DeleteConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetRequest]
  }
  
  extension [Self <: DeleteConfigurationSetRequest](x: Self) {
    
    inline def setConfigurationSetName(value: _String): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
