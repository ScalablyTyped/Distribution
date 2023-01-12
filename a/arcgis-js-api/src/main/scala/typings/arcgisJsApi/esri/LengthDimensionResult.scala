package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a LengthDimension.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-LengthDimensionResult.html)
  */
trait LengthDimensionResult extends StObject {
  
  /**
    * The [LengthDimension](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html) that this result corresponds to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-LengthDimensionResult.html#dimension)
    */
  var dimension: LengthDimension
  
  /**
    * The length currently being measured by the [dimension](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-LengthDimensionResult.html#dimension).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-LengthDimensionResult.html#length)
    */
  var length: Length
}
object LengthDimensionResult {
  
  inline def apply(dimension: LengthDimension, length: Length): LengthDimensionResult = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthDimensionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LengthDimensionResult] (val x: Self) extends AnyVal {
    
    inline def setDimension(value: LengthDimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Length): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
