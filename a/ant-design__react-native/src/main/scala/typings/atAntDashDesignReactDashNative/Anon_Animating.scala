package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animating extends js.Object {
  var animating: Boolean
  var color: String
  var size: String
  var toast: Boolean
}

object Anon_Animating {
  @scala.inline
  def apply(animating: Boolean, color: String, size: String, toast: Boolean): Anon_Animating = {
    val __obj = js.Dynamic.literal(animating = animating, color = color, size = size, toast = toast)
  
    __obj.asInstanceOf[Anon_Animating]
  }
}

