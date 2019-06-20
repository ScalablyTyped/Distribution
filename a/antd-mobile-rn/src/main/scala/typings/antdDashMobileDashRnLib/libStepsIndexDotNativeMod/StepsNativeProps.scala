package typings
package antdDashMobileDashRnLib.libStepsIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsNativeProps extends StepsProps {
  @JSName("styles")
  var styles_StepsNativeProps: js.UndefOr[antdDashMobileDashRnLib.libStepsStyleIndexDotNativeMod.IStepsStyle] = js.undefined
}

object StepsNativeProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactElement],
    current: scala.Int | scala.Double = null,
    direction: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.vertical | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.horizontal = null,
    finishIcon: java.lang.String = null,
    size: java.lang.String = null,
    styles: antdDashMobileDashRnLib.libStepsStyleIndexDotNativeMod.IStepsStyle = null
  ): StepsNativeProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (finishIcon != null) __obj.updateDynamic("finishIcon")(finishIcon)
    if (size != null) __obj.updateDynamic("size")(size)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[StepsNativeProps]
  }
}

