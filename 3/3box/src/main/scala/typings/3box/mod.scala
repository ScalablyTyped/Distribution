package typings.`3box`

import typings.`3box`.anon.Address
import typings.`3box`.anon.AddressServer
import typings.`3box`.anon.Audience
import typings.`3box`.anon.Blocklist
import typings.`3box`.anon.ConsentCallback
import typings.`3box`.anon.FirstModerator
import typings.`3box`.anon.GraphqlServer
import typings.`3box`.anon.Members
import typings.`3box`.anon.Metadata
import typings.`3box`.anon.NoAutoSub
import typings.`3box`.anon.ProfileServer
import typings.`3box`.anon.SignJWT
import typings.`3box`.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("3box", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Box
  @JSImport("3box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(ethereumProvider: Any): js.Promise[Box] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(ethereumProvider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Box]]
  
  /* static member */
  inline def getConfig(address: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  inline def getConfig(address: String, opts: ProfileServer): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(address.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  /* static member */
  inline def getProfile(address: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfile")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def getProfile(address: String, opts: Blocklist): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProfile")(address.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /* static member */
  inline def getProfiles(address: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfiles")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  inline def getProfiles(address: String, opts: ProfileServer): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProfiles")(address.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  /* static member */
  inline def getSpace(address: String, name: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpace")(address.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  inline def getSpace(address: String, name: String, opts: Metadata): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpace")(address.asInstanceOf[js.Any], name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  /* static member */
  inline def getThread(space: String, name: String, firstModerator: String, members: Boolean): js.Promise[js.Array[ThreadPost]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getThread")(space.asInstanceOf[js.Any], name.asInstanceOf[js.Any], firstModerator.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ThreadPost]]]
  inline def getThread(space: String, name: String, firstModerator: String, members: Boolean, opts: ProfileServer): js.Promise[js.Array[ThreadPost]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getThread")(space.asInstanceOf[js.Any], name.asInstanceOf[js.Any], firstModerator.asInstanceOf[js.Any], members.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ThreadPost]]]
  
  /* static member */
  inline def getThreadByAddress(address: String): js.Promise[js.Array[ThreadPost]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThreadByAddress")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ThreadPost]]]
  inline def getThreadByAddress(address: String, opts: ProfileServer): js.Promise[js.Array[ThreadPost]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getThreadByAddress")(address.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ThreadPost]]]
  
  /* static member */
  inline def getVerifiedAccounts(profile: js.Object): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVerifiedAccounts")(profile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  /* static member */
  object idUtils {
    
    @JSImport("3box", "idUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isClaim(claim: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isClaim")(claim.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def isClaim(claim: String, opts: Audience): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isClaim")(claim.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def isMuportDID(address: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isMuportDID")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def verifyClaim(claim: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyClaim")(claim.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
    inline def verifyClaim(claim: String, opts: Audience): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyClaim")(claim.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  }
  
  /* static member */
  inline def isLoggedIn(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoggedIn")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def listSpaces(address: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("listSpaces")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  inline def listSpaces(address: String, opts: ProfileServer): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("listSpaces")(address.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  /* static member */
  inline def openBox(address: String, ethereumProvider: Any): js.Promise[Box] = (^.asInstanceOf[js.Dynamic].applyDynamic("openBox")(address.asInstanceOf[js.Any], ethereumProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Box]]
  inline def openBox(address: String, ethereumProvider: Any, opts: AddressServer): js.Promise[Box] = (^.asInstanceOf[js.Dynamic].applyDynamic("openBox")(address.asInstanceOf[js.Any], ethereumProvider.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Box]]
  
  /* static member */
  inline def profileGraphQL(query: js.Object): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("profileGraphQL")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  inline def profileGraphQL(query: js.Object, opts: GraphqlServer): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("profileGraphQL")(query.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
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
  
  trait Link extends StObject {
    
    var proof: String
    
    var `type`: String
  }
  object Link {
    
    inline def apply(proof: String, `type`: String): Link = {
      val __obj = js.Dynamic.literal(proof = proof.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      inline def setProof(value: String): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Query extends StObject {
    
    var address: String
    
    var `type`: String
  }
  object Query {
    
    inline def apply(address: String, `type`: String): Query = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    def all(): js.Promise[js.UndefOr[js.Array[Any]]] = js.native
    def all(opts: `0`): js.Promise[js.UndefOr[js.Array[Any]]] = js.native
    
    def get(key: String): js.Promise[Any] = js.native
    
    def getMetadata(key: String): js.Promise[Any] = js.native
    
    def log(): js.Array[StorageLog] = js.native
    
    def remove(key: String): js.Promise[Boolean] = js.native
    
    def set(key: String, value: Any): js.Promise[Boolean] = js.native
    
    def setMultiple(keys: js.Array[String], values: js.Array[Any]): js.Promise[Boolean] = js.native
  }
  
  trait StorageLog extends StObject {
    
    var key: String
    
    var op: String
    
    var timeStamp: Double
    
    var value: Any
  }
  object StorageLog {
    
    inline def apply(key: String, op: String, timeStamp: Double, value: Any): StorageLog = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageLog]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageLog] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    def post(message: Any): js.Promise[Unit] = js.native
    def post(message: Any, to: String): js.Promise[Unit] = js.native
  }
  
  trait ThreadPost extends StObject {
    
    var author: String
    
    var message: Any
    
    var postId: String
    
    var timestamp: Double
  }
  object ThreadPost {
    
    inline def apply(author: String, message: Any, postId: String, timestamp: Double): ThreadPost = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], postId = postId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreadPost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThreadPost] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
