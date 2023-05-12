package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to remove tags from. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var ResourceArn: SimSpaceWeaverArn
  
  /**
    * A list of tag keys to remove from the resource.
    */
  var TagKeys: TagKeyList
}
object UntagResourceInput {
  
  inline def apply(ResourceArn: SimSpaceWeaverArn, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: SimSpaceWeaverArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
