package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceMeasurement2D extends Widget {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#iconClass)
    */
  var iconClass: java.lang.String = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.  **Possible Values:** metric | imperial | inches | feet | us-feet | yards | miles | nautical-miles | meters | kilometers
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#unit)
    */
  var unit: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.metric | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.imperial | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.inches | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.feet | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`us-feet` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.yards | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.miles | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`nautical-miles` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.meters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.kilometers = js.native
  /**
    * List of available units and unit systems (imperial, metric) for displaying the distance values. By default, the following units are included: `metric`, `imperial`, `inches`, `feet`, `us-feet`, `yards`, `miles`, `nautical-miles`, `meters`, `kilometers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#unitOptions)
    */
  var unitOptions: js.Array[java.lang.String] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#view)
    */
  var view: MapView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DistanceMeasurement2DViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#viewModel)
    */
  var viewModel: DistanceMeasurement2DViewModel = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.DistanceMeasurement2D")
@js.native
/**
  * The DistanceMeasurement2D widget calculates and displays the distance between two or more points in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). When the distance is less than 100 km, the default [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#mode) is `planar`. When the distance is greater than or equal to 100 km, the default [mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#mode) is `geodesic`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html)
  */
class DistanceMeasurement2DCls () extends DistanceMeasurement2D {
  def this(properties: DistanceMeasurement2DProperties) = this()
}

