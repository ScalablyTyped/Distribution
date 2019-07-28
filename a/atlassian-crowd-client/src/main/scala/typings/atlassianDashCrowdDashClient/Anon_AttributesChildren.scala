package typings.atlassianDashCrowdDashClient

import typings.atlassianDashCrowdDashClient.libModelsGroupMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AttributesChildren extends js.Object {
  var attributes: Anon_AttributenameAttributes = js.native
  var children: Anon_Add = js.native
  var parents: Anon_AddGet = js.native
  var users: Anon_AddExpand = js.native
  def create(group: ^): js.Promise[^] = js.native
  def get(groupname: String): js.Promise[^] = js.native
  def get(groupname: String, withAttributes: Boolean): js.Promise[^] = js.native
  def membership(): js.Promise[String] = js.native
  def remove(groupname: String): js.Promise[Unit] = js.native
  def update(groupname: String, group: ^): js.Promise[^] = js.native
}

