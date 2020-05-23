package typings.aliApp.my

import typings.aliApp.aliAppStrings.exception
import typings.aliApp.aliAppStrings.fail
import typings.aliApp.aliAppStrings.none
import typings.aliApp.aliAppStrings.success
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
    duration: js.UndefOr[Double] = js.undefined,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null,
    `type`: none | success | fail | exception | String = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
}

