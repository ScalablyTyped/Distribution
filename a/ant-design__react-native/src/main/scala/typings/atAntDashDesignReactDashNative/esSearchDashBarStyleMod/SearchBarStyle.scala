package typings.atAntDashDesignReactDashNative.esSearchDashBarStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarStyle extends js.Object {
  var cancelText: TextStyle
  var cancelTextContainer: ViewStyle
  var input: TextStyle
  var inputWrapper: ViewStyle
  var search: TextStyle
  var wrapper: ViewStyle
}

object SearchBarStyle {
  @scala.inline
  def apply(
    cancelText: TextStyle,
    cancelTextContainer: ViewStyle,
    input: TextStyle,
    inputWrapper: ViewStyle,
    search: TextStyle,
    wrapper: ViewStyle
  ): SearchBarStyle = {
    val __obj = js.Dynamic.literal(cancelText = cancelText, cancelTextContainer = cancelTextContainer, input = input, inputWrapper = inputWrapper, search = search, wrapper = wrapper)
  
    __obj.asInstanceOf[SearchBarStyle]
  }
}

