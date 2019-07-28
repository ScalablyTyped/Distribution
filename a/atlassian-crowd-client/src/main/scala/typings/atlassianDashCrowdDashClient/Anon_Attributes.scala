package typings.atlassianDashCrowdDashClient

import typings.atlassianDashCrowdDashClient.libModelsUserMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Attributes extends js.Object {
  var attributes: Anon_Attributename = js.native
  var groups: Anon_Add = js.native
  def create(user: ^): js.Promise[^] = js.native
  def get(username: String): js.Promise[^] = js.native
  def get(username: String, withAttributes: Boolean): js.Promise[^] = js.native
  def remove(username: String): js.Promise[Unit] = js.native
  def rename(oldname: String, newname: String): js.Promise[Unit] = js.native
  def update(username: String, user: ^): js.Promise[^] = js.native
}

