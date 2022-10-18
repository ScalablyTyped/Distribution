package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForDeliveryStreamOutput extends StObject {
  
  /**
    * If this is true in the response, more tags are available. To list the remaining tags, set ExclusiveStartTagKey to the key of the last tag returned and call ListTagsForDeliveryStream again.
    */
  var HasMoreTags: BooleanObject
  
  /**
    * A list of tags associated with DeliveryStreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit.
    */
  var Tags: ListTagsForDeliveryStreamOutputTagList
}
object ListTagsForDeliveryStreamOutput {
  
  inline def apply(HasMoreTags: BooleanObject, Tags: ListTagsForDeliveryStreamOutputTagList): ListTagsForDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal(HasMoreTags = HasMoreTags.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDeliveryStreamOutput]
  }
  
  extension [Self <: ListTagsForDeliveryStreamOutput](x: Self) {
    
    inline def setHasMoreTags(value: BooleanObject): Self = StObject.set(x, "HasMoreTags", value.asInstanceOf[js.Any])
    
    inline def setTags(value: ListTagsForDeliveryStreamOutputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
