package typings.antDesignReactNative

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColorColor extends js.Object {
  var backgroundColor: String
  var color: String
  var component: Element
  var disabled: Boolean
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: String
}

object AnonBackgroundColorColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    color: String,
    component: Element,
    disabled: Boolean,
    `type`: String,
    onPress: () => Unit = null
  ): AnonBackgroundColorColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[AnonBackgroundColorColor]
  }
}

