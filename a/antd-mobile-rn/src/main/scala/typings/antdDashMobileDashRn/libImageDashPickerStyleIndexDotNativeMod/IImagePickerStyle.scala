package typings.antdDashMobileDashRn.libImageDashPickerStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImagePickerStyle extends js.Object {
  var closeText: TextStyle
  var closeWrap: ViewStyle
  var container: ViewStyle
  var image: ImageStyle
  var item: ViewStyle
  var plusText: TextStyle
  var plusWrap: ViewStyle
  var plusWrapHighlight: ViewStyle
  var plusWrapNormal: ViewStyle
  var size: ViewStyle
}

object IImagePickerStyle {
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
    size: ViewStyle
  ): IImagePickerStyle = {
    val __obj = js.Dynamic.literal(closeText = closeText, closeWrap = closeWrap, container = container, image = image, item = item, plusText = plusText, plusWrap = plusWrap, plusWrapHighlight = plusWrapHighlight, plusWrapNormal = plusWrapNormal, size = size)
  
    __obj.asInstanceOf[IImagePickerStyle]
  }
}

