package typings.antd.scrollToMod

import typings.std.Document
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
  var getContainer: js.UndefOr[js.Function0[HTMLElement | Window | Document]] = js.undefined
}

object ScrollToOptions {
  @scala.inline
  def apply(
    callback: () => _ = null,
    duration: js.UndefOr[Double] = js.undefined,
    getContainer: () => HTMLElement | Window | Document = null
  ): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    __obj.asInstanceOf[ScrollToOptions]
  }
}

