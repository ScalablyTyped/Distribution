package typings.atAntDashDesignReactDashNative.esDrawerMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.left
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.right
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.atAntDashDesignReactDashNative.esDrawerPropsTypeMod.DrawerProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNativeProps extends DrawerProps {
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerRef: js.UndefOr[
    js.Function1[
      /* el */ typings.atBang88ReactDashNativeDashDrawerDashLayout.atBang88ReactDashNativeDashDrawerDashLayoutMod.default | Null, 
      Unit
    ]
  ] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
}

object DrawerNativeProps {
  @scala.inline
  def apply(
    drawerBackgroundColor: String = null,
    drawerRef: /* el */ typings.atBang88ReactDashNativeDashDrawerDashLayout.atBang88ReactDashNativeDashDrawerDashLayoutMod.default | Null => Unit = null,
    drawerWidth: Int | Double = null,
    onOpenChange: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    position: left | right | top | bottom = null,
    sidebar: ReactNode = null
  ): DrawerNativeProps = {
    val __obj = js.Dynamic.literal()
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor)
    if (drawerRef != null) __obj.updateDynamic("drawerRef")(js.Any.fromFunction1(drawerRef))
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNativeProps]
  }
}

