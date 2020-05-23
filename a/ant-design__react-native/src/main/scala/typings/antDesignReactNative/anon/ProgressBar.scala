package typings.antDesignReactNative.anon

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBar extends js.Object {
  var progressBar: RegisteredStyle[ViewStyle]
  var progressOuter: RegisteredStyle[ViewStyle]
}

object ProgressBar {
  @scala.inline
  def apply(progressBar: RegisteredStyle[ViewStyle], progressOuter: RegisteredStyle[ViewStyle]): ProgressBar = {
    val __obj = js.Dynamic.literal(progressBar = progressBar.asInstanceOf[js.Any], progressOuter = progressOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBar]
  }
}

