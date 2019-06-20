package typings
package antdLib.libBadgeScrollNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollNumberProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[java.lang.String] = js.undefined
  var count: js.UndefOr[java.lang.String | scala.Double | scala.Null] = js.undefined
  var displayComponent: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
  var onAnimated: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: js.UndefOr[java.lang.String | scala.Double | scala.Null] = js.undefined
}

object ScrollNumberProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    component: java.lang.String = null,
    count: java.lang.String | scala.Double = null,
    displayComponent: reactLib.reactMod.ReactElement = null,
    onAnimated: js.Function = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: java.lang.String | scala.Double = null
  ): ScrollNumberProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (displayComponent != null) __obj.updateDynamic("displayComponent")(displayComponent)
    if (onAnimated != null) __obj.updateDynamic("onAnimated")(onAnimated)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollNumberProps]
  }
}

