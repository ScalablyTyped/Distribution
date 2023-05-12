package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeysResponseEntry extends StObject {
  
  /**
    * The timestamp of when the API key was created, in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.
    */
  var CreateTime: js.Date
  
  /**
    * The optional description for the API key resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The timestamp for when the API key resource will expire, in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.
    */
  var ExpireTime: js.Date
  
  /**
    * The name of the API key resource.
    */
  var KeyName: ResourceName
  
  var Restrictions: ApiKeyRestrictions
  
  /**
    * The timestamp of when the API key was last updated, in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.
    */
  var UpdateTime: js.Date
}
object ListKeysResponseEntry {
  
  inline def apply(
    CreateTime: js.Date,
    ExpireTime: js.Date,
    KeyName: ResourceName,
    Restrictions: ApiKeyRestrictions,
    UpdateTime: js.Date
  ): ListKeysResponseEntry = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], ExpireTime = ExpireTime.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], Restrictions = Restrictions.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeysResponseEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKeysResponseEntry] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpireTime(value: js.Date): Self = StObject.set(x, "ExpireTime", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: ResourceName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setRestrictions(value: ApiKeyRestrictions): Self = StObject.set(x, "Restrictions", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
