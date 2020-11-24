package typings.`3box`.mod

import typings.`3box`.anon.AddressServer
import typings.`3box`.anon.Blocklist
import typings.`3box`.anon.BlocklistMetadata
import typings.`3box`.anon.GraphqlServer
import typings.`3box`.anon.IsClaim
import typings.`3box`.anon.ProfileServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("3box", JSImport.Namespace)
@js.native
class ^ () extends Box
@JSImport("3box", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def create(ethereumProvider: js.Any): js.Promise[Box] = js.native
  
  def getConfig(address: String): js.Promise[js.Object] = js.native
  def getConfig(address: String, opts: ProfileServer): js.Promise[js.Object] = js.native
  
  def getProfile(address: String): js.Promise[_] = js.native
  def getProfile(address: String, opts: Blocklist): js.Promise[_] = js.native
  
  def getProfiles(address: String): js.Promise[js.Object] = js.native
  def getProfiles(address: String, opts: ProfileServer): js.Promise[js.Object] = js.native
  
  def getSpace(address: String, name: String): js.Promise[js.Object] = js.native
  def getSpace(address: String, name: String, opts: BlocklistMetadata): js.Promise[js.Object] = js.native
  
  def getThread(space: String, name: String, firstModerator: String, members: Boolean): js.Promise[js.Array[ThreadPost]] = js.native
  def getThread(space: String, name: String, firstModerator: String, members: Boolean, opts: ProfileServer): js.Promise[js.Array[ThreadPost]] = js.native
  
  def getThreadByAddress(address: String): js.Promise[js.Array[ThreadPost]] = js.native
  def getThreadByAddress(address: String, opts: ProfileServer): js.Promise[js.Array[ThreadPost]] = js.native
  
  def getVerifiedAccounts(profile: js.Object): js.Promise[js.Object] = js.native
  
  var idUtils: IsClaim = js.native
  
  def isLoggedIn(address: String): Boolean = js.native
  
  def listSpaces(address: String): js.Promise[js.Object] = js.native
  def listSpaces(address: String, opts: ProfileServer): js.Promise[js.Object] = js.native
  
  def openBox(address: String, ethereumProvider: js.Any): js.Promise[Box] = js.native
  def openBox(address: String, ethereumProvider: js.Any, opts: AddressServer): js.Promise[Box] = js.native
  
  def profileGraphQL(query: js.Object): js.Promise[js.Object] = js.native
  def profileGraphQL(query: js.Object, opts: GraphqlServer): js.Promise[js.Object] = js.native
}
