package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResponse extends StObject {
  
  /**
    * The ARN of the resource that you are viewing.
    */
  var ResourceArn: Arn
  
  /**
    * The list of tag keys and values associated with the resource you specified.
    */
  var Tags: TagMap
}
object ListTagsForResourceResponse {
  
  inline def apply(ResourceArn: Arn, Tags: TagMap): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  extension [Self <: ListTagsForResourceResponse](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
