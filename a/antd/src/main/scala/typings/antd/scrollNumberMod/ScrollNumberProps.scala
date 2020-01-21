package typings.antd.scrollNumberMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollNumberProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[String | Double | Null] = js.undefined
  var displayComponent: js.UndefOr[ReactElement] = js.undefined
  var onAnimated: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String | Double | Null] = js.undefined
}

object ScrollNumberProps {
  @scala.inline
  def apply(
    className: String = null,
    component: String = null,
    count: String | Double = null,
    displayComponent: ReactElement = null,
    onAnimated: js.Function = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: String | Double = null
  ): ScrollNumberProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (displayComponent != null) __obj.updateDynamic("displayComponent")(displayComponent.asInstanceOf[js.Any])
    if (onAnimated != null) __obj.updateDynamic("onAnimated")(onAnimated.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollNumberProps]
  }
}

