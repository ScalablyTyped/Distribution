package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDetail extends js.Object {
  /**
    * Duration in milliseconds
    */
  var DurationInMs: js.UndefOr[__integer] = js.undefined
  /**
    * Contains details about the output's video stream
    */
  var VideoDetails: js.UndefOr[VideoDetail] = js.undefined
}

object OutputDetail {
  @scala.inline
  def apply(DurationInMs: Int | Double = null, VideoDetails: VideoDetail = null): OutputDetail = {
    val __obj = js.Dynamic.literal()
    if (DurationInMs != null) __obj.updateDynamic("DurationInMs")(DurationInMs.asInstanceOf[js.Any])
    if (VideoDetails != null) __obj.updateDynamic("VideoDetails")(VideoDetails)
    __obj.asInstanceOf[OutputDetail]
  }
}

