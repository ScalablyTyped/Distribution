package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement3DViewModelProperties extends js.Object {
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.  **Possible Values:** metric | imperial | square-inches | square-feet | square-us-feet | square-yards | square-miles | square-meters | square-kilometers | acres | ares | hectares
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#unit)
    */
  var unit: js.UndefOr[String] = js.undefined
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values. By default, the following units are included: `metric`, `imperial`, `square-inches`, `square-feet`, `square-us-feet`, `square-yards`, `square-miles`, `square-meters`, `square-kilometers`, `acres`, `ares`, `hectares`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#unitOptions)
    */
  var unitOptions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}

object AreaMeasurement3DViewModelProperties {
  @scala.inline
  def apply(unit: String = null, unitOptions: js.Array[String] = null, view: SceneViewProperties = null): AreaMeasurement3DViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (unitOptions != null) __obj.updateDynamic("unitOptions")(unitOptions)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[AreaMeasurement3DViewModelProperties]
  }
}

