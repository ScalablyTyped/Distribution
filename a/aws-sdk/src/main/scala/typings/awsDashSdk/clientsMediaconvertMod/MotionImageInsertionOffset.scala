package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionImageInsertionOffset extends js.Object {
  /**
    * Set the distance, in pixels, between the overlay and the left edge of the video frame.
    */
  var ImageX: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Set the distance, in pixels, between the overlay and the top edge of the video frame.
    */
  var ImageY: js.UndefOr[__integerMin0Max2147483647] = js.undefined
}

object MotionImageInsertionOffset {
  @scala.inline
  def apply(
    ImageX: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    ImageY: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  ): MotionImageInsertionOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ImageX)) __obj.updateDynamic("ImageX")(ImageX)
    if (!js.isUndefined(ImageY)) __obj.updateDynamic("ImageY")(ImageY)
    __obj.asInstanceOf[MotionImageInsertionOffset]
  }
}

