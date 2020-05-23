package typings.atlassianCrowdClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  val name: String
  val password: String
}

object Password {
  @scala.inline
  def apply(name: String, password: String): Password = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
}

