package typings.`3box`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var metadata: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait Address extends StObject {
    
    var address: String
  }
  object Address {
    
    inline def apply(address: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddressServer extends StObject {
    
    var addressServer: js.UndefOr[String] = js.undefined
    
    var consentCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var ipfs: js.UndefOr[Any] = js.undefined
    
    var pinningNode: js.UndefOr[String] = js.undefined
  }
  object AddressServer {
    
    inline def apply(): AddressServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressServer]
    }
    
    extension [Self <: AddressServer](x: Self) {
      
      inline def setAddressServer(value: String): Self = StObject.set(x, "addressServer", value.asInstanceOf[js.Any])
      
      inline def setAddressServerUndefined: Self = StObject.set(x, "addressServer", js.undefined)
      
      inline def setConsentCallback(value: () => Unit): Self = StObject.set(x, "consentCallback", js.Any.fromFunction0(value))
      
      inline def setConsentCallbackUndefined: Self = StObject.set(x, "consentCallback", js.undefined)
      
      inline def setIpfs(value: Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      
      inline def setIpfsUndefined: Self = StObject.set(x, "ipfs", js.undefined)
      
      inline def setPinningNode(value: String): Self = StObject.set(x, "pinningNode", value.asInstanceOf[js.Any])
      
      inline def setPinningNodeUndefined: Self = StObject.set(x, "pinningNode", js.undefined)
    }
  }
  
  trait Audience extends StObject {
    
    var audience: js.UndefOr[String] = js.undefined
  }
  object Audience {
    
    inline def apply(): Audience = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Audience]
    }
    
    extension [Self <: Audience](x: Self) {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    }
  }
  
  trait Blocklist extends StObject {
    
    var addressServer: js.UndefOr[String] = js.undefined
    
    var blocklist: js.UndefOr[js.Function1[/* address */ String, Boolean]] = js.undefined
    
    var ipfs: js.UndefOr[Any] = js.undefined
    
    var metadata: js.UndefOr[String] = js.undefined
    
    var profileServer: js.UndefOr[String] = js.undefined
    
    var useCacheService: js.UndefOr[Boolean] = js.undefined
  }
  object Blocklist {
    
    inline def apply(): Blocklist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blocklist]
    }
    
    extension [Self <: Blocklist](x: Self) {
      
      inline def setAddressServer(value: String): Self = StObject.set(x, "addressServer", value.asInstanceOf[js.Any])
      
      inline def setAddressServerUndefined: Self = StObject.set(x, "addressServer", js.undefined)
      
      inline def setBlocklist(value: /* address */ String => Boolean): Self = StObject.set(x, "blocklist", js.Any.fromFunction1(value))
      
      inline def setBlocklistUndefined: Self = StObject.set(x, "blocklist", js.undefined)
      
      inline def setIpfs(value: Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      
      inline def setIpfsUndefined: Self = StObject.set(x, "ipfs", js.undefined)
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setProfileServer(value: String): Self = StObject.set(x, "profileServer", value.asInstanceOf[js.Any])
      
      inline def setProfileServerUndefined: Self = StObject.set(x, "profileServer", js.undefined)
      
      inline def setUseCacheService(value: Boolean): Self = StObject.set(x, "useCacheService", value.asInstanceOf[js.Any])
      
      inline def setUseCacheServiceUndefined: Self = StObject.set(x, "useCacheService", js.undefined)
    }
  }
  
  trait ConsentCallback extends StObject {
    
    var consentCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSyncDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ConsentCallback {
    
    inline def apply(): ConsentCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsentCallback]
    }
    
    extension [Self <: ConsentCallback](x: Self) {
      
      inline def setConsentCallback(value: () => Unit): Self = StObject.set(x, "consentCallback", js.Any.fromFunction0(value))
      
      inline def setConsentCallbackUndefined: Self = StObject.set(x, "consentCallback", js.undefined)
      
      inline def setOnSyncDone(value: () => Unit): Self = StObject.set(x, "onSyncDone", js.Any.fromFunction0(value))
      
      inline def setOnSyncDoneUndefined: Self = StObject.set(x, "onSyncDone", js.undefined)
    }
  }
  
  trait FirstModerator extends StObject {
    
    var firstModerator: js.UndefOr[String] = js.undefined
    
    var ghost: js.UndefOr[Boolean] = js.undefined
    
    var ghostBacklogLimit: js.UndefOr[Double] = js.undefined
    
    var members: js.UndefOr[Boolean] = js.undefined
    
    var noAutoSub: js.UndefOr[Boolean] = js.undefined
  }
  object FirstModerator {
    
    inline def apply(): FirstModerator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirstModerator]
    }
    
    extension [Self <: FirstModerator](x: Self) {
      
      inline def setFirstModerator(value: String): Self = StObject.set(x, "firstModerator", value.asInstanceOf[js.Any])
      
      inline def setFirstModeratorUndefined: Self = StObject.set(x, "firstModerator", js.undefined)
      
      inline def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      inline def setGhostBacklogLimit(value: Double): Self = StObject.set(x, "ghostBacklogLimit", value.asInstanceOf[js.Any])
      
      inline def setGhostBacklogLimitUndefined: Self = StObject.set(x, "ghostBacklogLimit", js.undefined)
      
      inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      inline def setMembers(value: Boolean): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      inline def setNoAutoSub(value: Boolean): Self = StObject.set(x, "noAutoSub", value.asInstanceOf[js.Any])
      
      inline def setNoAutoSubUndefined: Self = StObject.set(x, "noAutoSub", js.undefined)
    }
  }
  
  trait GraphqlServer extends StObject {
    
    var graphqlServer: js.UndefOr[String] = js.undefined
  }
  object GraphqlServer {
    
    inline def apply(): GraphqlServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphqlServer]
    }
    
    extension [Self <: GraphqlServer](x: Self) {
      
      inline def setGraphqlServer(value: String): Self = StObject.set(x, "graphqlServer", value.asInstanceOf[js.Any])
      
      inline def setGraphqlServerUndefined: Self = StObject.set(x, "graphqlServer", js.undefined)
    }
  }
  
  trait Members extends StObject {
    
    var firstModerator: js.UndefOr[String] = js.undefined
    
    var members: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Members {
    
    inline def apply(): Members = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Members]
    }
    
    extension [Self <: Members](x: Self) {
      
      inline def setFirstModerator(value: String): Self = StObject.set(x, "firstModerator", value.asInstanceOf[js.Any])
      
      inline def setFirstModeratorUndefined: Self = StObject.set(x, "firstModerator", js.undefined)
      
      inline def setMembers(value: String): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Metadata extends StObject {
    
    var blocklist: js.UndefOr[Any] = js.undefined
    
    var metadata: js.UndefOr[String] = js.undefined
    
    var profileServer: js.UndefOr[String] = js.undefined
  }
  object Metadata {
    
    inline def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setBlocklist(value: Any): Self = StObject.set(x, "blocklist", value.asInstanceOf[js.Any])
      
      inline def setBlocklistUndefined: Self = StObject.set(x, "blocklist", js.undefined)
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setProfileServer(value: String): Self = StObject.set(x, "profileServer", value.asInstanceOf[js.Any])
      
      inline def setProfileServerUndefined: Self = StObject.set(x, "profileServer", js.undefined)
    }
  }
  
  trait NoAutoSub extends StObject {
    
    var noAutoSub: js.UndefOr[Boolean] = js.undefined
  }
  object NoAutoSub {
    
    inline def apply(): NoAutoSub = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoAutoSub]
    }
    
    extension [Self <: NoAutoSub](x: Self) {
      
      inline def setNoAutoSub(value: Boolean): Self = StObject.set(x, "noAutoSub", value.asInstanceOf[js.Any])
      
      inline def setNoAutoSubUndefined: Self = StObject.set(x, "noAutoSub", js.undefined)
    }
  }
  
  trait ProfileServer extends StObject {
    
    var profileServer: js.UndefOr[String] = js.undefined
  }
  object ProfileServer {
    
    inline def apply(): ProfileServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfileServer]
    }
    
    extension [Self <: ProfileServer](x: Self) {
      
      inline def setProfileServer(value: String): Self = StObject.set(x, "profileServer", value.asInstanceOf[js.Any])
      
      inline def setProfileServerUndefined: Self = StObject.set(x, "profileServer", js.undefined)
    }
  }
  
  trait SignJWT extends StObject {
    
    def signJWT(claim: String): String
  }
  object SignJWT {
    
    inline def apply(signJWT: String => String): SignJWT = {
      val __obj = js.Dynamic.literal(signJWT = js.Any.fromFunction1(signJWT))
      __obj.asInstanceOf[SignJWT]
    }
    
    extension [Self <: SignJWT](x: Self) {
      
      inline def setSignJWT(value: String => String): Self = StObject.set(x, "signJWT", js.Any.fromFunction1(value))
    }
  }
}
