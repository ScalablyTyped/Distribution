package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsResponse extends StObject {
  
  /**
    * The requested tags.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object GetTagsResponse {
  
  inline def apply(): GetTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTagsResponse] (val x: Self) extends AnyVal {
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
