package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to retrieve tags for.
    */
  var ResourceARN: AmazonResourceName
  
  /**
    * The tags to add to the specified resource. Specifying the tag key is required. You can set the value of a tag to an empty string, but you can't set the value of a tag to null.
    */
  var Tags: TagList
}
object TagResourceRequest {
  
  inline def apply(ResourceARN: AmazonResourceName, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
