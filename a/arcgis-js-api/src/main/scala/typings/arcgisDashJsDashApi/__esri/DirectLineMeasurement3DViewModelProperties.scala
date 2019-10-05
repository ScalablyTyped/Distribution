package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectLineMeasurement3DViewModelProperties extends js.Object {
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.  **Possible Values:** metric | imperial | inches | feet | us-feet | yards | miles | nautical-miles | meters | kilometers
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#unit)
    */
  var unit: js.UndefOr[String] = js.undefined
  /**
    * List of unit systems (imperial, metric) and specific units for displaying the distance values. By default, the following units are included: `metric`, `imperial`, `inches`, `feet`, `us-feet`, `yards`, `miles`, `nautical-miles`, `meters`, `kilometers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#unitOptions)
    */
  var unitOptions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}

object DirectLineMeasurement3DViewModelProperties {
  @scala.inline
  def apply(unit: String = null, unitOptions: js.Array[String] = null, view: SceneViewProperties = null): DirectLineMeasurement3DViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (unitOptions != null) __obj.updateDynamic("unitOptions")(unitOptions)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[DirectLineMeasurement3DViewModelProperties]
  }
}

