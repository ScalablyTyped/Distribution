package typings.atAntDashDesignReactDashNative.esRadioStyleMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioStyle extends js.Object {
  var icon: ImageStyle
  var radioItem: ViewStyle
  var radioItemContent: TextStyle
  var radioItemContentDisable: TextStyle
  var radioItemRadio: ViewStyle
  var wrapper: ViewStyle
}

object RadioStyle {
  @scala.inline
  def apply(
    icon: ImageStyle,
    radioItem: ViewStyle,
    radioItemContent: TextStyle,
    radioItemContentDisable: TextStyle,
    radioItemRadio: ViewStyle,
    wrapper: ViewStyle
  ): RadioStyle = {
    val __obj = js.Dynamic.literal(icon = icon, radioItem = radioItem, radioItemContent = radioItemContent, radioItemContentDisable = radioItemContentDisable, radioItemRadio = radioItemRadio, wrapper = wrapper)
  
    __obj.asInstanceOf[RadioStyle]
  }
}

