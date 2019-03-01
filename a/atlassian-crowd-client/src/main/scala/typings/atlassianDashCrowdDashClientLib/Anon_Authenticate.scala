package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticate extends js.Object {
  def authenticate(username: java.lang.String, password: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced]
}

object Anon_Authenticate {
  @scala.inline
  def apply(
    authenticate: js.Function2[
      java.lang.String, 
      java.lang.String, 
      js.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced]
    ]
  ): Anon_Authenticate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticate")(authenticate)
    __obj.asInstanceOf[Anon_Authenticate]
  }
}

