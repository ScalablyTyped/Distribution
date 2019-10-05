package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeInfo extends js.Object {
  /**
    * A boolean value indicating if the resize operation can be cancelled.
    */
  var AllowCancelResize: js.UndefOr[Boolean] = js.undefined
  /**
    * Returns the value ClassicResize.
    */
  var ResizeType: js.UndefOr[String] = js.undefined
}

object ResizeInfo {
  @scala.inline
  def apply(AllowCancelResize: js.UndefOr[scala.Boolean] = js.undefined, ResizeType: String = null): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowCancelResize)) __obj.updateDynamic("AllowCancelResize")(AllowCancelResize)
    if (ResizeType != null) __obj.updateDynamic("ResizeType")(ResizeType)
    __obj.asInstanceOf[ResizeInfo]
  }
}

