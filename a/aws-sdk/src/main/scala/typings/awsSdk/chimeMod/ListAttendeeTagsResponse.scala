package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAttendeeTagsResponse extends StObject {
  
  /**
    * A list of tag key-value pairs.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ListAttendeeTagsResponse {
  
  @scala.inline
  def apply(): ListAttendeeTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttendeeTagsResponse]
  }
  
  @scala.inline
  implicit class ListAttendeeTagsResponseMutableBuilder[Self <: ListAttendeeTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
