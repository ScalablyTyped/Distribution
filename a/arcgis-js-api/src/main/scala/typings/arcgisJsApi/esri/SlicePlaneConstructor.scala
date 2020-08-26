package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicePlaneConstructor
  extends /**
  * Provides the shape definition of a slice plane for the [Slice](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html) widget. The slice plane is defined by a position, heading and tilt. Its size is defined by width and height.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html)
  */
Instantiable0[SlicePlane]
     with Instantiable1[/* properties */ SlicePlaneProperties, SlicePlane] {
  def fromJSON(json: js.Any): SlicePlane = js.native
}

