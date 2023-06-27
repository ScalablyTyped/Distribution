package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV100RangeSet extends StObject {
  
  /**
  		 * Provides additional information on compound valued range set.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var axis: js.Array[CoverageDescriptionV100RangeSetAxis]
  
  /**
  		 * Range set label.
  		 *
  		 * [Read more...](global.html)
  		 */
  var label: String
  
  /**
  		 * Range set name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var name: String
  
  /**
  		 * The null values is used when valid values are not available.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var nullValues: js.UndefOr[js.Array[Double]] = js.undefined
}
object CoverageDescriptionV100RangeSet {
  
  inline def apply(axis: js.Array[CoverageDescriptionV100RangeSetAxis], label: String, name: String): CoverageDescriptionV100RangeSet = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV100RangeSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV100RangeSet] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: js.Array[CoverageDescriptionV100RangeSetAxis]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisVarargs(value: CoverageDescriptionV100RangeSetAxis*): Self = StObject.set(x, "axis", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNullValues(value: js.Array[Double]): Self = StObject.set(x, "nullValues", value.asInstanceOf[js.Any])
    
    inline def setNullValuesUndefined: Self = StObject.set(x, "nullValues", js.undefined)
    
    inline def setNullValuesVarargs(value: Double*): Self = StObject.set(x, "nullValues", js.Array(value*))
  }
}
