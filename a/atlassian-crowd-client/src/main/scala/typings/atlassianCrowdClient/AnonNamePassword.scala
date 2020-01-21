package typings.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNamePassword extends js.Object {
  val name: String
  val password: String
}

object AnonNamePassword {
  @scala.inline
  def apply(name: String, password: String): AnonNamePassword = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNamePassword]
  }
}

