package typings
package atAntDashDesignReactDashNativeLib.esStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps
  extends atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esStepsStyleMod.StepsStyle] {
  var children: js.Array[reactLib.reactMod.ReactElement]
  var current: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.vertical | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.horizontal
  ] = js.undefined
  var finishIcon: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactElement],
    current: scala.Int | scala.Double = null,
    direction: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.vertical | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.horizontal = null,
    finishIcon: java.lang.String = null,
    size: java.lang.String = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esStepsStyleMod.StepsStyle] = null
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

