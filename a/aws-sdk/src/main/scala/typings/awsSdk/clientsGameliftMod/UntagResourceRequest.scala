package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to and uniquely identifies the GameLift resource that you want to remove tags from. GameLift resource ARNs are included in the data object for the resource, which can be retrieved by calling a List or Describe operation for the resource type. 
    */
  var ResourceARN: AmazonResourceName
  
  /**
    * A list of one or more tag keys to remove from the specified GameLift resource. An Amazon Web Services resource can have only one tag with a specific tag key, so specifying the tag key identifies which tag to remove. 
    */
  var TagKeys: TagKeyList
}
object UntagResourceRequest {
  
  inline def apply(ResourceARN: AmazonResourceName, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
