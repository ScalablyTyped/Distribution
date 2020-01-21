package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNavigationBarOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 导航栏背景色，支持十六进制颜色值 */
  var backgroundColor: String
  /** 导航栏底部边框颜色，支持十六进制颜色值。若设置了 backgroundColor，则borderBottomColor 不会生效，默认会和 backgroundColor 颜色一样 */
  var borderBottomColor: String
  /** 图片连接地址，必须是https，请使用3x高清图片。若设置了image则title参数失效 */
  var image: String
  /** 是否重置导航栏为支付宝默认配色，默认 false */
  var reset: Boolean
  /** 页面标题 */
  var title: String
}

object SetNavigationBarOptions {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderBottomColor: String,
    image: String,
    reset: Boolean,
    title: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): SetNavigationBarOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetNavigationBarOptions]
  }
}

