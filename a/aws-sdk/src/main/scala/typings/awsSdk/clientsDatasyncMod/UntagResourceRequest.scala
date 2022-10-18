package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The keys in the key-value pair in the tag to remove.
    */
  var Keys: TagKeyList
  
  /**
    * The Amazon Resource Name (ARN) of the resource to remove the tag from.
    */
  var ResourceArn: TaggableResourceArn
}
object UntagResourceRequest {
  
  inline def apply(Keys: TagKeyList, ResourceArn: TaggableResourceArn): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setKeys(value: TagKeyList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: TagKey*): Self = StObject.set(x, "Keys", js.Array(value*))
    
    inline def setResourceArn(value: TaggableResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
