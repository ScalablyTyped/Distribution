package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) that specifies from which resource to disassociate the tags with the keys in the TagKeys input parameter. 
    */
  var ResourceArn: Arn
  
  /**
    *  A list of keys of Tag objects. The Tag objects identified by the keys are disassociated from the resource specified by the ResourceArn input parameter. 
    */
  var TagKeys: TagKeyList
}
object UntagResourceInput {
  
  inline def apply(ResourceArn: Arn, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  extension [Self <: UntagResourceInput](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: Key*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
