package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * The key of the tag.
    */
  var TagKey: TagKeyType
  
  /**
    * The value of the tag.
    */
  var TagValue: TagValueType
}
object Tag {
  
  inline def apply(TagKey: TagKeyType, TagValue: TagValueType): Tag = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValue = TagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setTagKey(value: TagKeyType): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagValue(value: TagValueType): Self = StObject.set(x, "TagValue", value.asInstanceOf[js.Any])
  }
}
