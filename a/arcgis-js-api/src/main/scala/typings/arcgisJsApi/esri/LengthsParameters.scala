package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`preserve-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import typings.arcgisJsApi.arcgisJsApiStrings.planar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LengthsParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Defines the type of calculation for the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html#calculationType)
    */
  var calculationType: planar | geodesic | `preserve-shape` = js.native
  
  /**
    * If polylines are in a geographic coordinate system, then geodesic needs to be set to `true` in order to calculate the ellipsoidal shortest path distance between each pair of the vertices in the polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html#geodesic)
    */
  var geodesic: Boolean = js.native
  
  /**
    * The length unit in which perimeters of polygons will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html#lengthUnit)
    */
  var lengthUnit: Double | String = js.native
  
  /**
    * The array of polylines whose lengths are to be computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html#polylines)
    */
  var polylines: js.Array[Polyline] = js.native
}
