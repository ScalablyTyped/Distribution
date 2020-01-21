package typings.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  def request(email: String): js.Promise[Unit]
}

object AnonEmail {
  @scala.inline
  def apply(request: String => js.Promise[Unit]): AnonEmail = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[AnonEmail]
  }
}

