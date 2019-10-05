package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoDetail extends js.Object {
  /**
    * Height in pixels for the output
    */
  var HeightInPx: js.UndefOr[__integer] = js.undefined
  /**
    * Width in pixels for the output
    */
  var WidthInPx: js.UndefOr[__integer] = js.undefined
}

object VideoDetail {
  @scala.inline
  def apply(HeightInPx: Int | Double = null, WidthInPx: Int | Double = null): VideoDetail = {
    val __obj = js.Dynamic.literal()
    if (HeightInPx != null) __obj.updateDynamic("HeightInPx")(HeightInPx.asInstanceOf[js.Any])
    if (WidthInPx != null) __obj.updateDynamic("WidthInPx")(WidthInPx.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDetail]
  }
}

