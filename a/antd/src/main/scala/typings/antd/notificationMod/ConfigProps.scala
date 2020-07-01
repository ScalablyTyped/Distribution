package typings.antd.notificationMod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProps extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var closeIcon: js.UndefOr[ReactNode] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var placement: js.UndefOr[NotificationPlacement] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object ConfigProps {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    closeIcon: ReactNode = null,
    duration: js.UndefOr[Double] = js.undefined,
    getContainer: () => HTMLElement = null,
    placement: NotificationPlacement = null,
    prefixCls: String = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): ConfigProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigProps]
  }
}

