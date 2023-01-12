package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDimensionsResponse extends StObject {
  
  /**
    * A list of the names of the defined dimensions. Use DescribeDimension to get details for a dimension.
    */
  var dimensionNames: js.UndefOr[DimensionNames] = js.undefined
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDimensionsResponse {
  
  inline def apply(): ListDimensionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDimensionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDimensionsResponse] (val x: Self) extends AnyVal {
    
    inline def setDimensionNames(value: DimensionNames): Self = StObject.set(x, "dimensionNames", value.asInstanceOf[js.Any])
    
    inline def setDimensionNamesUndefined: Self = StObject.set(x, "dimensionNames", js.undefined)
    
    inline def setDimensionNamesVarargs(value: DimensionName*): Self = StObject.set(x, "dimensionNames", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
