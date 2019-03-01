package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributename extends js.Object {
  var password: Anon_Password
  var username: Anon_Email
  def list(username: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
  def remove(username: java.lang.String, attributename: java.lang.String): js.Promise[scala.Unit]
  def set(
    username: java.lang.String,
    attributes: atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced
  ): js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
}

object Anon_Attributename {
  @scala.inline
  def apply(
    list: js.Function1[
      java.lang.String, 
      js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
    ],
    password: Anon_Password,
    remove: js.Function2[java.lang.String, java.lang.String, js.Promise[scala.Unit]],
    set: js.Function2[
      java.lang.String, 
      atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced, 
      js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
    ],
    username: Anon_Email
  ): Anon_Attributename = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Attributename]
  }
}

