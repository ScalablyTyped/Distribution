package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV201RangeType extends StObject {
  
  /**
    * Allowed values for the range type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var allowedValues: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Range type description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Range type name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var name: String
  
  /**
    * Number that represents null value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var nilValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Unit of measurement for the range type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var uom: String
}
object CoverageDescriptionV201RangeType {
  
  inline def apply(name: String, uom: String): CoverageDescriptionV201RangeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uom = uom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV201RangeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV201RangeType] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: js.Array[Double]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: Double*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNilValue(value: Double): Self = StObject.set(x, "nilValue", value.asInstanceOf[js.Any])
    
    inline def setNilValueUndefined: Self = StObject.set(x, "nilValue", js.undefined)
    
    inline def setUom(value: String): Self = StObject.set(x, "uom", value.asInstanceOf[js.Any])
  }
}
