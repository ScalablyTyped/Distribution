package typings.awsSdk.clientsResourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourcesInput extends StObject {
  
  /**
    * Specifies a list of ARNs of the resources that you want to remove tags from. An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services General Reference.
    */
  var ResourceARNList: ResourceARNListForTagUntag
  
  /**
    * Specifies a list of tag keys that you want to remove from the specified resources.
    */
  var TagKeys: TagKeyListForUntag
}
object UntagResourcesInput {
  
  inline def apply(ResourceARNList: ResourceARNListForTagUntag, TagKeys: TagKeyListForUntag): UntagResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceARNList = ResourceARNList.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourcesInput]
  }
  
  extension [Self <: UntagResourcesInput](x: Self) {
    
    inline def setResourceARNList(value: ResourceARNListForTagUntag): Self = StObject.set(x, "ResourceARNList", value.asInstanceOf[js.Any])
    
    inline def setResourceARNListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceARNList", js.Array(value*))
    
    inline def setTagKeys(value: TagKeyListForUntag): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
