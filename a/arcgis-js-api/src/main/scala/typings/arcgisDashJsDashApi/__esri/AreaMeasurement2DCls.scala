package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.AreaMeasurement2D")
@js.native
/**
  * The AreaMeasurement2D widget calculates and displays the area and perimeter of a polygon in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). When the perimeter is less than 100 km, the default [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#mode) is `planar`. When the perimeter is greater than or equal to 100 km, the default [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#mode) is `geodesic`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html)
  */
class AreaMeasurement2DCls () extends AreaMeasurement2D {
  def this(properties: AreaMeasurement2DProperties) = this()
}

