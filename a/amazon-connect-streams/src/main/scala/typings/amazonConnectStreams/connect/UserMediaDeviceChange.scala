package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMediaDeviceChange extends StObject {
  
  /** A value indicating the id of the media device. */
  val deviceId: String
}
object UserMediaDeviceChange {
  
  inline def apply(deviceId: String): UserMediaDeviceChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMediaDeviceChange]
  }
  
  extension [Self <: UserMediaDeviceChange](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
  }
}
