package typings.antDesignReactNative.anon

import typings.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionTextUnderlayColor extends js.Object {
  var WrapComponent: View
  var actionTextActiveOpacity: Double
  var actionTextUnderlayColor: String
  var triggerType: String
}

object ActionTextUnderlayColor {
  @scala.inline
  def apply(
    WrapComponent: View,
    actionTextActiveOpacity: Double,
    actionTextUnderlayColor: String,
    triggerType: String
  ): ActionTextUnderlayColor = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], actionTextActiveOpacity = actionTextActiveOpacity.asInstanceOf[js.Any], actionTextUnderlayColor = actionTextUnderlayColor.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTextUnderlayColor]
  }
}

