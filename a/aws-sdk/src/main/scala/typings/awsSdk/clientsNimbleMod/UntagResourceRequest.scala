package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * Identifies the Amazon Resource Name(ARN) key from which you are removing tags. 
    */
  var resourceArn: String
  
  /**
    * One or more tag keys. Specify only the tag keys, not the tag values.
    */
  var tagKeys: StringList
}
object UntagResourceRequest {
  
  inline def apply(resourceArn: String, tagKeys: StringList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: StringList): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "tagKeys", js.Array(value*))
  }
}
