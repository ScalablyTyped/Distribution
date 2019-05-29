package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/typography/Typography.InternalTypographyProps> */
trait PartialInternalTypographyProps extends js.Object {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var setContentRef: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object PartialInternalTypographyProps {
  @scala.inline
  def apply(
    `aria-label`: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    component: java.lang.String = null,
    id: java.lang.String = null,
    prefixCls: java.lang.String = null,
    setContentRef: /* node */ stdLib.HTMLElement => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null
  ): PartialInternalTypographyProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component)
    if (id != null) __obj.updateDynamic("id")(id)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (setContentRef != null) __obj.updateDynamic("setContentRef")(js.Any.fromFunction1(setContentRef))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PartialInternalTypographyProps]
  }
}

