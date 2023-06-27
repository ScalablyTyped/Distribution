package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TemporalLayer")
@js.native
open class TemporalLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.TemporalLayer {
  
  /**
  		 * The layer's time extent.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
  		 */
  /* CompleteClass */
  var timeExtent: typings.arcgisJsApi.esri.TimeExtent = js.native
  
  /**
  		 * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
  		 */
  /* CompleteClass */
  var timeInfo: typings.arcgisJsApi.esri.TimeInfo = js.native
  
  /**
  		 * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
  		 */
  /* CompleteClass */
  var timeOffset: typings.arcgisJsApi.esri.TimeInterval = js.native
  
  /**
  		 * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
  		 */
  /* CompleteClass */
  var useViewTime: Boolean = js.native
}
