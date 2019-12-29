package typings.antDashDesignDashPro.libLoginMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultActiveKey: js.UndefOr[String] = js.undefined
  var onSubmit: js.UndefOr[js.Function2[/* error */ js.Any, /* values */ js.Any, Unit]] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LoginProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultActiveKey: String = null,
    onSubmit: (/* error */ js.Any, /* values */ js.Any) => Unit = null,
    onTabChange: /* key */ String => Unit = null,
    style: CSSProperties = null
  ): LoginProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction2(onSubmit))
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginProps]
  }
}

