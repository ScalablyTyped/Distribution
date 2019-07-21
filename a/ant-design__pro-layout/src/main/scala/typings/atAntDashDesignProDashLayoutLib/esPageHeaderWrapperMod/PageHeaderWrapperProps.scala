package typings
package atAntDashDesignProDashLayoutLib.esPageHeaderWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/es/page-header.PageHeaderProps, 'title'> ]: antd.antd/es/page-header.PageHeaderProps[P]} */ trait PageHeaderWrapperProps extends PageHeaderTabConfig {
  var content: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var extraContent: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var pageHeaderRender: js.UndefOr[js.Function1[/* props */ PageHeaderWrapperProps, reactLib.reactMod.ReactNode]] = js.undefined
  var title: js.UndefOr[
    reactLib.reactMod.ReactNode | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibNumbers.`false`
  ] = js.undefined
}

object PageHeaderWrapperProps {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNode = null,
    extraContent: reactLib.reactMod.ReactNode = null,
    onTabChange: /* activeKey */ java.lang.String => scala.Unit = null,
    pageHeaderRender: /* props */ PageHeaderWrapperProps => reactLib.reactMod.ReactNode = null,
    tabActiveKey: java.lang.String = null,
    tabBarExtraContent: reactLib.reactMod.ReactNode = null,
    tabList: js.Array[atAntDashDesignProDashLayoutLib.Anon_Key] = null,
    title: reactLib.reactMod.ReactNode | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibNumbers.`false` = null
  ): PageHeaderWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extraContent != null) __obj.updateDynamic("extraContent")(extraContent.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (pageHeaderRender != null) __obj.updateDynamic("pageHeaderRender")(js.Any.fromFunction1(pageHeaderRender))
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey)
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderWrapperProps]
  }
}

