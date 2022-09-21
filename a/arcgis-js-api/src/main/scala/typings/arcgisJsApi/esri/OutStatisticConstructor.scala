package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutStatisticConstructor
  extends StObject
     with /**
  * Defines the layer field and statistic used to aggregate data in that field for use in an [AggregateField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AggregateField.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html)
  */
Instantiable0[OutStatistic]
     with Instantiable1[/* properties */ OutStatisticProperties, OutStatistic] {
  
  def fromJSON(json: Any): OutStatistic = js.native
}
