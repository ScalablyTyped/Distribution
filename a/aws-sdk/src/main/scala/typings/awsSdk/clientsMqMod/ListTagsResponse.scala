package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsResponse extends StObject {
  
  /**
    * The key-value pair for the resource tag.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object ListTagsResponse {
  
  inline def apply(): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsResponse]
  }
  
  extension [Self <: ListTagsResponse](x: Self) {
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
