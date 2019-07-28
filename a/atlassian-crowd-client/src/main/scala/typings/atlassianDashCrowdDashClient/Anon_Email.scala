package typings.atlassianDashCrowdDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  def request(email: String): js.Promise[Unit]
}

object Anon_Email {
  @scala.inline
  def apply(request: String => js.Promise[Unit]): Anon_Email = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[Anon_Email]
  }
}

