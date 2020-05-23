package typings.atlassianCrowdClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  def request(email: String): js.Promise[Unit]
}

object Request {
  @scala.inline
  def apply(request: String => js.Promise[Unit]): Request = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[Request]
  }
}

