package typings
package asyncLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackContainer extends js.Object {
  var callback: js.Function
}

object CallbackContainer {
  @scala.inline
  def apply(callback: js.Function): CallbackContainer = {
    val __obj = js.Dynamic.literal(callback = callback)
  
    __obj.asInstanceOf[CallbackContainer]
  }
}

