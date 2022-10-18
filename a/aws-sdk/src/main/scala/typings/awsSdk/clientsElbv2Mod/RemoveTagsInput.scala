package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArns: typings.awsSdk.clientsElbv2Mod.ResourceArns
  
  /**
    * The tag keys for the tags to remove.
    */
  var TagKeys: typings.awsSdk.clientsElbv2Mod.TagKeys
}
object RemoveTagsInput {
  
  inline def apply(ResourceArns: ResourceArns, TagKeys: TagKeys): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
  
  extension [Self <: RemoveTagsInput](x: Self) {
    
    inline def setResourceArns(value: ResourceArns): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
