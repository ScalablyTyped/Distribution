package typings
package antdDashMobileDashRnLib.libStepsIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps
  extends antdDashMobileDashRnLib.libStepsPropsTypeMod.StepsPropsType {
  @JSName("children")
  var children_StepsProps: js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]
  var direction: js.UndefOr[
    antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.vertical | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.horizontal
  ] = js.undefined
  var finishIcon: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNs.ReactElement[_]],
    current: scala.Int | scala.Double = null,
    direction: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.vertical | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.horizontal = null,
    finishIcon: java.lang.String = null,
    size: java.lang.String = null,
    styles: js.Any = null
  ): StepsProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (finishIcon != null) __obj.updateDynamic("finishIcon")(finishIcon)
    if (size != null) __obj.updateDynamic("size")(size)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[StepsProps]
  }
}

