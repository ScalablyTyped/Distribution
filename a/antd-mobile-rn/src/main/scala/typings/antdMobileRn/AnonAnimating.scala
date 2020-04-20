package typings.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimating extends js.Object {
  var animating: Boolean
  var color: String
  var size: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var toast: Boolean
}

object AnonAnimating {
  @scala.inline
  def apply(
    animating: Boolean,
    color: String,
    size: String,
    styles: StringDictionary[RegisteredStyle[_]],
    toast: Boolean
  ): AnonAnimating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimating]
  }
}

