package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromStreamInput extends StObject {
  
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
  
  /**
    * A list of tag keys. Each corresponding tag is removed from the stream.
    */
  var TagKeys: TagKeyList
}
object RemoveTagsFromStreamInput {
  
  inline def apply(StreamName: StreamName, TagKeys: TagKeyList): RemoveTagsFromStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromStreamInput]
  }
  
  extension [Self <: RemoveTagsFromStreamInput](x: Self) {
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
