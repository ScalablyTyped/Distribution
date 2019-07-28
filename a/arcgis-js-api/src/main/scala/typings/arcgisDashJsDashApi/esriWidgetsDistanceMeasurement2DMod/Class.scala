package typings.arcgisDashJsDashApi.esriWidgetsDistanceMeasurement2DMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.DistanceMeasurement2D
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.DistanceMeasurement2DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/DistanceMeasurement2D", JSImport.Namespace)
@js.native
/**
  * The DistanceMeasurement2D widget calculates and displays the distance between two or more points in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). When the distance is less than 100 km, the default [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#mode) is `planar`. When the distance is greater than or equal to 100 km, the default [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#mode) is `geodesic`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html)
  */
class Class () extends DistanceMeasurement2D {
  def this(properties: DistanceMeasurement2DProperties) = this()
}

