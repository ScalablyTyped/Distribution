package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeyResponse extends StObject {
  
  /**
    * The timestamp for when the API key resource was created in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var CreateTime: js.Date
  
  /**
    * The optional description for the API key resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The timestamp for when the API key resource will expire in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var ExpireTime: js.Date
  
  /**
    * The key value/string of an API key.
    */
  var Key: ApiKey
  
  /**
    * The Amazon Resource Name (ARN) for the API key resource. Used when you need to specify a resource across all Amazon Web Services.   Format example: arn:aws:geo:region:account-id:key/ExampleKey   
    */
  var KeyArn: Arn
  
  /**
    * The name of the API key resource.
    */
  var KeyName: ResourceName
  
  var Restrictions: ApiKeyRestrictions
  
  /**
    * Tags associated with the API key resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The timestamp for when the API key resource was last updated in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object DescribeKeyResponse {
  
  inline def apply(
    CreateTime: js.Date,
    ExpireTime: js.Date,
    Key: ApiKey,
    KeyArn: Arn,
    KeyName: ResourceName,
    Restrictions: ApiKeyRestrictions,
    UpdateTime: js.Date
  ): DescribeKeyResponse = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], ExpireTime = ExpireTime.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], KeyArn = KeyArn.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], Restrictions = Restrictions.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpireTime(value: js.Date): Self = StObject.set(x, "ExpireTime", value.asInstanceOf[js.Any])
    
    inline def setKey(value: ApiKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyArn(value: Arn): Self = StObject.set(x, "KeyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: ResourceName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setRestrictions(value: ApiKeyRestrictions): Self = StObject.set(x, "Restrictions", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
