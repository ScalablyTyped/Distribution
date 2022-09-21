package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteInfoProperties extends StObject {
  
  /**
    * The end time of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#endTime)
    */
  var endTime: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The local time offset (in minutes) for the end time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#endTimeOffset)
    */
  var endTimeOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Polyline representing the route's geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#geometry)
    */
  var geometry: js.UndefOr[PolylineProperties] = js.undefined
  
  /**
    * User specified route name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The start time of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#startTime)
    */
  var startTime: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The local time offset (in minutes) for the start time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#startTimeOffset)
    */
  var startTimeOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Total distance traveled in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#totalDistance)
    */
  var totalDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * Total time in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#totalDuration)
    */
  var totalDuration: js.UndefOr[Double] = js.undefined
}
object RouteInfoProperties {
  
  inline def apply(): RouteInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteInfoProperties]
  }
  
  extension [Self <: RouteInfoProperties](x: Self) {
    
    inline def setEndTime(value: DateProperties): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffset(value: Double): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setGeometry(value: PolylineProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartTime(value: DateProperties): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffset(value: Double): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTotalDistance(value: Double): Self = StObject.set(x, "totalDistance", value.asInstanceOf[js.Any])
    
    inline def setTotalDistanceUndefined: Self = StObject.set(x, "totalDistance", js.undefined)
    
    inline def setTotalDuration(value: Double): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
    
    inline def setTotalDurationUndefined: Self = StObject.set(x, "totalDuration", js.undefined)
  }
}
