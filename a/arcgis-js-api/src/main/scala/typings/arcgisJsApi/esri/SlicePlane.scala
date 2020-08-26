package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.plane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicePlane
  extends Accessor
     with JSONSupport {
  /**
    * The heading angle (in degrees) of the slice plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#heading)
    *
    * @default 0
    */
  var heading: Double = js.native
  /**
    * The height of the slice plane. The unit is derived from the [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) of the [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#position).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#height)
    *
    * @default 10
    */
  var height: Double = js.native
  /**
    * A point specifying the position of the center of the plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#position)
    */
  var position: Point = js.native
  /**
    * The tilt angle (in degrees) of the slice plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#tilt)
    *
    * @default 0
    */
  var tilt: Double = js.native
  /**
    * The string value representing the type of the slice shape.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#type)
    */
  val `type`: plane = js.native
  /**
    * The width of the slice plane. The unit is derived from the [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) of the [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#position).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#width)
    *
    * @default 10
    */
  var width: Double = js.native
}

