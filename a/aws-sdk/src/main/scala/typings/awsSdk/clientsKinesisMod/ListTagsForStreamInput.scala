package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForStreamInput extends StObject {
  
  /**
    * The key to use as the starting point for the list of tags. If this parameter is set, ListTagsForStream gets all tags that occur after ExclusiveStartTagKey. 
    */
  var ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined
  
  /**
    * The number of tags to return. If this number is less than the total number of tags associated with the stream, HasMoreTags is set to true. To list additional tags, set ExclusiveStartTagKey to the last key in the response.
    */
  var Limit: js.UndefOr[ListTagsForStreamInputLimit] = js.undefined
  
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
}
object ListTagsForStreamInput {
  
  inline def apply(StreamName: StreamName): ListTagsForStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForStreamInput]
  }
  
  extension [Self <: ListTagsForStreamInput](x: Self) {
    
    inline def setExclusiveStartTagKey(value: TagKey): Self = StObject.set(x, "ExclusiveStartTagKey", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartTagKeyUndefined: Self = StObject.set(x, "ExclusiveStartTagKey", js.undefined)
    
    inline def setLimit(value: ListTagsForStreamInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
