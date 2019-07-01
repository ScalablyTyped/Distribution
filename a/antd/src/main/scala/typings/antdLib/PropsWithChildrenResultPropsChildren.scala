package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.PropsWithChildren<antd.antd/lib/result.ResultProps> */
trait PropsWithChildrenResultPropsChildren extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var status: antdLib.libResultMod.ResultStatusType
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var subTitle: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object PropsWithChildrenResultPropsChildren {
  @scala.inline
  def apply(
    status: antdLib.libResultMod.ResultStatusType,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    extra: reactLib.reactMod.ReactNode = null,
    icon: reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    subTitle: reactLib.reactMod.ReactNode = null,
    title: reactLib.reactMod.ReactNode = null
  ): PropsWithChildrenResultPropsChildren = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildrenResultPropsChildren]
  }
}

