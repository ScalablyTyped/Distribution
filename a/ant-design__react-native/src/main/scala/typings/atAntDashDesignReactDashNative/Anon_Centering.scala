package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Centering extends js.Object {
  var centering: RegisteredStyle[ViewStyle]
  var container: RegisteredStyle[ViewStyle]
  var content: RegisteredStyle[TextStyle]
  var iconToast: RegisteredStyle[ViewStyle]
  var image: RegisteredStyle[TextStyle]
  var innerContainer: RegisteredStyle[ViewStyle]
  var innerWrap: RegisteredStyle[ViewStyle]
  var textToast: RegisteredStyle[ViewStyle]
}

object Anon_Centering {
  @scala.inline
  def apply(
    centering: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[TextStyle],
    iconToast: RegisteredStyle[ViewStyle],
    image: RegisteredStyle[TextStyle],
    innerContainer: RegisteredStyle[ViewStyle],
    innerWrap: RegisteredStyle[ViewStyle],
    textToast: RegisteredStyle[ViewStyle]
  ): Anon_Centering = {
    val __obj = js.Dynamic.literal(centering = centering.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], iconToast = iconToast.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], innerWrap = innerWrap.asInstanceOf[js.Any], textToast = textToast.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Centering]
  }
}

