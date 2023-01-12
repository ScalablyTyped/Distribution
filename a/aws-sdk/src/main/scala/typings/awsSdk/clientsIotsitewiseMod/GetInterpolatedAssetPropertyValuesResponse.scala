package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInterpolatedAssetPropertyValuesResponse extends StObject {
  
  /**
    * The requested interpolated values.
    */
  var interpolatedAssetPropertyValues: InterpolatedAssetPropertyValues
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetInterpolatedAssetPropertyValuesResponse {
  
  inline def apply(interpolatedAssetPropertyValues: InterpolatedAssetPropertyValues): GetInterpolatedAssetPropertyValuesResponse = {
    val __obj = js.Dynamic.literal(interpolatedAssetPropertyValues = interpolatedAssetPropertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInterpolatedAssetPropertyValuesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInterpolatedAssetPropertyValuesResponse] (val x: Self) extends AnyVal {
    
    inline def setInterpolatedAssetPropertyValues(value: InterpolatedAssetPropertyValues): Self = StObject.set(x, "interpolatedAssetPropertyValues", value.asInstanceOf[js.Any])
    
    inline def setInterpolatedAssetPropertyValuesVarargs(value: InterpolatedAssetPropertyValue*): Self = StObject.set(x, "interpolatedAssetPropertyValues", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
