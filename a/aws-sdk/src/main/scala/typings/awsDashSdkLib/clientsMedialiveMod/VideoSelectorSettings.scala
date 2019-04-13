package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSelectorSettings extends js.Object {
  var VideoSelectorPid: js.UndefOr[VideoSelectorPid] = js.undefined
  var VideoSelectorProgramId: js.UndefOr[VideoSelectorProgramId] = js.undefined
}

object VideoSelectorSettings {
  @scala.inline
  def apply(VideoSelectorPid: VideoSelectorPid = null, VideoSelectorProgramId: VideoSelectorProgramId = null): VideoSelectorSettings = {
    val __obj = js.Dynamic.literal()
    if (VideoSelectorPid != null) __obj.updateDynamic("VideoSelectorPid")(VideoSelectorPid)
    if (VideoSelectorProgramId != null) __obj.updateDynamic("VideoSelectorProgramId")(VideoSelectorProgramId)
    __obj.asInstanceOf[VideoSelectorSettings]
  }
}

