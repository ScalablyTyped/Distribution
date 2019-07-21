package typings
package atAntDashDesignProDashLayoutLib.libHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings[P]} */ trait HeaderViewProps
  extends atAntDashDesignProDashLayoutLib.libGlobalHeaderMod.GlobalHeaderProps {
  var autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined
  var headerRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[/* props */ HeaderViewProps, reactLib.reactMod.ReactNode]]
  ] = js.undefined
  @JSName("menuRender")
  var menuRender_HeaderViewProps: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function2[
        /* props */ HeaderViewProps, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ]
  ] = js.undefined
  @JSName("rightContentRender")
  var rightContentRender_HeaderViewProps: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[/* props */ this.type, reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var siderWidth: js.UndefOr[scala.Double] = js.undefined
}

object HeaderViewProps {
  @scala.inline
  def apply(
    autoHideHeader: js.UndefOr[scala.Boolean] = js.undefined,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsedButtonRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function1[/* collapsed */ js.UndefOr[scala.Boolean], reactLib.reactMod.ReactNode]
    ] = null,
    headerRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[/* props */ HeaderViewProps, reactLib.reactMod.ReactNode]] = null,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    logo: reactLib.reactMod.ReactNode = null,
    menuRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function2[
        /* props */ HeaderViewProps, 
        /* defaultDom */ reactLib.reactMod.ReactNode, 
        reactLib.reactMod.ReactNode
      ]
    ] = null,
    onCollapse: /* collapsed */ scala.Boolean => scala.Unit = null,
    rightContentRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[HeaderViewProps, reactLib.reactMod.ReactNode]] = null,
    siderWidth: scala.Int | scala.Double = null
  ): HeaderViewProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideHeader)) __obj.updateDynamic("autoHideHeader")(autoHideHeader)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(headerRender.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderViewProps]
  }
}

