package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle
  extends StObject
     with Polygon {
  
  /**
    * The center point of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#center)
    */
  var center: Point = js.native
  
  /**
    * Applicable when the spatial reference of the center point is either set to Web Mercator (wkid: 3857) or geographic/geodesic (wkid: 4326).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#geodesic)
    */
  var geodesic: Boolean = js.native
  
  /**
    * This value defines the number of points along the curve of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#numberOfPoints)
    */
  var numberOfPoints: Double = js.native
  
  /**
    * The radius of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radius)
    */
  var radius: Double = js.native
  
  /**
    * Unit of the radius.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radiusUnit)
    */
  var radiusUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
}
