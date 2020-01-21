package typings.autocannon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSent extends js.Object {
  var sent: Double
}

object AnonSent {
  @scala.inline
  def apply(sent: Double): AnonSent = {
    val __obj = js.Dynamic.literal(sent = sent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSent]
  }
}

