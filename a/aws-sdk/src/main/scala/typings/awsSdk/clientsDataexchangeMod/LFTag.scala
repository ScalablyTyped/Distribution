package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LFTag extends StObject {
  
  /**
    * The key name for the LF-tag.
    */
  var TagKey: String
  
  /**
    * A list of LF-tag values.
    */
  var TagValues: ListOfLFTagValues
}
object LFTag {
  
  inline def apply(TagKey: String, TagValues: ListOfLFTagValues): LFTag = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValues = TagValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LFTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LFTag] (val x: Self) extends AnyVal {
    
    inline def setTagKey(value: String): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagValues(value: ListOfLFTagValues): Self = StObject.set(x, "TagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesVarargs(value: String*): Self = StObject.set(x, "TagValues", js.Array(value*))
  }
}
