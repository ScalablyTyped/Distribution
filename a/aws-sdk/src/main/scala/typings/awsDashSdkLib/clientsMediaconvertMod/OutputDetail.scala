package typings
package awsDashSdkLib.clientsMediaconvertMod

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
  def apply(DurationInMs: js.UndefOr[__integer] = js.undefined, VideoDetails: VideoDetail = null): OutputDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DurationInMs)) __obj.updateDynamic("DurationInMs")(DurationInMs)
    if (VideoDetails != null) __obj.updateDynamic("VideoDetails")(VideoDetails)
    __obj.asInstanceOf[OutputDetail]
  }
}

