package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The ARN of a resource that can be tagged.
    */
  var resourceArn: String
  
  /**
    * The Tag keys to delete.
    */
  var tagKeys: ListOfString
}
object UntagResourceRequest {
  
  inline def apply(resourceArn: String, tagKeys: ListOfString): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: ListOfString): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "tagKeys", js.Array(value*))
  }
}
