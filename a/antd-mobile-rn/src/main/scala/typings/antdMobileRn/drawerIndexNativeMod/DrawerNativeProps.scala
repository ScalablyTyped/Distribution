package typings.antdMobileRn.drawerIndexNativeMod

import typings.antdMobileRn.antdMobileRnStrings.bottom
import typings.antdMobileRn.antdMobileRnStrings.left
import typings.antdMobileRn.antdMobileRnStrings.right
import typings.antdMobileRn.antdMobileRnStrings.top
import typings.antdMobileRn.drawerPropsTypeMod.DrawerProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNativeProps extends DrawerProps {
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerRef: js.UndefOr[js.Function1[/* el */ typings.reactNativeDrawerLayout.mod.default | Null, Unit]] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
}

object DrawerNativeProps {
  @scala.inline
  def apply(
    drawerBackgroundColor: String = null,
    drawerRef: /* el */ typings.reactNativeDrawerLayout.mod.default | Null => Unit = null,
    drawerWidth: js.UndefOr[Double] = js.undefined,
    onOpenChange: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    position: left | right | top | bottom = null,
    sidebar: ReactNode = null
  ): DrawerNativeProps = {
    val __obj = js.Dynamic.literal()
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerRef != null) __obj.updateDynamic("drawerRef")(js.Any.fromFunction1(drawerRef))
    if (!js.isUndefined(drawerWidth)) __obj.updateDynamic("drawerWidth")(drawerWidth.get.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNativeProps]
  }
}

