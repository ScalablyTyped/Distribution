package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporalDomain extends StObject {
  
  /**
    * Start date for the temporal domain of a coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#TemporalDomain)
    */
  var begin: js.Date
  
  /**
    * End date for the temporal domain of a coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#TemporalDomain)
    */
  var end: js.Date
  
  /**
    * The numerical value of the temporal domain or extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#TemporalDomain)
    */
  var resolution: js.UndefOr[Double] = js.undefined
  
  /**
    * Temporal units such as day, month, year etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#TemporalDomain)
    */
  var units: js.UndefOr[Any] = js.undefined
  
  /**
    * Date values available in the temporal domain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#TemporalDomain)
    */
  var values: js.UndefOr[js.Array[js.Date]] = js.undefined
}
object TemporalDomain {
  
  inline def apply(begin: js.Date, end: js.Date): TemporalDomain = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporalDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemporalDomain] (val x: Self) extends AnyVal {
    
    inline def setBegin(value: js.Date): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setUnits(value: Any): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setValues(value: js.Array[js.Date]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Date*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
