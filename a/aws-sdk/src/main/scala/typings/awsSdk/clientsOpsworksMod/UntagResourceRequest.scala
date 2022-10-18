package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The stack or layer's Amazon Resource Number (ARN).
    */
  var ResourceArn: typings.awsSdk.clientsOpsworksMod.ResourceArn
  
  /**
    * A list of the keys of tags to be removed from a stack or layer.
    */
  var TagKeys: typings.awsSdk.clientsOpsworksMod.TagKeys
}
object UntagResourceRequest {
  
  inline def apply(ResourceArn: ResourceArn, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
