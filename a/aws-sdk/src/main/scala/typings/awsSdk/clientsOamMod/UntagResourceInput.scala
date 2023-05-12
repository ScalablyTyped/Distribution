package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * The ARN of the resource that you're removing tags from. The ARN format of a sink is arn:aws:oam:Region:account-id:sink/sink-id   The ARN format of a link is arn:aws:oam:Region:account-id:link/link-id   For more information about ARN format, see CloudWatch Logs resources and operations.
    */
  var ResourceArn: Arn
  
  /**
    * The list of tag keys to remove from the resource.
    */
  var TagKeys: typings.awsSdk.clientsOamMod.TagKeys
}
object UntagResourceInput {
  
  inline def apply(ResourceArn: Arn, TagKeys: TagKeys): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
