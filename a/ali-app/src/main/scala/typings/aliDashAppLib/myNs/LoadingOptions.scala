package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * loading的文字内容
  		 */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 延迟显示，单位 ms，默认 0。如果在此时间之前调用了 my.hideLoading 则不会显示
  		 */
  var delay: js.UndefOr[scala.Double] = js.undefined
}

object LoadingOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => scala.Unit = null,
    content: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (content != null) __obj.updateDynamic("content")(content)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[LoadingOptions]
  }
}

