package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectLineMeasurement3D extends Widget {
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.  **Possible Values:** metric | imperial | inches | feet | us-feet | yards | miles | nautical-miles | meters | kilometers
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unit)
    */
  var unit: java.lang.String = js.native
  /**
    * List of unit systems (imperial, metric) and specific units for displaying the distance values. By default, the following units are included: `metric`, `imperial`, `inches`, `feet`, `us-feet`, `yards`, `miles`, `nautical-miles`, `meters`, `kilometers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unitOptions)
    */
  var unitOptions: js.Array[java.lang.String] = js.native
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#view)
    */
  var view: SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DirectLineMeasurement3DViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#viewModel)
    */
  var viewModel: DirectLineMeasurement3DViewModel = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.DirectLineMeasurement3D")
@js.native
/**
  * The DirectLineMeasurement3D widget calculates and displays the 3D distance between two points. This widget can be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) to measure the vertical, horizontal, and direct distance between two points.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html)
  */
class DirectLineMeasurement3DCls () extends DirectLineMeasurement3D {
  def this(properties: DirectLineMeasurement3DProperties) = this()
}

