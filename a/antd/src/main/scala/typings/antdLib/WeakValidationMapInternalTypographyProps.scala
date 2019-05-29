package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/typography/Typography.InternalTypographyProps> */
trait WeakValidationMapInternalTypographyProps extends js.Object {
  var `aria-label`: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var className: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var id: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var prefixCls: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var setContentRef: js.UndefOr[
    reactLib.reactMod.Validator[
      js.UndefOr[(js.Function1[/* node */ stdLib.HTMLElement, scala.Unit]) | scala.Null]
    ]
  ] = js.undefined
  var style: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]]
  ] = js.undefined
}

object WeakValidationMapInternalTypographyProps {
  @scala.inline
  def apply(
    `aria-label`: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    children: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    className: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    component: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    id: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    prefixCls: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    setContentRef: reactLib.reactMod.Validator[
      js.UndefOr[(js.Function1[/* node */ stdLib.HTMLElement, scala.Unit]) | scala.Null]
    ] = null,
    style: reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]] = null
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

