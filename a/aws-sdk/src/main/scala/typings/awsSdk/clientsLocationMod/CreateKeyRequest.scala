package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyRequest extends StObject {
  
  /**
    * An optional description for the API key resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The optional timestamp for when the API key resource will expire in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. One of NoExpiry or ExpireTime must be set.
    */
  var ExpireTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A custom name for the API key resource. Requirements:   Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).    Must be a unique API key name.   No spaces allowed. For example, ExampleAPIKey.  
    */
  var KeyName: ResourceName
  
  /**
    * Optionally set to true to set no expiration time for the API key. One of NoExpiry or ExpireTime must be set.
    */
  var NoExpiry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The API key restrictions for the API key resource.
    */
  var Restrictions: ApiKeyRestrictions
  
  /**
    * Applies one or more tags to the map resource. A tag is a key-value pair that helps manage, identify, search, and filter your resources by labelling them. Format: "key" : "value"  Restrictions:   Maximum 50 tags per resource   Each resource tag must be unique with a maximum of one value.   Maximum key length: 128 Unicode characters in UTF-8   Maximum value length: 256 Unicode characters in UTF-8   Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.    Cannot use "aws:" as a prefix for a key.  
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateKeyRequest {
  
  inline def apply(KeyName: ResourceName, Restrictions: ApiKeyRestrictions): CreateKeyRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any], Restrictions = Restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpireTime(value: js.Date): Self = StObject.set(x, "ExpireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "ExpireTime", js.undefined)
    
    inline def setKeyName(value: ResourceName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setNoExpiry(value: Boolean): Self = StObject.set(x, "NoExpiry", value.asInstanceOf[js.Any])
    
    inline def setNoExpiryUndefined: Self = StObject.set(x, "NoExpiry", js.undefined)
    
    inline def setRestrictions(value: ApiKeyRestrictions): Self = StObject.set(x, "Restrictions", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
