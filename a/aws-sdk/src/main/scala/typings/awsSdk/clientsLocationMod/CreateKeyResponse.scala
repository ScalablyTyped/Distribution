package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyResponse extends StObject {
  
  /**
    * The timestamp for when the API key resource was created in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var CreateTime: js.Date
  
  /**
    * The key value/string of an API key. This value is used when making API calls to authorize the call. For example, see GetMapGlyphs.
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
}
object CreateKeyResponse {
  
  inline def apply(CreateTime: js.Date, Key: ApiKey, KeyArn: Arn, KeyName: ResourceName): CreateKeyResponse = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], KeyArn = KeyArn.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setKey(value: ApiKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyArn(value: Arn): Self = StObject.set(x, "KeyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: ResourceName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
  }
}
