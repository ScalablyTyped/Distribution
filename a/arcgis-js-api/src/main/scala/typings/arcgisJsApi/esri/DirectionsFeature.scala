package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsFeature extends StObject {
  
  /**
    * Name-value pairs of fields and field values associated with the Directions Feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#attributes)
    */
  var attributes: Any
  
  /**
    * An array of Direction Events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#events)
    */
  var events: js.Array[DirectionsEvent]
  
  /**
    * The geometry of the Directions Feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#geometry)
    */
  var geometry: Polyline
  
  /**
    * An array of [direction strings](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#DirectionsString).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#strings)
    */
  var strings: js.Array[DirectionsString]
}
object DirectionsFeature {
  
  inline def apply(
    attributes: Any,
    events: js.Array[DirectionsEvent],
    geometry: Polyline,
    strings: js.Array[DirectionsString]
  ): DirectionsFeature = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsFeature]
  }
  
  extension [Self <: DirectionsFeature](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[DirectionsEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: DirectionsEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGeometry(value: Polyline): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setStrings(value: js.Array[DirectionsString]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsVarargs(value: DirectionsString*): Self = StObject.set(x, "strings", js.Array(value*))
  }
}
