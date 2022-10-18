package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceResponse extends StObject {
  
  /**
    * The list of tags that are associated with the DAX resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object TagResourceResponse {
  
  inline def apply(): TagResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourceResponse]
  }
  
  extension [Self <: TagResourceResponse](x: Self) {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
