package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd-mobile.antd-mobile/lib/toast.IToastConfig> */
trait PartialIToastConfig extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
}

object PartialIToastConfig {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined, mask: js.UndefOr[Boolean] = js.undefined): PartialIToastConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIToastConfig]
  }
}

