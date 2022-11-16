package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TemporalLayer
import typings.arcgisJsApi.esri.TimeExtent
import typings.arcgisJsApi.esri.TimeInfo
import typings.arcgisJsApi.esri.TimeInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsTemporalLayerMod {
  
  @JSImport("esri/layers/mixins/TemporalLayer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TemporalLayer {
    
    /**
      * The layer's time extent.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
      */
    /* CompleteClass */
    var timeExtent: TimeExtent = js.native
    
    /**
      * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
      */
    /* CompleteClass */
    var timeInfo: TimeInfo = js.native
    
    /**
      * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
      */
    /* CompleteClass */
    var timeOffset: TimeInterval = js.native
    
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
}
