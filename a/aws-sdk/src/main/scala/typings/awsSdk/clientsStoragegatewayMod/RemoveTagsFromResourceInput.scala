package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource you want to remove the tags from.
    */
  var ResourceARN: typings.awsSdk.clientsStoragegatewayMod.ResourceARN
  
  /**
    * The keys of the tags you want to remove from the specified resource. A tag is composed of a key-value pair.
    */
  var TagKeys: typings.awsSdk.clientsStoragegatewayMod.TagKeys
}
object RemoveTagsFromResourceInput {
  
  inline def apply(ResourceARN: ResourceARN, TagKeys: TagKeys): RemoveTagsFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveTagsFromResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
