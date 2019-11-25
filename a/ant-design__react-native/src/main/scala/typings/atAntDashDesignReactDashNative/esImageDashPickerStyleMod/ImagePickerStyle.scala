package typings.atAntDashDesignReactDashNative.esImageDashPickerStyleMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerStyle extends js.Object {
  var closeText: TextStyle
  var closeWrap: ViewStyle
  var container: ViewStyle
  var image: ImageStyle
  var item: ViewStyle
  var plusText: TextStyle
  var plusWrap: ViewStyle
  var plusWrapHighlight: ViewStyle
  var plusWrapNormal: ViewStyle
  var size: ImageStyle
}

object ImagePickerStyle {
  @scala.inline
  def apply(
    closeText: TextStyle,
    closeWrap: ViewStyle,
    container: ViewStyle,
    image: ImageStyle,
    item: ViewStyle,
    plusText: TextStyle,
    plusWrap: ViewStyle,
    plusWrapHighlight: ViewStyle,
    plusWrapNormal: ViewStyle,
    size: ImageStyle
  ): ImagePickerStyle = {
    val __obj = js.Dynamic.literal(closeText = closeText.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], plusText = plusText.asInstanceOf[js.Any], plusWrap = plusWrap.asInstanceOf[js.Any], plusWrapHighlight = plusWrapHighlight.asInstanceOf[js.Any], plusWrapNormal = plusWrapNormal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImagePickerStyle]
  }
}

