package typings.asana

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorization extends js.Object {
  var Authorization: String
}

object AnonAuthorization {
  @scala.inline
  def apply(Authorization: String): AnonAuthorization = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorization]
  }
}

