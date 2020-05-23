package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DistanceMeasurement2DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.DistanceMeasurement2D")
@js.native
/**
  * The DistanceMeasurement2D widget calculates and displays the distance between two or more points in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The widget will compute distances geodetically for geographic coordinate systems and web mercator. For projected coordinate systems (non-web mercator), computations will be performed planimetrically for distances up to the threshold distance defined by [geodesicDistanceThreshold](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#geodesicDistanceThreshold). Distances equivalent to and beyond the threshold will be computed geodetically. By default the threshold is set to 100km.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html)
  */
class DistanceMeasurement2DCls ()
  extends typings.arcgisJsApi.esri.DistanceMeasurement2D {
  def this(properties: DistanceMeasurement2DProperties) = this()
}

