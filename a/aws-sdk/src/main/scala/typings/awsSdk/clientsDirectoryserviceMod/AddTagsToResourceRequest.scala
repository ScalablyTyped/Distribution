package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToResourceRequest extends StObject {
  
  /**
    * Identifier (ID) for the directory to which to add the tag.
    */
  var ResourceId: typings.awsSdk.clientsDirectoryserviceMod.ResourceId
  
  /**
    * The tags to be assigned to the directory.
    */
  var Tags: typings.awsSdk.clientsDirectoryserviceMod.Tags
}
object AddTagsToResourceRequest {
  
  inline def apply(ResourceId: ResourceId, Tags: Tags): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddTagsToResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
