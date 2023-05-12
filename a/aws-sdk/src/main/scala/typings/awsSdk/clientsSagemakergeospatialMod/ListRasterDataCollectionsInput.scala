package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRasterDataCollectionsInput extends StObject {
  
  /**
    * The total number of items to return.
    */
  var MaxResults: js.UndefOr[ListRasterDataCollectionsInputMaxResultsInteger] = js.undefined
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.NextToken] = js.undefined
}
object ListRasterDataCollectionsInput {
  
  inline def apply(): ListRasterDataCollectionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRasterDataCollectionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRasterDataCollectionsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListRasterDataCollectionsInputMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
