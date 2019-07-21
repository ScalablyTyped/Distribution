package typings
package atAntDashDesignProDashLayoutLib.esPageHeaderWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/es/PageHeaderWrapper.PageHeaderTabConfig */
/* Inlined parent std.Omit<antd.antd/es/page-header.PageHeaderProps, 'title'> */
trait PageHeaderWrapperProps extends js.Object {
  var backIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var breadcrumb: js.UndefOr[antdLib.esBreadcrumbBreadcrumbMod.BreadcrumbProps] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var extraContent: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onBack: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* activeKey */ java.lang.String, scala.Unit]] = js.undefined
  var pageHeaderRender: js.UndefOr[js.Function1[/* props */ PageHeaderWrapperProps, reactLib.reactMod.ReactNode]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var subTitle: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var tabActiveKey: js.UndefOr[java.lang.String] = js.undefined
  var tabBarExtraContent: js.UndefOr[reactLib.reactMod.ReactNode | scala.Null] = js.undefined
  var tabList: js.UndefOr[js.Array[atAntDashDesignProDashLayoutLib.Anon_Key]] = js.undefined
  var tags: js.UndefOr[reactLib.reactMod.ReactElement | js.Array[reactLib.reactMod.ReactElement]] = js.undefined
  var title: js.UndefOr[
    reactLib.reactMod.ReactNode | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibNumbers.`false`
  ] = js.undefined
}

object PageHeaderWrapperProps {
  @scala.inline
  def apply(
    backIcon: reactLib.reactMod.ReactNode = null,
    breadcrumb: antdLib.esBreadcrumbBreadcrumbMod.BreadcrumbProps = null,
    className: java.lang.String = null,
    content: reactLib.reactMod.ReactNode = null,
    extra: reactLib.reactMod.ReactNode = null,
    extraContent: reactLib.reactMod.ReactNode = null,
    footer: reactLib.reactMod.ReactNode = null,
    onBack: /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onTabChange: /* activeKey */ java.lang.String => scala.Unit = null,
    pageHeaderRender: /* props */ PageHeaderWrapperProps => reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    subTitle: reactLib.reactMod.ReactNode = null,
    tabActiveKey: java.lang.String = null,
    tabBarExtraContent: reactLib.reactMod.ReactNode = null,
    tabList: js.Array[atAntDashDesignProDashLayoutLib.Anon_Key] = null,
    tags: reactLib.reactMod.ReactElement | js.Array[reactLib.reactMod.ReactElement] = null,
    title: reactLib.reactMod.ReactNode | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibNumbers.`false` = null
  ): PageHeaderWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (extraContent != null) __obj.updateDynamic("extraContent")(extraContent.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (onBack != null) __obj.updateDynamic("onBack")(js.Any.fromFunction1(onBack))
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (pageHeaderRender != null) __obj.updateDynamic("pageHeaderRender")(js.Any.fromFunction1(pageHeaderRender))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey)
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderWrapperProps]
  }
}

