package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResult extends StObject {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  
  /**
    * List of tags returned by the ListTagsForResource operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.Tags] = js.undefined
}
object ListTagsForResourceResult {
  
  inline def apply(): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
  
  extension [Self <: ListTagsForResourceResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
