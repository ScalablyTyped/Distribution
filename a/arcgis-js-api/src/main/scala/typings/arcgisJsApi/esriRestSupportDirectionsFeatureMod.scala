package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DirectionsEvent
import typings.arcgisJsApi.esri.DirectionsFeature
import typings.arcgisJsApi.esri.DirectionsString
import typings.arcgisJsApi.esri.Polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportDirectionsFeatureMod {
  
  @JSImport("esri/rest/support/DirectionsFeature", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DirectionsFeature {
    def this(properties: Any) = this()
    
    /**
      * Name-value pairs of fields and field values associated with the Directions Feature.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#attributes)
      */
    /* CompleteClass */
    var attributes: Any = js.native
    
    /**
      * An array of Direction Events.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#events)
      */
    /* CompleteClass */
    var events: js.Array[DirectionsEvent] = js.native
    
    /**
      * The geometry of the Directions Feature.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#geometry)
      */
    /* CompleteClass */
    var geometry: Polyline = js.native
    
    /**
      * An array of [direction strings](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#DirectionsString).
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#strings)
      */
    /* CompleteClass */
    var strings: js.Array[DirectionsString] = js.native
  }
}
