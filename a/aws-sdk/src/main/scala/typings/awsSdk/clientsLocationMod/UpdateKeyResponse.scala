package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateKeyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the API key resource. Used when you need to specify a resource across all Amazon Web Services.   Format example: arn:aws:geo:region:account-id:key/ExampleKey   
    */
  var KeyArn: Arn
  
  /**
    * The name of the API key resource.
    */
  var KeyName: ResourceName
  
  /**
    * The timestamp for when the API key resource was last updated in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object UpdateKeyResponse {
  
  inline def apply(KeyArn: Arn, KeyName: ResourceName, UpdateTime: js.Date): UpdateKeyResponse = {
    val __obj = js.Dynamic.literal(KeyArn = KeyArn.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyArn(value: Arn): Self = StObject.set(x, "KeyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: ResourceName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
