package typings
package antdLib.libMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var getContainer: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  var maxCount: js.UndefOr[scala.Double] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    getContainer: () => stdLib.HTMLElement = null,
    maxCount: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null,
    top: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[ConfigOptions]
  }
}

