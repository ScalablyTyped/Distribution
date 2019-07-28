package typings.antd

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Validator
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/typography/Typography.InternalTypographyProps> */
trait WeakValidationMapInternalTypographyProps extends js.Object {
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var component: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var setContentRef: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, Unit]) | Null]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
}

object WeakValidationMapInternalTypographyProps {
  @scala.inline
  def apply(
    `aria-label`: Validator[js.UndefOr[Null | String]] = null,
    children: Validator[js.UndefOr[Null | ReactNode]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    component: Validator[js.UndefOr[Null | String]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    setContentRef: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, Unit]) | Null]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null
  ): WeakValidationMapInternalTypographyProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component)
    if (id != null) __obj.updateDynamic("id")(id)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (setContentRef != null) __obj.updateDynamic("setContentRef")(setContentRef)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[WeakValidationMapInternalTypographyProps]
  }
}

