package typings.akuminaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: String
}

object AnonEmail {
  @scala.inline
  def apply(email: String): AnonEmail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

