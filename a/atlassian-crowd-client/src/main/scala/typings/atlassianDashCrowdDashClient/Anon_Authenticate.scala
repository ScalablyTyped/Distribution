package typings.atlassianDashCrowdDashClient

import typings.atlassianDashCrowdDashClient.libModelsUserMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticate extends js.Object {
  def authenticate(username: String, password: String): js.Promise[^]
}

object Anon_Authenticate {
  @scala.inline
  def apply(authenticate: (String, String) => js.Promise[^]): Anon_Authenticate = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
  
    __obj.asInstanceOf[Anon_Authenticate]
  }
}

