package typings.antdDashMobileDashRn.libRadioStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    val __obj = js.Dynamic.literal(icon = icon, radioItem = radioItem, radioItemContent = radioItemContent, radioItemContentDisable = radioItemContentDisable, radioItemRadio = radioItemRadio, wrapper = wrapper)
  
    __obj.asInstanceOf[IRadioStyle]
  }
}

