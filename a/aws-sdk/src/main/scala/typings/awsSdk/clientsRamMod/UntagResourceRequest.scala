package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the managed permission that you want to remove tags from. You must specify either resourceArn, or resourceShareArn, but not both.
    */
  var resourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the resource share that you want to remove tags from. The tags are removed from the resource share, not the resources in the resource share. You must specify either resourceShareArn, or resourceArn, but not both.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a list of one or more tag keys that you want to remove.
    */
  var tagKeys: TagKeyList
}
object UntagResourceRequest {
  
  inline def apply(tagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "tagKeys", js.Array(value*))
  }
}
