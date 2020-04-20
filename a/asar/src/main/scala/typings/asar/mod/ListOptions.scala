package typings.asar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends js.Object {
  var isPack: Boolean
}

object ListOptions {
  @scala.inline
  def apply(isPack: Boolean): ListOptions = {
    val __obj = js.Dynamic.literal(isPack = isPack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
}

