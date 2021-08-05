package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMeetingTagsResponse extends StObject {
  
  /**
    * A list of tag key-value pairs.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ListMeetingTagsResponse {
  
  inline def apply(): ListMeetingTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMeetingTagsResponse]
  }
  
  extension [Self <: ListMeetingTagsResponse](x: Self) {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
