package typings.`3box`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
  }
  object Address {
    
    @scala.inline
    def apply(address: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddressServer extends StObject {
    
    var addressServer: js.UndefOr[String] = js.undefined
    
    var consentCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var ipfs: js.UndefOr[js.Any] = js.undefined
    
    var pinningNode: js.UndefOr[String] = js.undefined
  }
  object AddressServer {
    
    @scala.inline
    def apply(): AddressServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressServer]
    }
    
    @scala.inline
    implicit class AddressServerMutableBuilder[Self <: AddressServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressServer(value: String): Self = StObject.set(x, "addressServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressServerUndefined: Self = StObject.set(x, "addressServer", js.undefined)
      
      @scala.inline
      def setConsentCallback(value: () => Unit): Self = StObject.set(x, "consentCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConsentCallbackUndefined: Self = StObject.set(x, "consentCallback", js.undefined)
      
      @scala.inline
      def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpfsUndefined: Self = StObject.set(x, "ipfs", js.undefined)
      
      @scala.inline
      def setPinningNode(value: String): Self = StObject.set(x, "pinningNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinningNodeUndefined: Self = StObject.set(x, "pinningNode", js.undefined)
    }
  }
  
  trait Audience extends StObject {
    
    var audience: js.UndefOr[String] = js.undefined
  }
  object Audience {
    
    @scala.inline
    def apply(): Audience = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Audience]
    }
    
    @scala.inline
    implicit class AudienceMutableBuilder[Self <: Audience] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    }
  }
  
  trait Blocklist extends StObject {
    
    var addressServer: js.UndefOr[String] = js.undefined
    
    var blocklist: js.UndefOr[js.Function1[/* address */ String, Boolean]] = js.undefined
    
    var ipfs: js.UndefOr[js.Any] = js.undefined
    
    var metadata: js.UndefOr[String] = js.undefined
    
    var profileServer: js.UndefOr[String] = js.undefined
    
    var useCacheService: js.UndefOr[Boolean] = js.undefined
  }
  object Blocklist {
    
    @scala.inline
    def apply(): Blocklist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blocklist]
    }
    
    @scala.inline
    implicit class BlocklistMutableBuilder[Self <: Blocklist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressServer(value: String): Self = StObject.set(x, "addressServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressServerUndefined: Self = StObject.set(x, "addressServer", js.undefined)
      
      @scala.inline
      def setBlocklist(value: /* address */ String => Boolean): Self = StObject.set(x, "blocklist", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlocklistUndefined: Self = StObject.set(x, "blocklist", js.undefined)
      
      @scala.inline
      def setIpfs(value: js.Any): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpfsUndefined: Self = StObject.set(x, "ipfs", js.undefined)
      
      @scala.inline
      def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setProfileServer(value: String): Self = StObject.set(x, "profileServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileServerUndefined: Self = StObject.set(x, "profileServer", js.undefined)
      
      @scala.inline
      def setUseCacheService(value: Boolean): Self = StObject.set(x, "useCacheService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCacheServiceUndefined: Self = StObject.set(x, "useCacheService", js.undefined)
    }
  }
  
  trait BlocklistMetadata extends StObject {
    
    var blocklist: js.UndefOr[js.Any] = js.undefined
    
    var metadata: js.UndefOr[String] = js.undefined
    
    var profileServer: js.UndefOr[String] = js.undefined
  }
  object BlocklistMetadata {
    
    @scala.inline
    def apply(): BlocklistMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlocklistMetadata]
    }
    
    @scala.inline
    implicit class BlocklistMetadataMutableBuilder[Self <: BlocklistMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocklist(value: js.Any): Self = StObject.set(x, "blocklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocklistUndefined: Self = StObject.set(x, "blocklist", js.undefined)
      
      @scala.inline
      def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setProfileServer(value: String): Self = StObject.set(x, "profileServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileServerUndefined: Self = StObject.set(x, "profileServer", js.undefined)
    }
  }
  
  trait ConsentCallback extends StObject {
    
    var consentCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSyncDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ConsentCallback {
    
    @scala.inline
    def apply(): ConsentCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsentCallback]
    }
    
    @scala.inline
    implicit class ConsentCallbackMutableBuilder[Self <: ConsentCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsentCallback(value: () => Unit): Self = StObject.set(x, "consentCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConsentCallbackUndefined: Self = StObject.set(x, "consentCallback", js.undefined)
      
      @scala.inline
      def setOnSyncDone(value: () => Unit): Self = StObject.set(x, "onSyncDone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSyncDoneUndefined: Self = StObject.set(x, "onSyncDone", js.undefined)
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
    
    @scala.inline
    def apply(): FirstModerator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirstModerator]
    }
    
    @scala.inline
    implicit class FirstModeratorMutableBuilder[Self <: FirstModerator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstModerator(value: String): Self = StObject.set(x, "firstModerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstModeratorUndefined: Self = StObject.set(x, "firstModerator", js.undefined)
      
      @scala.inline
      def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhostBacklogLimit(value: Double): Self = StObject.set(x, "ghostBacklogLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhostBacklogLimitUndefined: Self = StObject.set(x, "ghostBacklogLimit", js.undefined)
      
      @scala.inline
      def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      @scala.inline
      def setMembers(value: Boolean): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setNoAutoSub(value: Boolean): Self = StObject.set(x, "noAutoSub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAutoSubUndefined: Self = StObject.set(x, "noAutoSub", js.undefined)
    }
  }
  
  trait GraphqlServer extends StObject {
    
    var graphqlServer: js.UndefOr[String] = js.undefined
  }
  object GraphqlServer {
    
    @scala.inline
    def apply(): GraphqlServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphqlServer]
    }
    
    @scala.inline
    implicit class GraphqlServerMutableBuilder[Self <: GraphqlServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGraphqlServer(value: String): Self = StObject.set(x, "graphqlServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphqlServerUndefined: Self = StObject.set(x, "graphqlServer", js.undefined)
    }
  }
  
  trait Members extends StObject {
    
    var firstModerator: js.UndefOr[String] = js.undefined
    
    var members: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Members {
    
    @scala.inline
    def apply(): Members = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Members]
    }
    
    @scala.inline
    implicit class MembersMutableBuilder[Self <: Members] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstModerator(value: String): Self = StObject.set(x, "firstModerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstModeratorUndefined: Self = StObject.set(x, "firstModerator", js.undefined)
      
      @scala.inline
      def setMembers(value: String): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Metadata extends StObject {
    
    var metadata: js.UndefOr[Boolean] = js.undefined
  }
  object Metadata {
    
    @scala.inline
    def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait NoAutoSub extends StObject {
    
    var noAutoSub: js.UndefOr[Boolean] = js.undefined
  }
  object NoAutoSub {
    
    @scala.inline
    def apply(): NoAutoSub = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoAutoSub]
    }
    
    @scala.inline
    implicit class NoAutoSubMutableBuilder[Self <: NoAutoSub] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoAutoSub(value: Boolean): Self = StObject.set(x, "noAutoSub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAutoSubUndefined: Self = StObject.set(x, "noAutoSub", js.undefined)
    }
  }
  
  trait ProfileServer extends StObject {
    
    var profileServer: js.UndefOr[String] = js.undefined
  }
  object ProfileServer {
    
    @scala.inline
    def apply(): ProfileServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfileServer]
    }
    
    @scala.inline
    implicit class ProfileServerMutableBuilder[Self <: ProfileServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfileServer(value: String): Self = StObject.set(x, "profileServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileServerUndefined: Self = StObject.set(x, "profileServer", js.undefined)
    }
  }
  
  trait SignJWT extends StObject {
    
    def signJWT(claim: String): String
  }
  object SignJWT {
    
    @scala.inline
    def apply(signJWT: String => String): SignJWT = {
      val __obj = js.Dynamic.literal(signJWT = js.Any.fromFunction1(signJWT))
      __obj.asInstanceOf[SignJWT]
    }
    
    @scala.inline
    implicit class SignJWTMutableBuilder[Self <: SignJWT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignJWT(value: String => String): Self = StObject.set(x, "signJWT", js.Any.fromFunction1(value))
    }
  }
}
