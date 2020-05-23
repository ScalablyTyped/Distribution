package typings.amplitudeJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  var reason: String
}

object Reason {
  @scala.inline
  def apply(reason: String): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
}

