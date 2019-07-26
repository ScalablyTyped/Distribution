package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scte35ReturnToNetworkScheduleActionSettings extends js.Object {
  /**
    * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
    */
  var SpliceEventId: __longMin0Max4294967295
}

object Scte35ReturnToNetworkScheduleActionSettings {
  @scala.inline
  def apply(SpliceEventId: __longMin0Max4294967295): Scte35ReturnToNetworkScheduleActionSettings = {
    val __obj = js.Dynamic.literal(SpliceEventId = SpliceEventId)
  
    __obj.asInstanceOf[Scte35ReturnToNetworkScheduleActionSettings]
  }
}

