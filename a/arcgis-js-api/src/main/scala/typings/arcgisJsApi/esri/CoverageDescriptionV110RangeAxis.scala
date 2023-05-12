package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV110RangeAxis extends StObject {
  
  /**
    * The axis bandNoDataValues.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var bandNoDataValues: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The axis data type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var dataType: String
  
  /**
    * The range axis identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var identifier: String
  
  /**
    * The axis unit of measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var uom: String
  
  /**
    * The axis values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var values: js.Array[String]
}
object CoverageDescriptionV110RangeAxis {
  
  inline def apply(dataType: String, identifier: String, uom: String, values: js.Array[String]): CoverageDescriptionV110RangeAxis = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], uom = uom.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV110RangeAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV110RangeAxis] (val x: Self) extends AnyVal {
    
    inline def setBandNoDataValues(value: js.Array[Double]): Self = StObject.set(x, "bandNoDataValues", value.asInstanceOf[js.Any])
    
    inline def setBandNoDataValuesUndefined: Self = StObject.set(x, "bandNoDataValues", js.undefined)
    
    inline def setBandNoDataValuesVarargs(value: Double*): Self = StObject.set(x, "bandNoDataValues", js.Array(value*))
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setUom(value: String): Self = StObject.set(x, "uom", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
