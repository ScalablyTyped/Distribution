package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLinks extends js.Object {
  var next: String
}

object ListLinks {
  @scala.inline
  def apply(next: String): ListLinks = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListLinks]
  }
}

