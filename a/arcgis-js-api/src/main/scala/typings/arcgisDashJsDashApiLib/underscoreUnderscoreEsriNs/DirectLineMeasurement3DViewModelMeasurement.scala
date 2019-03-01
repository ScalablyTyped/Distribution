package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectLineMeasurement3DViewModelMeasurement
  extends stdLib.Object {
  /**
    * The direct distance between the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var directDistance: DirectLineMeasurement3DViewModelMeasurementValue
  /**
    * The horizontal distance between the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var horizontalDistance: DirectLineMeasurement3DViewModelMeasurementValue
  /**
    * Describes the mode in which the measurement was taken. In `euclidean` mode, the distances are measured as straight lines in the [ECEF](https://en.wikipedia.org/wiki/ECEF) coordinate system. In `geodesic` mode, the distances are measured as geodesic lines on the WGS84 ellipsoid.  **Possible Values:** euclidean | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var measurementMode: java.lang.String
  /**
    * The vertical distance between the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var verticalDistance: DirectLineMeasurement3DViewModelMeasurementValue
}

object DirectLineMeasurement3DViewModelMeasurement {
  @scala.inline
  def apply(
    constructor: js.Function,
    directDistance: DirectLineMeasurement3DViewModelMeasurementValue,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    horizontalDistance: DirectLineMeasurement3DViewModelMeasurementValue,
    measurementMode: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    verticalDistance: DirectLineMeasurement3DViewModelMeasurementValue
  ): DirectLineMeasurement3DViewModelMeasurement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("directDistance")(directDistance)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("horizontalDistance")(horizontalDistance)
    __obj.updateDynamic("measurementMode")(measurementMode)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("verticalDistance")(verticalDistance)
    __obj.asInstanceOf[DirectLineMeasurement3DViewModelMeasurement]
  }
}

