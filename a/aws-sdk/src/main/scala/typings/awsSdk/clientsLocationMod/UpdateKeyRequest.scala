package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateKeyRequest extends StObject {
  
  /**
    * Updates the description for the API key resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * Updates the timestamp for when the API key resource will expire in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var ExpireTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The boolean flag to be included for updating ExpireTime or Restrictions details. Must be set to true to update an API key resource that has been used in the past 7 days.  False if force update is not preferred Default value: False 
    */
  var ForceUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the API key resource to update.
    */
  var KeyName: ResourceName
  
  /**
    * Whether the API key should expire. Set to true to set the API key to have no expiration time.
    */
  var NoExpiry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Updates the API key restrictions for the API key resource.
    */
  var Restrictions: js.UndefOr[ApiKeyRestrictions] = js.undefined
}
object UpdateKeyRequest {
  
  inline def apply(KeyName: ResourceName): UpdateKeyRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpireTime(value: js.Date): Self = StObject.set(x, "ExpireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "ExpireTime", js.undefined)
    
    inline def setForceUpdate(value: Boolean): Self = StObject.set(x, "ForceUpdate", value.asInstanceOf[js.Any])
    
    inline def setForceUpdateUndefined: Self = StObject.set(x, "ForceUpdate", js.undefined)
    
    inline def setKeyName(value: ResourceName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setNoExpiry(value: Boolean): Self = StObject.set(x, "NoExpiry", value.asInstanceOf[js.Any])
    
    inline def setNoExpiryUndefined: Self = StObject.set(x, "NoExpiry", js.undefined)
    
    inline def setRestrictions(value: ApiKeyRestrictions): Self = StObject.set(x, "Restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "Restrictions", js.undefined)
  }
}
