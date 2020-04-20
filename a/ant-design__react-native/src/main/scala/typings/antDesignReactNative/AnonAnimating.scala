package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimating extends js.Object {
  var animating: Boolean
  var color: String
  var size: String
  var toast: Boolean
}

object AnonAnimating {
  @scala.inline
  def apply(animating: Boolean, color: String, size: String, toast: Boolean): AnonAnimating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimating]
  }
}

