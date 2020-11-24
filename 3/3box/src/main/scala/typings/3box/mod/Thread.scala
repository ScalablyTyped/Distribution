package typings.`3box`.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thread extends js.Object {
  
  def addMember(id: String): js.Promise[Unit] = js.native
  
  def addModerator(id: String): js.Promise[Unit] = js.native
  
  def deletePost(id: String): js.Promise[Unit] = js.native
  
  def getPosts(): js.Promise[js.Array[ThreadPost]] = js.native
  
  def listMembers(): js.Promise[js.Array[String]] = js.native
  
  def listModerators(): js.Promise[js.Array[String]] = js.native
  
  def onNewCapabilities(updateFn: js.Function0[Unit]): Unit = js.native
  
  def onUpdate(updateFn: js.Function0[Unit]): Unit = js.native
  
  def post(message: js.Any): js.Promise[Unit] = js.native
  def post(message: js.Any, to: String): js.Promise[Unit] = js.native
}
