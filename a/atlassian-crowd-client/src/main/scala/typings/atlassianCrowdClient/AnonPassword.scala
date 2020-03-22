package typings.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassword extends js.Object {
  val name: String
  val password: String
}

object AnonPassword {
  @scala.inline
  def apply(name: String, password: String): AnonPassword = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPassword]
  }
}

