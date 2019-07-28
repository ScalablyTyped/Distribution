package typings.atlassianDashCrowdDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NamePassword extends js.Object {
  val name: String
  val password: String
}

object Anon_NamePassword {
  @scala.inline
  def apply(name: String, password: String): Anon_NamePassword = {
    val __obj = js.Dynamic.literal(name = name, password = password)
  
    __obj.asInstanceOf[Anon_NamePassword]
  }
}

