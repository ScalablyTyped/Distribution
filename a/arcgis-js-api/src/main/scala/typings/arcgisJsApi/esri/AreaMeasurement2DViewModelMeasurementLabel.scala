package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurement2DViewModelMeasurementLabel
  extends StObject
     with Object {
  
  /**
    * The area (m²).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  var area: Double
  
  /**
    * The perimeter (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  var perimeter: Double
}
object AreaMeasurement2DViewModelMeasurementLabel {
  
  inline def apply(
    area: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    perimeter: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AreaMeasurement2DViewModelMeasurementLabel = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), perimeter = perimeter.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AreaMeasurement2DViewModelMeasurementLabel]
  }
  
  extension [Self <: AreaMeasurement2DViewModelMeasurementLabel](x: Self) {
    
    inline def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setPerimeter(value: Double): Self = StObject.set(x, "perimeter", value.asInstanceOf[js.Any])
  }
}
