package typings
package arcgisDashJsDashApiLib.esriWidgetsDistanceMeasurement2DDistanceMeasurement2DViewModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/DistanceMeasurement2D/DistanceMeasurement2DViewModel", JSImport.Namespace)
@js.native
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.DistanceMeasurement2DViewModel {
  def this(properties: js.Any) = this()
  /**
    * The threshold distance used by the "auto" mode to switch between planar and geodesic linear computations. The threshold is measured in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  /* CompleteClass */
  override var geodesicDistanceThreshold: scala.Double = js.native
  /**
    * The length and geometry of the measurement polyline in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  /* CompleteClass */
  override val measurement: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.DistanceMeasurement2DViewModelMeasurement = js.native
  /**
    * This property returns the locale specific representation of the length. Lengths are rounded to two decimal places. Lengths are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement) property (in meters) and converted to the user defined units or system and mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurementLabel)
    */
  /* CompleteClass */
  override val measurementLabel: java.lang.String = js.native
  /**
    * The mode used to calculate the length of lines.  **Possible Values:** auto | planar | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#mode)
    *
    * @default auto
    */
  /* CompleteClass */
  override var mode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.auto | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.planar | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.geodesic = js.native
  /**
    * An array of valid mode values. By default, the following units are included: `auto`, `planar`, `geodesic`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#modes)
    */
  /* CompleteClass */
  override val modes: js.Array[java.lang.String] = js.native
  /**
    * The view model's state.  **Possible Values:** disabled | ready | measuring | measured
    *
    *    Value    | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    * measured    | measuring has finished
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#state)
    *
    * @default disabled
    */
  /* CompleteClass */
  override val state: java.lang.String = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.  **Possible Values:** metric | imperial | inches | feet | us-feet | yards | miles | nautical-miles | meters | kilometers
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unit)
    */
  /* CompleteClass */
  override var unit: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.metric | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.imperial | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.inches | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.feet | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`us-feet` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.yards | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.miles | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`nautical-miles` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.meters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.kilometers = js.native
  /**
    * List of available units and unit systems (imperial, metric) for displaying the distance values. By default, the following units are included: `metric`, `imperial`, `inches`, `feet`, `us-feet`, `yards`, `miles`, `nautical-miles`, `meters`, `kilometers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unitOptions)
    */
  /* CompleteClass */
  override var unitOptions: js.Array[java.lang.String] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#view)
    */
  /* CompleteClass */
  override var view: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MapView = js.native
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def clearMeasurement(): scala.Unit = js.native
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def newMeasurement(): scala.Unit = js.native
}

