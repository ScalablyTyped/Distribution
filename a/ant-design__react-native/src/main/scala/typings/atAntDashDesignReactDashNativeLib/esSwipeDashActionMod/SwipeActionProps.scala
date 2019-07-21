package typings
package atAntDashDesignReactDashNativeLib.esSwipeDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeActionProps
  extends reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutMod.SwipeoutProperties {
  @JSName("left")
  var left_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.undefined
  @JSName("right")
  var right_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.undefined
}

object SwipeActionProps {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String = null,
    buttonWidth: scala.Int | scala.Double = null,
    close: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.Array[SwipeoutButtonProps] = null,
    onClose: (/* sectionId */ scala.Double, /* rowId */ scala.Double, /* direction */ java.lang.String) => scala.Unit = null,
    onOpen: (/* sectionId */ scala.Double, /* rowId */ scala.Double, /* direction */ java.lang.String) => scala.Unit = null,
    openLeft: js.UndefOr[scala.Boolean] = js.undefined,
    openRight: js.UndefOr[scala.Boolean] = js.undefined,
    right: js.Array[SwipeoutButtonProps] = null,
    rowId: scala.Int | scala.Double = null,
    scroll: /* scrollEnabled */ scala.Boolean => scala.Unit = null,
    sectionId: scala.Int | scala.Double = null,
    sensitivity: scala.Int | scala.Double = null,
    style: js.Object = null
  ): SwipeActionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (buttonWidth != null) __obj.updateDynamic("buttonWidth")(buttonWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (left != null) __obj.updateDynamic("left")(left)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction3(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction3(onOpen))
    if (!js.isUndefined(openLeft)) __obj.updateDynamic("openLeft")(openLeft)
    if (!js.isUndefined(openRight)) __obj.updateDynamic("openRight")(openRight)
    if (right != null) __obj.updateDynamic("right")(right)
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (sectionId != null) __obj.updateDynamic("sectionId")(sectionId.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SwipeActionProps]
  }
}

