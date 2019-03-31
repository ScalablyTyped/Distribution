package typings
package antdDashMobileDashRnLib.libRadioStyleIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadioStyle extends js.Object {
  var icon: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var radioItem: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var radioItemContent: reactDashNativeLib.reactDashNativeMod.TextStyle
  var radioItemContentDisable: reactDashNativeLib.reactDashNativeMod.TextStyle
  var radioItemRadio: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object IRadioStyle {
  @scala.inline
  def apply(
    icon: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    radioItem: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    radioItemContent: reactDashNativeLib.reactDashNativeMod.TextStyle,
    radioItemContentDisable: reactDashNativeLib.reactDashNativeMod.TextStyle,
    radioItemRadio: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): IRadioStyle = {
    val __obj = js.Dynamic.literal(icon = icon, radioItem = radioItem, radioItemContent = radioItemContent, radioItemContentDisable = radioItemContentDisable, radioItemRadio = radioItemRadio, wrapper = wrapper)
  
    __obj.asInstanceOf[IRadioStyle]
  }
}

