package typings.`3box`.mod

import typings.`3box`.anon.Address
import typings.`3box`.anon.ConsentCallback
import typings.`3box`.anon.SignJWT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Box extends js.Object {
  
  var DID: String = js.native
  
  var _3id: SignJWT = js.native
  
  def auth(space: js.Array[String], user: Address): Unit = js.native
  
  def isAddressLinked(queries: js.Array[Query]): Unit = js.native
  
  def linkAddress(links: js.Array[Link]): Unit = js.native
  
  def listAddressLinks(): js.Array[Link] = js.native
  
  def logout(): Unit = js.native
  
  def onSyncDone(syncDoneFn: js.Function0[Unit]): Unit = js.native
  
  def openSpace(name: String): js.Promise[Space] = js.native
  def openSpace(name: String, opts: ConsentCallback): js.Promise[Space] = js.native
  
  var `private`: Storage = js.native
  
  var public: Storage = js.native
  
  def removeAddressLink(address: String): js.Promise[Unit] = js.native
  
  var syncDone: js.Promise[Space] = js.native
}
