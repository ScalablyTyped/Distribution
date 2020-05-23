package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.userMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authenticate extends js.Object {
  def authenticate(username: String, password: String): js.Promise[^]
}

object Authenticate {
  @scala.inline
  def apply(authenticate: (String, String) => js.Promise[^]): Authenticate = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
    __obj.asInstanceOf[Authenticate]
  }
}

