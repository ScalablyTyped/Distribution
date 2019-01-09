package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Attributes extends js.Object {
  var attributes: Anon_Attributename = js.native
  var groups: Anon_Add = js.native
  def create(user: atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced): js.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced] = js.native
  def get(username: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced] = js.native
  def get(username: java.lang.String, withAttributes: scala.Boolean): js.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced] = js.native
  def remove(username: java.lang.String): js.Promise[scala.Unit] = js.native
  def rename(oldname: java.lang.String, newname: java.lang.String): js.Promise[scala.Unit] = js.native
  def update(username: java.lang.String, user: atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced): js.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced] = js.native
}

