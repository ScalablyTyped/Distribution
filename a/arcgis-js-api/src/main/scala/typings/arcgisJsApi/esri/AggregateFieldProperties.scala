package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateFieldProperties extends StObject {
  
  /**
    * The name of the aggregate field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AggregateField.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the statistic method for aggregating data in a layer's field within the bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AggregateField.html#outStatistic)
    */
  var outStatistic: js.UndefOr[OutStatisticProperties] = js.undefined
}
object AggregateFieldProperties {
  
  inline def apply(): AggregateFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateFieldProperties]
  }
  
  extension [Self <: AggregateFieldProperties](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutStatistic(value: OutStatisticProperties): Self = StObject.set(x, "outStatistic", value.asInstanceOf[js.Any])
    
    inline def setOutStatisticUndefined: Self = StObject.set(x, "outStatistic", js.undefined)
  }
}
