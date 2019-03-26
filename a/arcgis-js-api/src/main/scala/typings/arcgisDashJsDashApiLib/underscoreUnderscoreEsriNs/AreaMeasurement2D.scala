package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaMeasurement2D extends Widget {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#iconClass)
    */
  val iconClass: java.lang.String = js.native
  /**
    * The widget's default label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#label)
    */
  val label: java.lang.String = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.  **Possible Values:** metric | imperial | square-inches | square-feet | square-us-feet | square-yards | square-miles | square-meters | square-kilometers | acres | ares | hectares
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unit)
    */
  var unit: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.metric | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.imperial | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-inches` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-feet` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-us-feet` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-yards` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-miles` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-meters` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-kilometers` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.acres | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.ares | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hectares = js.native
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values. By default, the following units are included: `metric`, `imperial`, `square-inches`, `square-feet`, `square-us-feet`, `square-yards`, `square-miles`, `square-meters`, `square-kilometers`, `acres`, `ares`, `hectares`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unitOptions)
    */
  var unitOptions: js.Array[java.lang.String] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#view)
    */
  var view: MapView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [AreaMeasurement2DViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#viewModel)
    */
  var viewModel: AreaMeasurement2DViewModel = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

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

