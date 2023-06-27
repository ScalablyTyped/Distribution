package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`either-side-of-vehicle`
import typings.arcgisJsApi.arcgisJsApiStrings.`element-not-traversable`
import typings.arcgisJsApi.arcgisJsApiStrings.`invalid-field-values`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-side-of-vehicle`
import typings.arcgisJsApi.arcgisJsApiStrings.`network-element-not-located`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-u-turn`
import typings.arcgisJsApi.arcgisJsApiStrings.`not-located-on-closest`
import typings.arcgisJsApi.arcgisJsApiStrings.`not-located`
import typings.arcgisJsApi.arcgisJsApiStrings.`not-reached`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-side-of-vehicle`
import typings.arcgisJsApi.arcgisJsApiStrings.`time-window-violation`
import typings.arcgisJsApi.arcgisJsApiStrings.break
import typings.arcgisJsApi.arcgisJsApiStrings.ok
import typings.arcgisJsApi.arcgisJsApiStrings.stop
import typings.arcgisJsApi.arcgisJsApiStrings.waypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopProperties extends StObject {
  
  /**
  		 * The date and time value indicating the arrival time at the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#arriveTime)
  		 */
  var arriveTime: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * The local time offset (in minutes) for the arrival time.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#arriveTimeOffset)
  		 */
  var arriveTimeOffset: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Specify the direction a vehicle may arrive at and depart from the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#curbApproach)
  		 */
  var curbApproach: js.UndefOr[
    `either-side-of-vehicle` | `right-side-of-vehicle` | `left-side-of-vehicle` | `no-u-turn`
  ] = js.undefined
  
  /**
  		 * The date and time value indicating the departure time from the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#departTime)
  		 */
  var departTime: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * The local time offset in minutes for the departure time.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#departTimeOffset)
  		 */
  var departTimeOffset: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The point location of the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#geometry)
  		 */
  var geometry: js.UndefOr[PointProperties] = js.undefined
  
  var locationType: js.UndefOr[stop | waypoint | break] = js.undefined
  
  /**
  		 * The name of the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * If the findBestSequence parameter is set to false, the output routes will visit the stops in the order you specify with this attribute.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#sequence)
  		 */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates the status of the point with respect to its location on the network and the outcome of the analysis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#status)
  		 */
  var status: js.UndefOr[
    ok | `not-located` | `network-element-not-located` | `element-not-traversable` | `invalid-field-values` | `not-reached` | `time-window-violation` | `not-located-on-closest`
  ] = js.undefined
  
  /**
  		 * The latest time the route can visit the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#timeWindowEnd)
  		 */
  var timeWindowEnd: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * The earliest time the route can visit the stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#timeWindowStart)
  		 */
  var timeWindowStart: js.UndefOr[DateProperties] = js.undefined
}
object StopProperties {
  
  inline def apply(): StopProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopProperties] (val x: Self) extends AnyVal {
    
    inline def setArriveTime(value: DateProperties): Self = StObject.set(x, "arriveTime", value.asInstanceOf[js.Any])
    
    inline def setArriveTimeOffset(value: Double): Self = StObject.set(x, "arriveTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setArriveTimeOffsetUndefined: Self = StObject.set(x, "arriveTimeOffset", js.undefined)
    
    inline def setArriveTimeUndefined: Self = StObject.set(x, "arriveTime", js.undefined)
    
    inline def setCurbApproach(value: `either-side-of-vehicle` | `right-side-of-vehicle` | `left-side-of-vehicle` | `no-u-turn`): Self = StObject.set(x, "curbApproach", value.asInstanceOf[js.Any])
    
    inline def setCurbApproachUndefined: Self = StObject.set(x, "curbApproach", js.undefined)
    
    inline def setDepartTime(value: DateProperties): Self = StObject.set(x, "departTime", value.asInstanceOf[js.Any])
    
    inline def setDepartTimeOffset(value: Double): Self = StObject.set(x, "departTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setDepartTimeOffsetUndefined: Self = StObject.set(x, "departTimeOffset", js.undefined)
    
    inline def setDepartTimeUndefined: Self = StObject.set(x, "departTime", js.undefined)
    
    inline def setGeometry(value: PointProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setLocationType(value: stop | waypoint | break): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setStatus(
      value: ok | `not-located` | `network-element-not-located` | `element-not-traversable` | `invalid-field-values` | `not-reached` | `time-window-violation` | `not-located-on-closest`
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeWindowEnd(value: DateProperties): Self = StObject.set(x, "timeWindowEnd", value.asInstanceOf[js.Any])
    
    inline def setTimeWindowEndUndefined: Self = StObject.set(x, "timeWindowEnd", js.undefined)
    
    inline def setTimeWindowStart(value: DateProperties): Self = StObject.set(x, "timeWindowStart", value.asInstanceOf[js.Any])
    
    inline def setTimeWindowStartUndefined: Self = StObject.set(x, "timeWindowStart", js.undefined)
  }
}
