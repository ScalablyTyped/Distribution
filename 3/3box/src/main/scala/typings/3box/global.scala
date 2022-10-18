package typings.`3box`

import typings.`3box`.anon.AddressServer
import typings.`3box`.anon.Audience
import typings.`3box`.anon.Blocklist
import typings.`3box`.anon.ConsentCallback
import typings.`3box`.anon.GraphqlServer
import typings.`3box`.anon.ProfileServer
import typings.`3box`.mod.ThreadPost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Box {
    
    @JSGlobal("Box")
    @js.native
    open class ^ ()
      extends typings.`3box`.mod.^
    
    @JSGlobal("Box")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(ethereumProvider: Any): js.Promise[typings.`3box`.mod.Box] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(ethereumProvider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.`3box`.mod.Box]]
    
    /* static member */
    inline def getConfig(address: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
    inline def getConfig(address: String, opts: ProfileServer): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(address.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
    
    /* static member */
    inline def getProfile(address: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfile")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def getProfile(address: String, opts: AddressServer): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProfile")(address.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /* static member */
    inline def getProfiles(address: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfiles")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
    inline def getProfiles(address: String, opts: ProfileServer): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProfiles")(address.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
    
    /* static member */
    inline def getSpace(address: String, name: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpace")(address.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
    inline def getSpace(address: String, name: String, opts: Blocklist): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpace")(address.asInstanceOf[js.Any], name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
    
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
      
      @JSGlobal("Box.idUtils")
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
    inline def openBox(address: String, ethereumProvider: Any): js.Promise[typings.`3box`.mod.Box] = (^.asInstanceOf[js.Dynamic].applyDynamic("openBox")(address.asInstanceOf[js.Any], ethereumProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.`3box`.mod.Box]]
    inline def openBox(address: String, ethereumProvider: Any, opts: ConsentCallback): js.Promise[typings.`3box`.mod.Box] = (^.asInstanceOf[js.Dynamic].applyDynamic("openBox")(address.asInstanceOf[js.Any], ethereumProvider.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.`3box`.mod.Box]]
    
    /* static member */
    inline def profileGraphQL(query: js.Object): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("profileGraphQL")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
    inline def profileGraphQL(query: js.Object, opts: GraphqlServer): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("profileGraphQL")(query.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  }
}
