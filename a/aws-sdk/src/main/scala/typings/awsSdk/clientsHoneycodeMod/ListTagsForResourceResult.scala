package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResult extends StObject {
  
  /**
    * The resource's tags.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object ListTagsForResourceResult {
  
  inline def apply(): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
  
  extension [Self <: ListTagsForResourceResult](x: Self) {
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
