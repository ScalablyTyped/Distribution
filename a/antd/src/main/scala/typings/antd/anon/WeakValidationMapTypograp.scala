package typings.antd.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/typography/Typography.TypographyProps> */
trait WeakValidationMapTypograp extends js.Object {
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
}

object WeakValidationMapTypograp {
  @scala.inline
  def apply(
    `aria-label`: Validator[js.UndefOr[Null | String]] = null,
    children: Validator[js.UndefOr[Null | ReactNode]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null
  ): WeakValidationMapTypograp = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapTypograp]
  }
}

