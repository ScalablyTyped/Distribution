package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsRequest extends StObject {
  
  /**
    * Specifies the ARN of the trail, event data store, or channel to which one or more tags will be added. The format of a trail ARN is: arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail  The format of an event data store ARN is: arn:aws:cloudtrail:us-east-2:12345678910:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE  The format of a channel ARN is: arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890 
    */
  var ResourceId: String
  
  /**
    * Contains a list of tags, up to a limit of 50
    */
  var TagsList: typings.awsSdk.clientsCloudtrailMod.TagsList
}
object AddTagsRequest {
  
  inline def apply(ResourceId: String, TagsList: TagsList): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagsList = TagsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddTagsRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    inline def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value*))
  }
}
