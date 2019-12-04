package typings.antd.libUnderscoreUtilScrollToMod

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions extends js.Object {
  /** Scroll end callback */
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  /** Animation duration, default as 450 */
  var duration: js.UndefOr[Double] = js.undefined
  /** Scroll container, default as window */
  var getContainer: js.UndefOr[js.Function0[HTMLElement | Window]] = js.undefined
}

object ScrollToOptions {
  @scala.inline
  def apply(
    callback: () => _ = null,
    duration: Int | Double = null,
    getContainer: () => HTMLElement | Window = null
  ): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    __obj.asInstanceOf[ScrollToOptions]
  }
}

