package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsRequest extends StObject {
  
  /**
    * Specifies the ARN of the trail or event data store from which tags should be removed.  Example trail ARN format: arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail  Example event data store ARN format: arn:aws:cloudtrail:us-east-2:12345678910:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE 
    */
  var ResourceId: String
  
  /**
    * Specifies a list of tags to be removed.
    */
  var TagsList: typings.awsSdk.clientsCloudtrailMod.TagsList
}
object RemoveTagsRequest {
  
  inline def apply(ResourceId: String, TagsList: TagsList): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagsList = TagsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveTagsRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    inline def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value*))
  }
}
