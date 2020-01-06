package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedModeScheduleActionStartSettings extends js.Object {
  /**
    * Start time for the action to start in the channel. (Not the time for the action to be added to the schedule: actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for "UTC format".
    */
  var Time: __string = js.native
}

object FixedModeScheduleActionStartSettings {
  @scala.inline
  def apply(Time: __string): FixedModeScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal(Time = Time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FixedModeScheduleActionStartSettings]
  }
}

