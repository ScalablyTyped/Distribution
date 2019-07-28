package typings.atAntDashDesignReactDashNative.esStepsMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.horizontal
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.vertical
import typings.atAntDashDesignReactDashNative.esStepsStyleMod.StepsStyle
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.react.reactMod.ReactElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps extends WithThemeStyles[StepsStyle] {
  var children: js.Array[ReactElement]
  var current: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[vertical | horizontal] = js.undefined
  var finishIcon: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    children: js.Array[ReactElement],
    current: Int | Double = null,
    direction: vertical | horizontal = null,
    finishIcon: String = null,
    size: String = null,
    styles: Partial[StepsStyle] = null
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

