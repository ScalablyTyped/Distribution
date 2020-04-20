package typings.antDesignReactNative.progressStyleMod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressStyle extends js.Object {
  var progressBar: ViewStyle
  var progressOuter: ViewStyle
}

object ProgressStyle {
  @scala.inline
  def apply(progressBar: ViewStyle, progressOuter: ViewStyle): ProgressStyle = {
    val __obj = js.Dynamic.literal(progressBar = progressBar.asInstanceOf[js.Any], progressOuter = progressOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressStyle]
  }
}

