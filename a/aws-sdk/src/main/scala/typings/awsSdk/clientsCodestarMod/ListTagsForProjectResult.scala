package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForProjectResult extends StObject {
  
  /**
    * Reserved for future use.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The tags for the project.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object ListTagsForProjectResult {
  
  inline def apply(): ListTagsForProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForProjectResult]
  }
  
  extension [Self <: ListTagsForProjectResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
