package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorColor extends js.Object {
  var backgroundColor: java.lang.String
  var color: java.lang.String
  var component: reactLib.reactMod.Global.JSXNs.Element
  var disabled: scala.Boolean
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var `type`: java.lang.String
}

object Anon_BackgroundColorColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    color: java.lang.String,
    component: reactLib.reactMod.Global.JSXNs.Element,
    disabled: scala.Boolean,
    `type`: java.lang.String,
    onPress: () => scala.Unit = null
  ): Anon_BackgroundColorColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, color = color, component = component, disabled = disabled)
    __obj.updateDynamic("type")(`type`)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Anon_BackgroundColorColor]
  }
}

