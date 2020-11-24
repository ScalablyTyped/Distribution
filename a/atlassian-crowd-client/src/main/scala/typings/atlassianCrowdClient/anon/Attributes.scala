package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.userMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  var attributes: List = js.native
  
  def create(user: ^): js.Promise[^] = js.native
  
  def get(username: String): js.Promise[^] = js.native
  def get(username: String, withAttributes: Boolean): js.Promise[^] = js.native
  
  var groups: Add = js.native
  
  def remove(username: String): js.Promise[Unit] = js.native
  
  def rename(oldname: String, newname: String): js.Promise[Unit] = js.native
  
  def update(username: String, user: ^): js.Promise[^] = js.native
}
