package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the resource to apply the tag to.
    */
  var ResourceArn: TaggableResourceArn
  
  /**
    * Specifies the tags that you want to apply to the resource.
    */
  var Tags: InputTagList
}
object TagResourceRequest {
  
  inline def apply(ResourceArn: TaggableResourceArn, Tags: InputTagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: TaggableResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
