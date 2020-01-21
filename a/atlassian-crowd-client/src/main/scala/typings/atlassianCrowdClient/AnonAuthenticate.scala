package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.userMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthenticate extends js.Object {
  def authenticate(username: String, password: String): js.Promise[^]
}

object AnonAuthenticate {
  @scala.inline
  def apply(authenticate: (String, String) => js.Promise[^]): AnonAuthenticate = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
  
    __obj.asInstanceOf[AnonAuthenticate]
  }
}

