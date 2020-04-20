package typings.antDesignReactNative.searchBarStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], cancelTextContainer = cancelTextContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarStyle]
  }
}

