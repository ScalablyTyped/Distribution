package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.avg
import typings.arcgisJsApi.arcgisJsApiStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutStatisticProperties extends StObject {
  
  /**
    * Defines the field to summarized with the given [statisticType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html#statisticType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html#onStatisticField)
    */
  var onStatisticField: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the type of statistic used to aggregate data for the given [onStatisticField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html#onStatisticField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html#statisticType)
    */
  var statisticType: js.UndefOr[avg | sum] = js.undefined
}
object OutStatisticProperties {
  
  inline def apply(): OutStatisticProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutStatisticProperties]
  }
  
  extension [Self <: OutStatisticProperties](x: Self) {
    
    inline def setOnStatisticField(value: String): Self = StObject.set(x, "onStatisticField", value.asInstanceOf[js.Any])
    
    inline def setOnStatisticFieldUndefined: Self = StObject.set(x, "onStatisticField", js.undefined)
    
    inline def setStatisticType(value: avg | sum): Self = StObject.set(x, "statisticType", value.asInstanceOf[js.Any])
    
    inline def setStatisticTypeUndefined: Self = StObject.set(x, "statisticType", js.undefined)
  }
}
