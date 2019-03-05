package typings
package antdLib.libPageDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderProps extends js.Object {
  var backIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var breadcrumb: js.UndefOr[antdLib.libBreadcrumbBreadcrumbMod.BreadcrumbProps] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onBack: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var subTitle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var tags: js.UndefOr[js.Array[antdLib.libTagMod.default]] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object PageHeaderProps {
  @scala.inline
  def apply(
    title: reactLib.reactMod.ReactNs.ReactNode,
    backIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    breadcrumb: antdLib.libBreadcrumbBreadcrumbMod.BreadcrumbProps = null,
    className: java.lang.String = null,
    extra: reactLib.reactMod.ReactNs.ReactNode = null,
    footer: reactLib.reactMod.ReactNs.ReactNode = null,
    onBack: js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    subTitle: reactLib.reactMod.ReactNs.ReactNode = null,
    tags: js.Array[antdLib.libTagMod.default] = null
  ): PageHeaderProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (onBack != null) __obj.updateDynamic("onBack")(onBack)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[PageHeaderProps]
  }
}

