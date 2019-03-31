package typings
package antdDashMobileDashRnLib.libSearchDashBarStyleIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchBarStyle extends js.Object {
  var cancelText: reactDashNativeLib.reactDashNativeMod.TextStyle
  var cancelTextContainer: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var input: reactDashNativeLib.reactDashNativeMod.TextStyle
  var inputWrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var search: reactDashNativeLib.reactDashNativeMod.ImageStyle
  var wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object ISearchBarStyle {
  @scala.inline
  def apply(
    cancelText: reactDashNativeLib.reactDashNativeMod.TextStyle,
    cancelTextContainer: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    input: reactDashNativeLib.reactDashNativeMod.TextStyle,
    inputWrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    search: reactDashNativeLib.reactDashNativeMod.ImageStyle,
    wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): ISearchBarStyle = {
    val __obj = js.Dynamic.literal(cancelText = cancelText, cancelTextContainer = cancelTextContainer, input = input, inputWrapper = inputWrapper, search = search, wrapper = wrapper)
  
    __obj.asInstanceOf[ISearchBarStyle]
  }
}

