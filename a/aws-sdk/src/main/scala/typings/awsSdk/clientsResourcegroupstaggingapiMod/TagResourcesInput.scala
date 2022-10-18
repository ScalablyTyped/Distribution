package typings.awsSdk.clientsResourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourcesInput extends StObject {
  
  /**
    * Specifies the list of ARNs of the resources that you want to apply tags to. An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services General Reference.
    */
  var ResourceARNList: ResourceARNListForTagUntag
  
  /**
    * Specifies a list of tags that you want to add to the specified resources. A tag consists of a key and a value that you define.
    */
  var Tags: TagMap
}
object TagResourcesInput {
  
  inline def apply(ResourceARNList: ResourceARNListForTagUntag, Tags: TagMap): TagResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceARNList = ResourceARNList.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourcesInput]
  }
  
  extension [Self <: TagResourcesInput](x: Self) {
    
    inline def setResourceARNList(value: ResourceARNListForTagUntag): Self = StObject.set(x, "ResourceARNList", value.asInstanceOf[js.Any])
    
    inline def setResourceARNListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceARNList", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
