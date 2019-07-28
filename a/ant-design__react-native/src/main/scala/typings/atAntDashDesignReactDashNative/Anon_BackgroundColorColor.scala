package typings.atAntDashDesignReactDashNative

import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorColor extends js.Object {
  var backgroundColor: String
  var color: String
  var component: Element
  var disabled: Boolean
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: String
}

object Anon_BackgroundColorColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    color: String,
    component: Element,
    disabled: Boolean,
    `type`: String,
    onPress: () => Unit = null
  ): Anon_BackgroundColorColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, color = color, component = component, disabled = disabled)
    __obj.updateDynamic("type")(`type`)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Anon_BackgroundColorColor]
  }
}

