package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResponse extends StObject {
  
  /**
    * The tags for the resource.
    */
  var tags: TagMap
}
object ListTagsForResourceResponse {
  
  inline def apply(tags: TagMap): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  extension [Self <: ListTagsForResourceResponse](x: Self) {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
