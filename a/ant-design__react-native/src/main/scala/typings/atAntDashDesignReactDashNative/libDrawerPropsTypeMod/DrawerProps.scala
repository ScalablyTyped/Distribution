package typings.atAntDashDesignReactDashNative.libDrawerPropsTypeMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.left
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.right
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var onOpenChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[left | right | top | bottom] = js.undefined
  var sidebar: js.UndefOr[ReactNode] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    onOpenChange: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    position: left | right | top | bottom = null,
    sidebar: ReactNode = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

