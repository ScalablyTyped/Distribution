package typings.arcgisDashJsDashApi.esriWidgetsAreaMeasurement2DMod

import typings.arcgisDashJsDashApi.__esri.AreaMeasurement2D
import typings.arcgisDashJsDashApi.__esri.AreaMeasurement2DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/AreaMeasurement2D", JSImport.Namespace)
@js.native
/**
  * The AreaMeasurement2D widget calculates and displays the area and perimeter of a polygon in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The widget will compute areas and perimeters geodetically for geographic coordinate systems and web mercator. For projected coordinate systems (non-web mercator), computations will be performed planimetrically for distances up to the threshold distance defined by the [geodesicDistanceThreshold](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#geodesicDistanceThreshold). Perimeters equivalent to and beyond the threshold will be computed geodetically. By default the threshold is set to 100km.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html)
  */
class Class () extends AreaMeasurement2D {
  def this(properties: AreaMeasurement2DProperties) = this()
}

