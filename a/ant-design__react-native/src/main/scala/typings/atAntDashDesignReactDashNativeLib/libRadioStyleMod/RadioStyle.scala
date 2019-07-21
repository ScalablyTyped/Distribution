package typings
package atAntDashDesignReactDashNativeLib.libRadioStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioStyle extends js.Object {
  var icon: reactDashNativeLib.reactDashNativeMod.ImageStyle
  var radioItem: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var radioItemContent: reactDashNativeLib.reactDashNativeMod.TextStyle
  var radioItemContentDisable: reactDashNativeLib.reactDashNativeMod.TextStyle
  var radioItemRadio: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object RadioStyle {
  @scala.inline
  def apply(
    icon: reactDashNativeLib.reactDashNativeMod.ImageStyle,
    radioItem: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    radioItemContent: reactDashNativeLib.reactDashNativeMod.TextStyle,
    radioItemContentDisable: reactDashNativeLib.reactDashNativeMod.TextStyle,
    radioItemRadio: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): RadioStyle = {
    val __obj = js.Dynamic.literal(icon = icon, radioItem = radioItem, radioItemContent = radioItemContent, radioItemContentDisable = radioItemContentDisable, radioItemRadio = radioItemRadio, wrapper = wrapper)
  
    __obj.asInstanceOf[RadioStyle]
  }
}

