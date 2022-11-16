package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurement2DViewModelMeasurementLabel extends StObject {
  
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
  
  inline def apply(area: Double, perimeter: Double): AreaMeasurement2DViewModelMeasurementLabel = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], perimeter = perimeter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaMeasurement2DViewModelMeasurementLabel]
  }
  
  extension [Self <: AreaMeasurement2DViewModelMeasurementLabel](x: Self) {
    
    inline def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setPerimeter(value: Double): Self = StObject.set(x, "perimeter", value.asInstanceOf[js.Any])
  }
}
