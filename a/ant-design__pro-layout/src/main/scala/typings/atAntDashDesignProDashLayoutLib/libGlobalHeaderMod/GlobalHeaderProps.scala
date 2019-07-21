package typings
package atAntDashDesignProDashLayoutLib.libGlobalHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalHeaderProps extends js.Object {
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var collapsedButtonRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function1[/* collapsed */ js.UndefOr[scala.Boolean], reactLib.reactMod.ReactNode]
    ]
  ] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var logo: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var menuRender: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps['menuRender'] */ js.Any
  ] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ scala.Boolean, scala.Unit]] = js.undefined
  var rightContentRender: js.UndefOr[
    atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[/* props */ this.type, reactLib.reactMod.ReactNode]]
  ] = js.undefined
}

object GlobalHeaderProps {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsedButtonRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[
      js.Function1[/* collapsed */ js.UndefOr[scala.Boolean], reactLib.reactMod.ReactNode]
    ] = null,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    logo: reactLib.reactMod.ReactNode = null,
    menuRender: /* import warning: ImportType.apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps['menuRender'] */ js.Any = null,
    onCollapse: /* collapsed */ scala.Boolean => scala.Unit = null,
    rightContentRender: atAntDashDesignProDashLayoutLib.libTypingsMod.WithFalse[js.Function1[GlobalHeaderProps, reactLib.reactMod.ReactNode]] = null
  ): GlobalHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender)
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalHeaderProps]
  }
}

