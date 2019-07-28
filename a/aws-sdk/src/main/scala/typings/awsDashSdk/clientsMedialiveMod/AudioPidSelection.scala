package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioPidSelection extends js.Object {
  /**
    * Selects a specific PID from within a source.
    */
  var Pid: __integerMin0Max8191
}

object AudioPidSelection {
  @scala.inline
  def apply(Pid: __integerMin0Max8191): AudioPidSelection = {
    val __obj = js.Dynamic.literal(Pid = Pid)
  
    __obj.asInstanceOf[AudioPidSelection]
  }
}

