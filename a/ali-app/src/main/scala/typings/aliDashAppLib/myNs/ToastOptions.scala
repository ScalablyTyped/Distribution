package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 文字内容
  		 */
  var content: java.lang.String
  /**
  		 * 显示时长，单位为 ms，默认 2000
  		 */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** toast 类型，展示相应图标，默认 none，支持 success / fail / exception / none’。其中 exception 类型必须传文字信息 */
  var `type`: js.UndefOr[
    aliDashAppLib.aliDashAppLibStrings.none | aliDashAppLib.aliDashAppLibStrings.success | aliDashAppLib.aliDashAppLibStrings.fail | aliDashAppLib.aliDashAppLibStrings.exception | java.lang.String
  ] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    content: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    duration: scala.Int | scala.Double = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null,
    `type`: aliDashAppLib.aliDashAppLibStrings.none | aliDashAppLib.aliDashAppLibStrings.success | aliDashAppLib.aliDashAppLibStrings.fail | aliDashAppLib.aliDashAppLibStrings.exception | java.lang.String = null
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

