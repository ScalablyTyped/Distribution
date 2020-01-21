package typings.antDesignReactNative

import typings.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionTextActiveOpacity extends js.Object {
  var WrapComponent: View
  var actionTextActiveOpacity: Double
  var actionTextUnderlayColor: String
  var dismissText: String
  var okText: String
  var title: String
  var triggerType: String
  def onDismiss(): Unit
  def onOk(_underscore: js.Any): Unit
  def onVisibleChange(_underscore: js.Any): Unit
}

object AnonActionTextActiveOpacity {
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
  ): AnonActionTextActiveOpacity = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], actionTextActiveOpacity = actionTextActiveOpacity.asInstanceOf[js.Any], actionTextUnderlayColor = actionTextUnderlayColor.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss), onOk = js.Any.fromFunction1(onOk), onVisibleChange = js.Any.fromFunction1(onVisibleChange), title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionTextActiveOpacity]
  }
}

