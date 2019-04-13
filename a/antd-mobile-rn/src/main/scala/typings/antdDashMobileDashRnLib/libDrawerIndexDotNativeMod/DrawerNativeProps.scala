package typings
package antdDashMobileDashRnLib.libDrawerIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNativeProps
  extends antdDashMobileDashRnLib.libDrawerPropsTypeMod.DrawerProps {
  var drawerBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var drawerRef: js.UndefOr[
    js.Function1[
      /* el */ reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutMod.default | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  var drawerWidth: js.UndefOr[scala.Double] = js.undefined
}

object DrawerNativeProps {
  @scala.inline
  def apply(
    drawerBackgroundColor: java.lang.String = null,
    drawerRef: /* el */ reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutMod.default | scala.Null => scala.Unit = null,
    drawerWidth: scala.Int | scala.Double = null,
    onOpenChange: /* isOpen */ scala.Boolean => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    position: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.left | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.right | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.top | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.bottom = null,
    sidebar: reactLib.reactMod.ReactNode = null
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

