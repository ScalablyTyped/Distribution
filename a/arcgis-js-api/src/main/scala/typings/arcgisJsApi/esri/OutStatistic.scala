package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.avg
import typings.arcgisJsApi.arcgisJsApiStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutStatistic
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Defines the field to summarized with the given [statisticType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html#statisticType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html#onStatisticField)
    */
  var onStatisticField: String = js.native
  
  /**
    * Defines the type of statistic used to aggregate data for the given [onStatisticField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html#onStatisticField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html#statisticType)
    */
  var statisticType: avg | sum = js.native
}
