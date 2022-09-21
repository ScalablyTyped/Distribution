package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`route-info`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The end time of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#endTime)
    */
  var endTime: js.Date = js.native
  
  /**
    * The local time offset (in minutes) for the end time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#endTimeOffset)
    */
  var endTimeOffset: Double = js.native
  
  /**
    * Polyline representing the route's geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#geometry)
    */
  var geometry: Polyline = js.native
  
  /**
    * User specified route name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#name)
    */
  var name: String = js.native
  
  /**
    * The start time of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#startTime)
    */
  var startTime: js.Date = js.native
  
  /**
    * The local time offset (in minutes) for the start time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#startTimeOffset)
    */
  var startTimeOffset: Double = js.native
  
  /**
    * Creates a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) from the [RouteInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#toGraphic)
    */
  def toGraphic(): Graphic = js.native
  
  /**
    * Total distance traveled in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#totalDistance)
    */
  var totalDistance: Double = js.native
  
  /**
    * Total time in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#totalDuration)
    */
  var totalDuration: Double = js.native
  
  val `type`: `route-info` = js.native
}
