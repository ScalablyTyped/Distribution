package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttendeeTagsResponse extends StObject {
  
  /**
    * A list of tag key-value pairs.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ListAttendeeTagsResponse {
  
  inline def apply(): ListAttendeeTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttendeeTagsResponse]
  }
  
  extension [Self <: ListAttendeeTagsResponse](x: Self) {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
