package typings.antDesignReactNative

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseText extends js.Object {
  var closeText: RegisteredStyle[TextStyle]
  var closeWrap: RegisteredStyle[ViewStyle]
  var container: RegisteredStyle[ViewStyle]
  var image: RegisteredStyle[ImageStyle]
  var item: RegisteredStyle[ViewStyle]
  var plusText: RegisteredStyle[TextStyle]
  var plusWrap: RegisteredStyle[ViewStyle]
  var plusWrapHighlight: RegisteredStyle[ViewStyle]
  var plusWrapNormal: RegisteredStyle[ViewStyle]
  var size: RegisteredStyle[ImageStyle]
}

object AnonCloseText {
  @scala.inline
  def apply(
    closeText: RegisteredStyle[TextStyle],
    closeWrap: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    image: RegisteredStyle[ImageStyle],
    item: RegisteredStyle[ViewStyle],
    plusText: RegisteredStyle[TextStyle],
    plusWrap: RegisteredStyle[ViewStyle],
    plusWrapHighlight: RegisteredStyle[ViewStyle],
    plusWrapNormal: RegisteredStyle[ViewStyle],
    size: RegisteredStyle[ImageStyle]
  ): AnonCloseText = {
    val __obj = js.Dynamic.literal(closeText = closeText.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], plusText = plusText.asInstanceOf[js.Any], plusWrap = plusWrap.asInstanceOf[js.Any], plusWrapHighlight = plusWrapHighlight.asInstanceOf[js.Any], plusWrapNormal = plusWrapNormal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCloseText]
  }
}

