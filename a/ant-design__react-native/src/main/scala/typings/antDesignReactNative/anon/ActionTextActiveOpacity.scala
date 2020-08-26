package typings.antDesignReactNative.anon

import typings.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTextActiveOpacity extends js.Object {
  var WrapComponent: View = js.native
  var actionTextActiveOpacity: Double = js.native
  var actionTextUnderlayColor: String = js.native
  var dismissText: String = js.native
  var okText: String = js.native
  var title: String = js.native
  var triggerType: String = js.native
  def onDismiss(): Unit = js.native
  def onOk(_underscore: js.Any): Unit = js.native
  def onVisibleChange(_underscore: js.Any): Unit = js.native
}

object ActionTextActiveOpacity {
  @scala.inline
  def apply(
    WrapComponent: View,
    actionTextActiveOpacity: Double,
    actionTextUnderlayColor: String,
    dismissText: String,
    okText: String,
    onDismiss: () => Unit,
    onOk: js.Any => Unit,
    onVisibleChange: js.Any => Unit,
    title: String,
    triggerType: String
  ): ActionTextActiveOpacity = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], actionTextActiveOpacity = actionTextActiveOpacity.asInstanceOf[js.Any], actionTextUnderlayColor = actionTextUnderlayColor.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss), onOk = js.Any.fromFunction1(onOk), onVisibleChange = js.Any.fromFunction1(onVisibleChange), title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTextActiveOpacity]
  }
  @scala.inline
  implicit class ActionTextActiveOpacityOps[Self <: ActionTextActiveOpacity] (val x: Self) extends AnyVal {
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
    def setDismissText(value: String): Self = this.set("dismissText", value.asInstanceOf[js.Any])
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def setOnOk(value: js.Any => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def setOnVisibleChange(value: js.Any => Unit): Self = this.set("onVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerType(value: String): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
  
}

