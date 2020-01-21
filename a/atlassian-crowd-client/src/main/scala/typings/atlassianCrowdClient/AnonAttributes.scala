package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.userMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributes extends js.Object {
  var attributes: AnonAttributename = js.native
  var groups: AnonAdd = js.native
  def create(user: ^): js.Promise[^] = js.native
  def get(username: String): js.Promise[^] = js.native
  def get(username: String, withAttributes: Boolean): js.Promise[^] = js.native
  def remove(username: String): js.Promise[Unit] = js.native
  def rename(oldname: String, newname: String): js.Promise[Unit] = js.native
  def update(username: String, user: ^): js.Promise[^] = js.native
}

