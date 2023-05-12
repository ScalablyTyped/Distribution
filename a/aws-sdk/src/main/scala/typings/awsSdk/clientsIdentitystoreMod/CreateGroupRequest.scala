package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupRequest extends StObject {
  
  /**
    * A string containing the description of the group.
    */
  var Description: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing the name of the group. This value is commonly displayed when the group is referenced. "Administrator" and "AWSAdministrators" are reserved names and can't be used for users or groups.
    */
  var DisplayName: js.UndefOr[GroupDisplayName] = js.undefined
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
}
object CreateGroupRequest {
  
  inline def apply(IdentityStoreId: IdentityStoreId): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: SensitiveStringType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: GroupDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
  }
}
