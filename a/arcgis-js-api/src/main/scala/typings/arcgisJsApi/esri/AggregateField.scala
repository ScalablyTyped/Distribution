package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateField
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The name of the aggregate field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AggregateField.html#name)
    */
  var name: String = js.native
  
  /**
    * Defines the statistic method for aggregating data in a layer's field within the bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AggregateField.html#outStatistic)
    */
  var outStatistic: OutStatistic = js.native
}
