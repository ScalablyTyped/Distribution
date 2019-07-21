package typings
package atAntDashDesignReactDashNativeLib.libSearchDashBarStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarStyle extends js.Object {
  var cancelText: reactDashNativeLib.reactDashNativeMod.TextStyle
  var cancelTextContainer: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var input: reactDashNativeLib.reactDashNativeMod.TextStyle
  var inputWrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var search: reactDashNativeLib.reactDashNativeMod.TextStyle
  var wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object SearchBarStyle {
  @scala.inline
  def apply(
    cancelText: reactDashNativeLib.reactDashNativeMod.TextStyle,
    cancelTextContainer: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    input: reactDashNativeLib.reactDashNativeMod.TextStyle,
    inputWrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    search: reactDashNativeLib.reactDashNativeMod.TextStyle,
    wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): SearchBarStyle = {
    val __obj = js.Dynamic.literal(cancelText = cancelText, cancelTextContainer = cancelTextContainer, input = input, inputWrapper = inputWrapper, search = search, wrapper = wrapper)
  
    __obj.asInstanceOf[SearchBarStyle]
  }
}

