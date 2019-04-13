package typings
package awsDashSdkLib.clientsMediaconvertMod

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
  def apply(HeightInPx: js.UndefOr[__integer] = js.undefined, WidthInPx: js.UndefOr[__integer] = js.undefined): VideoDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(HeightInPx)) __obj.updateDynamic("HeightInPx")(HeightInPx)
    if (!js.isUndefined(WidthInPx)) __obj.updateDynamic("WidthInPx")(WidthInPx)
    __obj.asInstanceOf[VideoDetail]
  }
}

