package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticate extends js.Object {
  def authenticate(username: java.lang.String, password: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.^]
}

object Anon_Authenticate {
  @scala.inline
  def apply(
    authenticate: (java.lang.String, java.lang.String) => js.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.^]
  ): Anon_Authenticate = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
  
    __obj.asInstanceOf[Anon_Authenticate]
  }
}

