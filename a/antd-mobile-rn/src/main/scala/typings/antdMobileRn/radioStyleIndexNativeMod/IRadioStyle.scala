package typings.antdMobileRn.radioStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadioStyle extends js.Object {
  var icon: ViewStyle
  var radioItem: ViewStyle
  var radioItemContent: TextStyle
  var radioItemContentDisable: TextStyle
  var radioItemRadio: ViewStyle
  var wrapper: ViewStyle
}

object IRadioStyle {
  @scala.inline
  def apply(
    icon: ViewStyle,
    radioItem: ViewStyle,
    radioItemContent: TextStyle,
    radioItemContentDisable: TextStyle,
    radioItemRadio: ViewStyle,
    wrapper: ViewStyle
  ): IRadioStyle = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], radioItem = radioItem.asInstanceOf[js.Any], radioItemContent = radioItemContent.asInstanceOf[js.Any], radioItemContentDisable = radioItemContentDisable.asInstanceOf[js.Any], radioItemRadio = radioItemRadio.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRadioStyle]
  }
}

