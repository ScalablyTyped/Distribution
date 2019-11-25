package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  var icon: RegisteredStyle[ImageStyle]
  var radioItem: RegisteredStyle[ViewStyle]
  var radioItemContent: RegisteredStyle[TextStyle]
  var radioItemContentDisable: RegisteredStyle[TextStyle]
  var radioItemRadio: RegisteredStyle[ViewStyle]
  var wrapper: RegisteredStyle[ViewStyle]
}

object Anon_Icon {
  @scala.inline
  def apply(
    icon: RegisteredStyle[ImageStyle],
    radioItem: RegisteredStyle[ViewStyle],
    radioItemContent: RegisteredStyle[TextStyle],
    radioItemContentDisable: RegisteredStyle[TextStyle],
    radioItemRadio: RegisteredStyle[ViewStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): Anon_Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], radioItem = radioItem.asInstanceOf[js.Any], radioItemContent = radioItemContent.asInstanceOf[js.Any], radioItemContentDisable = radioItemContentDisable.asInstanceOf[js.Any], radioItemRadio = radioItemRadio.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Icon]
  }
}

