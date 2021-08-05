package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System statistics.
  *
  * If {@link getSystemStats} is called successfully, this interface provides the system statistics.
  */
trait SystemStats extends StObject {
  
  /** Battery level of the system (%). */
  var BatteryLevel: string
}
object SystemStats {
  
  inline def apply(): SystemStats = {
    val __obj = js.Dynamic.literal(BatteryLevel = "string")
    __obj.asInstanceOf[SystemStats]
  }
  
  extension [Self <: SystemStats](x: Self) {
    
    inline def setBatteryLevel(value: string): Self = StObject.set(x, "BatteryLevel", value.asInstanceOf[js.Any])
  }
}
