package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServerStrategiesRequest extends StObject {
  
  /**
    *  The ID of the server. 
    */
  var serverId: ServerId
}
object GetServerStrategiesRequest {
  
  inline def apply(serverId: ServerId): GetServerStrategiesRequest = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerStrategiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServerStrategiesRequest] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
  }
}
