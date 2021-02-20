package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System statistics.
  *
  * If {@link getSystemStats} is called successfully, this interface provides the system statistics.
  */
@js.native
trait SystemStats extends StObject {
  
  /** Battery level of the system (%). */
  var BatteryLevel: string = js.native
}
object SystemStats {
  
  @scala.inline
  def apply(BatteryLevel: string): SystemStats = {
    val __obj = js.Dynamic.literal(BatteryLevel = BatteryLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemStats]
  }
  
  @scala.inline
  implicit class SystemStatsMutableBuilder[Self <: SystemStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatteryLevel(value: string): Self = StObject.set(x, "BatteryLevel", value.asInstanceOf[js.Any])
  }
}
