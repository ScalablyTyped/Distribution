package typings
package atAntDashDesignProDashLayoutLib.esSiderMenuBaseMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/es/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route> ]:? @ant-design/pro-layout.@ant-design/pro-layout/es/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/es/typings.Route>[P]}
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings ]:? @ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings[P]} */ trait BaseMenuProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var flatMenuKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var formatMessage: js.UndefOr[
    js.Function1[
      /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor, 
      java.lang.String
    ]
  ] = js.undefined
  var handleOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[java.lang.String], scala.Unit]] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var menuData: js.UndefOr[js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]] = js.undefined
  var menuItemRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* item */ atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem with atAntDashDesignProDashLayoutLib.Anon_IsUrl, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ]
  ] = js.undefined
  var mode: js.UndefOr[antdLib.esMenuMod.MenuMode] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ scala.Boolean, scala.Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[java.lang.String], scala.Unit]] = js.undefined
  var openKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var theme: js.UndefOr[antdLib.esMenuMod.MenuTheme] = js.undefined
}

object BaseMenuProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    flatMenuKeys: js.Array[java.lang.String] = null,
    formatMessage: /* message */ atAntDashDesignProDashLayoutLib.esTypingsMod.MessageDescriptor => java.lang.String = null,
    handleOpenChange: /* openKeys */ js.Array[java.lang.String] => scala.Unit = null,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    menuData: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem] = null,
    menuItemRender: atAntDashDesignProDashLayoutLib.esTypingsMod.WithFalse[
      js.Function2[
        /* item */ atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem with atAntDashDesignProDashLayoutLib.Anon_IsUrl, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ] = null,
    mode: antdLib.esMenuMod.MenuMode = null,
    onCollapse: /* collapsed */ scala.Boolean => scala.Unit = null,
    onOpenChange: /* openKeys */ js.Array[java.lang.String] => scala.Unit = null,
    openKeys: js.Array[java.lang.String] = null,
    style: reactLib.reactMod.CSSProperties = null,
    theme: antdLib.esMenuMod.MenuTheme = null
  ): BaseMenuProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (flatMenuKeys != null) __obj.updateDynamic("flatMenuKeys")(flatMenuKeys)
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (handleOpenChange != null) __obj.updateDynamic("handleOpenChange")(js.Any.fromFunction1(handleOpenChange))
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (menuData != null) __obj.updateDynamic("menuData")(menuData)
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[BaseMenuProps]
  }
}

