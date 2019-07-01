package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/es/result.ResultProps> */
trait PartialResultProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[antdLib.esResultMod.ResultStatusType] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var subTitle: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object PartialResultProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    extra: reactLib.reactMod.ReactNode = null,
    icon: reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    status: antdLib.esResultMod.ResultStatusType = null,
    style: reactLib.reactMod.CSSProperties = null,
    subTitle: reactLib.reactMod.ReactNode = null,
    title: reactLib.reactMod.ReactNode = null
  ): PartialResultProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialResultProps]
  }
}

