package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributename extends js.Object {
  var password: Anon_Password
  var username: Anon_Email
  def list(username: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.^]
  def remove(username: java.lang.String, attributename: java.lang.String): js.Promise[scala.Unit]
  def set(username: java.lang.String, attributes: atlassianDashCrowdDashClientLib.libModelsAttributesMod.^): js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.^]
}

object Anon_Attributename {
  @scala.inline
  def apply(
    list: java.lang.String => js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.^],
    password: Anon_Password,
    remove: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    set: (java.lang.String, atlassianDashCrowdDashClientLib.libModelsAttributesMod.^) => js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.^],
    username: Anon_Email
  ): Anon_Attributename = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), password = password, remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), username = username)
  
    __obj.asInstanceOf[Anon_Attributename]
  }
}

