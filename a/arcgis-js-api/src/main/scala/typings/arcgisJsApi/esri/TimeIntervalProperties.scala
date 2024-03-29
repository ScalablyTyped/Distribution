package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.centuries
import typings.arcgisJsApi.arcgisJsApiStrings.days
import typings.arcgisJsApi.arcgisJsApiStrings.decades
import typings.arcgisJsApi.arcgisJsApiStrings.hours
import typings.arcgisJsApi.arcgisJsApiStrings.milliseconds
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.months
import typings.arcgisJsApi.arcgisJsApiStrings.seconds
import typings.arcgisJsApi.arcgisJsApiStrings.weeks
import typings.arcgisJsApi.arcgisJsApiStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeIntervalProperties extends StObject {
  
  /**
  		 * Temporal units.
  		 *
  		 * @default milliseconds
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
  		 */
  var unit: js.UndefOr[
    milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
  ] = js.undefined
  
  /**
  		 * The numerical value of the time extent.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
  		 */
  var value: js.UndefOr[Double] = js.undefined
}
object TimeIntervalProperties {
  
  inline def apply(): TimeIntervalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeIntervalProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeIntervalProperties] (val x: Self) extends AnyVal {
    
    inline def setUnit(
      value: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
