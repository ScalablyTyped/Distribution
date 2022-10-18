package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDimensionKeyDetailsResponse extends StObject {
  
  /**
    * The details for the requested dimensions.
    */
  var Dimensions: js.UndefOr[DimensionKeyDetailList] = js.undefined
}
object GetDimensionKeyDetailsResponse {
  
  inline def apply(): GetDimensionKeyDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDimensionKeyDetailsResponse]
  }
  
  extension [Self <: GetDimensionKeyDetailsResponse](x: Self) {
    
    inline def setDimensions(value: DimensionKeyDetailList): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: DimensionKeyDetail*): Self = StObject.set(x, "Dimensions", js.Array(value*))
  }
}
