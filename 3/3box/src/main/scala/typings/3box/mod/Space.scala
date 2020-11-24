package typings.`3box`.mod

import typings.`3box`.anon.FirstModerator
import typings.`3box`.anon.Members
import typings.`3box`.anon.NoAutoSub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Space extends js.Object {
  
  def createConfidentialThread(name: String): js.Promise[Thread] = js.native
  
  def joinThread(name: String): js.Promise[Thread] = js.native
  def joinThread(name: String, opts: FirstModerator): js.Promise[Thread] = js.native
  
  def joinThreadByAddress(address: String, name: String): js.Promise[Thread] = js.native
  def joinThreadByAddress(address: String, name: String, opts: NoAutoSub): js.Promise[Thread] = js.native
  
  var `private`: Storage = js.native
  
  var public: Storage = js.native
  
  def subscribeThread(address: String, config: js.Object): js.Promise[Thread] = js.native
  def subscribeThread(address: String, config: js.Object, opts: Members): js.Promise[Thread] = js.native
  
  def subscribedThreads(): Unit = js.native
  
  def unsubscribeThread(): Unit = js.native
  def unsubscribeThread(address: String): Unit = js.native
}
