package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsLogGroupResponse extends StObject {
  
  /**
    * The tags for the log group.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object ListTagsLogGroupResponse {
  
  inline def apply(): ListTagsLogGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsLogGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsLogGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
