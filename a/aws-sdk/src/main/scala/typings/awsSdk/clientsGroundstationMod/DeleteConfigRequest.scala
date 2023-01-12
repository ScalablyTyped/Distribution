package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigRequest extends StObject {
  
  /**
    * UUID of a Config.
    */
  var configId: Uuid
  
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType
}
object DeleteConfigRequest {
  
  inline def apply(configId: Uuid, configType: ConfigCapabilityType): DeleteConfigRequest = {
    val __obj = js.Dynamic.literal(configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigId(value: Uuid): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
  }
}
