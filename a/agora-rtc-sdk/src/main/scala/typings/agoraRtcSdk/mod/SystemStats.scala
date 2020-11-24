package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System statistics.
  *
  * If {@link getSystemStats} is called successfully, this interface provides the system statistics.
  */
@js.native
trait SystemStats extends js.Object {
  
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
  implicit class SystemStatsOps[Self <: SystemStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatteryLevel(value: string): Self = this.set("BatteryLevel", value.asInstanceOf[js.Any])
  }
}
