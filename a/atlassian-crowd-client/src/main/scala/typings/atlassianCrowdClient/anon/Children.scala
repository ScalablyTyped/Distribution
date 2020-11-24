package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.groupMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  var attributes: Remove = js.native
  
  var children: Add = js.native
  
  def create(group: ^): js.Promise[^] = js.native
  
  def get(groupname: String): js.Promise[^] = js.native
  def get(groupname: String, withAttributes: Boolean): js.Promise[^] = js.native
  
  def membership(): js.Promise[String] = js.native
  
  var parents: AddGet = js.native
  
  def remove(groupname: String): js.Promise[Unit] = js.native
  
  def update(groupname: String, group: ^): js.Promise[^] = js.native
  
  var users: Get = js.native
}
