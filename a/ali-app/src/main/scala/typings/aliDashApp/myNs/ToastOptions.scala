package typings.aliDashApp.myNs

import typings.aliDashApp.aliDashAppStrings.exception
import typings.aliDashApp.aliDashAppStrings.fail
import typings.aliDashApp.aliDashAppStrings.none
import typings.aliDashApp.aliDashAppStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 文字内容
  		 */
  var content: String
  /**
  		 * 显示时长，单位为 ms，默认 2000
  		 */
  var duration: js.UndefOr[Double] = js.undefined
  /** toast 类型，展示相应图标，默认 none，支持 success / fail / exception / none’。其中 exception 类型必须传文字信息 */
  var `type`: js.UndefOr[none | success | fail | exception | String] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    content: String,
    complete: /* res */ js.Any => Unit = null,
    duration: Int | Double = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null,
    `type`: none | success | fail | exception | String = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(content = content)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
}

