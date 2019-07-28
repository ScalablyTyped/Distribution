package typings.antd

import typings.antd.esResultMod.ResultStatusType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/es/result.ResultProps> */
trait WeakValidationMapResultProps extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var extra: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var icon: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var status: js.UndefOr[Validator[js.UndefOr[Null | ResultStatusType]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  var subTitle: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var title: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
}

object WeakValidationMapResultProps {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    extra: Validator[js.UndefOr[Null | ReactNode]] = null,
    icon: Validator[js.UndefOr[Null | ReactNode]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    status: Validator[js.UndefOr[Null | ResultStatusType]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null,
    subTitle: Validator[js.UndefOr[Null | ReactNode]] = null,
    title: Validator[js.UndefOr[Null | ReactNode]] = null
  ): WeakValidationMapResultProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (status != null) __obj.updateDynamic("status")(status)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[WeakValidationMapResultProps]
  }
}

