package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/result.ResultProps> */
trait WeakValidationMapResultPropsClassName extends js.Object {
  var className: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var extra: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var icon: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var prefixCls: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var status: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | antdLib.libResultMod.ResultStatusType]]
  ] = js.undefined
  var style: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]]
  ] = js.undefined
  var subTitle: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var title: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
}

object WeakValidationMapResultPropsClassName {
  @scala.inline
  def apply(
    className: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    extra: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    icon: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    prefixCls: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    status: reactLib.reactMod.Validator[js.UndefOr[scala.Null | antdLib.libResultMod.ResultStatusType]] = null,
    style: reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]] = null,
    subTitle: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    title: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null
  ): WeakValidationMapResultPropsClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (status != null) __obj.updateDynamic("status")(status)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[WeakValidationMapResultPropsClassName]
  }
}

