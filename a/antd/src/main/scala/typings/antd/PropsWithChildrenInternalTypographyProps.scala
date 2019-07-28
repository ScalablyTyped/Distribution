package typings.antd

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.PropsWithChildren<antd.antd/lib/typography/Typography.InternalTypographyProps> */
trait PropsWithChildrenInternalTypographyProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var setContentRef: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PropsWithChildrenInternalTypographyProps {
  @scala.inline
  def apply(
    `aria-label`: String = null,
    children: ReactNode = null,
    className: String = null,
    component: String = null,
    id: String = null,
    prefixCls: String = null,
    setContentRef: /* node */ HTMLElement => Unit = null,
    style: CSSProperties = null
  ): PropsWithChildrenInternalTypographyProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component)
    if (id != null) __obj.updateDynamic("id")(id)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (setContentRef != null) __obj.updateDynamic("setContentRef")(js.Any.fromFunction1(setContentRef))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PropsWithChildrenInternalTypographyProps]
  }
}

