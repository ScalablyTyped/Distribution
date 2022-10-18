package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigRequest extends StObject {
  
  /**
    * UUID of a Config.
    */
  var configId: String
  
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType
}
object DeleteConfigRequest {
  
  inline def apply(configId: String, configType: ConfigCapabilityType): DeleteConfigRequest = {
    val __obj = js.Dynamic.literal(configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigRequest]
  }
  
  extension [Self <: DeleteConfigRequest](x: Self) {
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
  }
}
