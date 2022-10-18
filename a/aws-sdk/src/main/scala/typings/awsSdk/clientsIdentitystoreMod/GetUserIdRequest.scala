package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserIdRequest extends StObject {
  
  /**
    * A unique identifier for a user or group that is not the primary identifier. This value can be an identifier from an external identity provider (IdP) that is associated with the user, the group, or a unique attribute. For example, a unique UserDisplayName.
    */
  var AlternateIdentifier: typings.awsSdk.clientsIdentitystoreMod.AlternateIdentifier
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
}
object GetUserIdRequest {
  
  inline def apply(AlternateIdentifier: AlternateIdentifier, IdentityStoreId: IdentityStoreId): GetUserIdRequest = {
    val __obj = js.Dynamic.literal(AlternateIdentifier = AlternateIdentifier.asInstanceOf[js.Any], IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserIdRequest]
  }
  
  extension [Self <: GetUserIdRequest](x: Self) {
    
    inline def setAlternateIdentifier(value: AlternateIdentifier): Self = StObject.set(x, "AlternateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
  }
}
