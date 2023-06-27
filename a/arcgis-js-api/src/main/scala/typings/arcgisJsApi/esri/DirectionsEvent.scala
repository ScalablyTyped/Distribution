package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsEvent
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The date and time value indicating the arrival time at the Directions Event.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html#arriveTime)
  		 */
  var arriveTime: js.Date = js.native
  
  /**
  		 * The local time offset (in minutes) for the arrival time.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html#arriveTimeOffset)
  		 */
  var arriveTimeOffset: Double = js.native
  
  /**
  		 * The point location of the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html#geometry)
  		 */
  var geometry: Point = js.native
  
  /**
  		 * An array of [direction strings](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#DirectionsString).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html#strings)
  		 */
  var strings: js.Array[DirectionsString] = js.native
}
