package typings.antDesignReactNative.anon

import typings.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTextUnderlayColor extends js.Object {
  var WrapComponent: View = js.native
  var actionTextActiveOpacity: Double = js.native
  var actionTextUnderlayColor: String = js.native
  var triggerType: String = js.native
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
  @scala.inline
  implicit class ActionTextUnderlayColorOps[Self <: ActionTextUnderlayColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWrapComponent(value: View): Self = this.set("WrapComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionTextActiveOpacity(value: Double): Self = this.set("actionTextActiveOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionTextUnderlayColor(value: String): Self = this.set("actionTextUnderlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerType(value: String): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
  
}

