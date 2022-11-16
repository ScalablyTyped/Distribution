package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DirectionsString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DirectionsFeature")
@js.native
open class DirectionsFeature ()
  extends StObject
     with typings.arcgisJsApi.esri.DirectionsFeature {
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
  var events: js.Array[typings.arcgisJsApi.esri.DirectionsEvent] = js.native
  
  /**
    * The geometry of the Directions Feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#geometry)
    */
  /* CompleteClass */
  var geometry: typings.arcgisJsApi.esri.Polyline = js.native
  
  /**
    * An array of [direction strings](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#DirectionsString).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#strings)
    */
  /* CompleteClass */
  var strings: js.Array[DirectionsString] = js.native
}
