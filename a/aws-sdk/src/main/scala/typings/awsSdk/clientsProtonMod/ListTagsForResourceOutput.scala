package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceOutput extends StObject {
  
  /**
    * A token that indicates the location of the next resource tag in the array of resource tags, after the current requested list of resource tags.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of resource tags with detail data.
    */
  var tags: TagList
}
object ListTagsForResourceOutput {
  
  inline def apply(tags: TagList): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
  
  extension [Self <: ListTagsForResourceOutput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
