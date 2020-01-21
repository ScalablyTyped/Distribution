package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceMeasurement2DConstructor
  extends /**
  * The DistanceMeasurement2D widget calculates and displays the distance between two or more points in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The widget will compute distances geodetically for geographic coordinate systems and web mercator. For projected coordinate systems (non-web mercator), computations will be performed planimetrically for distances up to the threshold distance defined by [geodesicDistanceThreshold](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#geodesicDistanceThreshold). Distances equivalent to and beyond the threshold will be computed geodetically. By default the threshold is set to 100km.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html)
  */
Instantiable0[DistanceMeasurement2D]
     with Instantiable1[/* properties */ DistanceMeasurement2DProperties, DistanceMeasurement2D]

