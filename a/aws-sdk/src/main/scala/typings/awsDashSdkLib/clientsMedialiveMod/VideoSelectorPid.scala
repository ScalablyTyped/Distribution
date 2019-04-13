package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSelectorPid extends js.Object {
  /**
    * Selects a specific PID from within a video source.
    */
  var Pid: js.UndefOr[__integerMin0Max8191] = js.undefined
}

object VideoSelectorPid {
  @scala.inline
  def apply(Pid: js.UndefOr[__integerMin0Max8191] = js.undefined): VideoSelectorPid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Pid)) __obj.updateDynamic("Pid")(Pid)
    __obj.asInstanceOf[VideoSelectorPid]
  }
}

