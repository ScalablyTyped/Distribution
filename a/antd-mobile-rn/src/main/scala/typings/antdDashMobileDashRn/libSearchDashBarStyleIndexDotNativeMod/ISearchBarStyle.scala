package typings.antdDashMobileDashRn.libSearchDashBarStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchBarStyle extends js.Object {
  var cancelText: TextStyle
  var cancelTextContainer: ViewStyle
  var input: TextStyle
  var inputWrapper: ViewStyle
  var search: ImageStyle
  var wrapper: ViewStyle
}

object ISearchBarStyle {
  @scala.inline
  def apply(
    cancelText: TextStyle,
    cancelTextContainer: ViewStyle,
    input: TextStyle,
    inputWrapper: ViewStyle,
    search: ImageStyle,
    wrapper: ViewStyle
  ): ISearchBarStyle = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], cancelTextContainer = cancelTextContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchBarStyle]
  }
}

