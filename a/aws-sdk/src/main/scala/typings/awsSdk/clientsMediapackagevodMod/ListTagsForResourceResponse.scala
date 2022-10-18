package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResponse extends StObject {
  
  /**
    * A collection of tags associated with a resource
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object ListTagsForResourceResponse {
  
  inline def apply(): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  extension [Self <: ListTagsForResourceResponse](x: Self) {
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
