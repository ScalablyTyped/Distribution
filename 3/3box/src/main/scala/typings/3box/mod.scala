package typings.`3box`

import typings.`3box`.anon.Address
import typings.`3box`.anon.AddressServer
import typings.`3box`.anon.Audience
import typings.`3box`.anon.Blocklist
import typings.`3box`.anon.BlocklistMetadata
import typings.`3box`.anon.ConsentCallback
import typings.`3box`.anon.FirstModerator
import typings.`3box`.anon.GraphqlServer
import typings.`3box`.anon.Members
import typings.`3box`.anon.Metadata
import typings.`3box`.anon.NoAutoSub
import typings.`3box`.anon.ProfileServer
import typings.`3box`.anon.SignJWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("3box", JSImport.Namespace)
  @js.native
  class ^ () extends Box
  
  /* static member */
  @JSImport("3box", "create")
  @js.native
  def create(ethereumProvider: js.Any): js.Promise[Box] = js.native
  
  /* static member */
  @JSImport("3box", "getConfig")
  @js.native
  def getConfig(address: String): js.Promise[js.Object] = js.native
  @JSImport("3box", "getConfig")
  @js.native
  def getConfig(address: String, opts: ProfileServer): js.Promise[js.Object] = js.native
  
  /* static member */
  @JSImport("3box", "getProfile")
  @js.native
  def getProfile(address: String): js.Promise[_] = js.native
  @JSImport("3box", "getProfile")
  @js.native
  def getProfile(address: String, opts: Blocklist): js.Promise[_] = js.native
  
  /* static member */
  @JSImport("3box", "getProfiles")
  @js.native
  def getProfiles(address: String): js.Promise[js.Object] = js.native
  @JSImport("3box", "getProfiles")
  @js.native
  def getProfiles(address: String, opts: ProfileServer): js.Promise[js.Object] = js.native
  
  /* static member */
  @JSImport("3box", "getSpace")
  @js.native
  def getSpace(address: String, name: String): js.Promise[js.Object] = js.native
  @JSImport("3box", "getSpace")
  @js.native
  def getSpace(address: String, name: String, opts: BlocklistMetadata): js.Promise[js.Object] = js.native
  
  /* static member */
  @JSImport("3box", "getThread")
  @js.native
  def getThread(space: String, name: String, firstModerator: String, members: Boolean): js.Promise[js.Array[ThreadPost]] = js.native
  @JSImport("3box", "getThread")
  @js.native
  def getThread(space: String, name: String, firstModerator: String, members: Boolean, opts: ProfileServer): js.Promise[js.Array[ThreadPost]] = js.native
  
  /* static member */
  @JSImport("3box", "getThreadByAddress")
  @js.native
  def getThreadByAddress(address: String): js.Promise[js.Array[ThreadPost]] = js.native
  @JSImport("3box", "getThreadByAddress")
  @js.native
  def getThreadByAddress(address: String, opts: ProfileServer): js.Promise[js.Array[ThreadPost]] = js.native
  
  /* static member */
  @JSImport("3box", "getVerifiedAccounts")
  @js.native
  def getVerifiedAccounts(profile: js.Object): js.Promise[js.Object] = js.native
  
  /* static member */
  object idUtils {
    
    @JSImport("3box", "idUtils.isClaim")
    @js.native
    def isClaim(claim: String): js.Promise[Boolean] = js.native
    @JSImport("3box", "idUtils.isClaim")
    @js.native
    def isClaim(claim: String, opts: Audience): js.Promise[Boolean] = js.native
    
    @JSImport("3box", "idUtils.isMuportDID")
    @js.native
    def isMuportDID(address: String): js.Promise[Boolean] = js.native
    
    @JSImport("3box", "idUtils.verifyClaim")
    @js.native
    def verifyClaim(claim: String): js.Promise[js.Object] = js.native
    @JSImport("3box", "idUtils.verifyClaim")
    @js.native
    def verifyClaim(claim: String, opts: Audience): js.Promise[js.Object] = js.native
  }
  
  /* static member */
  @JSImport("3box", "isLoggedIn")
  @js.native
  def isLoggedIn(address: String): Boolean = js.native
  
  /* static member */
  @JSImport("3box", "listSpaces")
  @js.native
  def listSpaces(address: String): js.Promise[js.Object] = js.native
  @JSImport("3box", "listSpaces")
  @js.native
  def listSpaces(address: String, opts: ProfileServer): js.Promise[js.Object] = js.native
  
  /* static member */
  @JSImport("3box", "openBox")
  @js.native
  def openBox(address: String, ethereumProvider: js.Any): js.Promise[Box] = js.native
  @JSImport("3box", "openBox")
  @js.native
  def openBox(address: String, ethereumProvider: js.Any, opts: AddressServer): js.Promise[Box] = js.native
  
  /* static member */
  @JSImport("3box", "profileGraphQL")
  @js.native
  def profileGraphQL(query: js.Object): js.Promise[js.Object] = js.native
  @JSImport("3box", "profileGraphQL")
  @js.native
  def profileGraphQL(query: js.Object, opts: GraphqlServer): js.Promise[js.Object] = js.native
  
  @js.native
  trait Box extends StObject {
    
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
  
  @js.native
  trait Link extends StObject {
    
    var proof: String = js.native
    
    var `type`: String = js.native
  }
  object Link {
    
    @scala.inline
    def apply(proof: String, `type`: String): Link = {
      val __obj = js.Dynamic.literal(proof = proof.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProof(value: String): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Query extends StObject {
    
    var address: String = js.native
    
    var `type`: String = js.native
  }
  object Query {
    
    @scala.inline
    def apply(address: String, `type`: String): Query = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Space extends StObject {
    
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
  
  @js.native
  trait Storage extends StObject {
    
    def all(): js.Promise[js.UndefOr[js.Array[_]]] = js.native
    def all(opts: Metadata): js.Promise[js.UndefOr[js.Array[_]]] = js.native
    
    def get(key: String): js.Promise[_] = js.native
    
    def getMetadata(key: String): js.Promise[_] = js.native
    
    def log(): js.Array[StorageLog] = js.native
    
    def remove(key: String): js.Promise[Boolean] = js.native
    
    def set(key: String, value: js.Any): js.Promise[Boolean] = js.native
    
    def setMultiple(keys: js.Array[String], values: js.Array[_]): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait StorageLog extends StObject {
    
    var key: String = js.native
    
    var op: String = js.native
    
    var timeStamp: Double = js.native
    
    var value: js.Any = js.native
  }
  object StorageLog {
    
    @scala.inline
    def apply(key: String, op: String, timeStamp: Double, value: js.Any): StorageLog = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageLog]
    }
    
    @scala.inline
    implicit class StorageLogMutableBuilder[Self <: StorageLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Thread extends StObject {
    
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
  
  @js.native
  trait ThreadPost extends StObject {
    
    var author: String = js.native
    
    var message: js.Any = js.native
    
    var postId: String = js.native
    
    var timestamp: Double = js.native
  }
  object ThreadPost {
    
    @scala.inline
    def apply(author: String, message: js.Any, postId: String, timestamp: Double): ThreadPost = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], postId = postId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreadPost]
    }
    
    @scala.inline
    implicit class ThreadPostMutableBuilder[Self <: ThreadPost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
