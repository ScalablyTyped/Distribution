package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasurementValue extends StObject {
  
  /**
    * Measured value represented in significant figures in string format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measurementValue)
    */
  var displayValue: String
  
  /**
    * Uncertainty of the measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measurementValue)
    */
  var uncertainty: Double
  
  /**
    * Unit used in the mensuration operation.
    *
    * [Read more...](global.html#unit)
    */
  var unit: String
  
  /**
    * Measured value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measurementValue)
    */
  var value: Double
}
object MeasurementValue {
  
  inline def apply(displayValue: String, uncertainty: Double, unit: String, value: Double): MeasurementValue = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], uncertainty = uncertainty.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasurementValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasurementValue] (val x: Self) extends AnyVal {
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setUncertainty(value: Double): Self = StObject.set(x, "uncertainty", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
