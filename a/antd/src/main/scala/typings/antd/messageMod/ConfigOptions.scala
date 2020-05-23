package typings.antd.messageMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var maxCount: js.UndefOr[Double] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    getContainer: () => HTMLElement = null,
    maxCount: js.UndefOr[Double] = js.undefined,
    prefixCls: String = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    transitionName: String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (!js.isUndefined(maxCount)) __obj.updateDynamic("maxCount")(maxCount.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

