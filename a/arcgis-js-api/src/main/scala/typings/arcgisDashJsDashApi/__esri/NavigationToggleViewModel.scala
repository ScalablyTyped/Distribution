package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationToggleViewModel extends Accessor {
  /**
    * The navigation mode of the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#view). See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|-------------
    * pan | The mouse drag gesture pans the view. Right-click + drag allows the user to perform a 3D rotate around the center of the view.
    * rotate | The mouse drag gesture performs a 3D rotate around the center of the view and the right-click + drag gesture pans the view.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#navigationMode)
    *
    * @default pan
    */
  var navigationMode: String = js.native
  /**
    * The state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready = js.native
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#view)
    */
  var view: SceneView = js.native
  /**
    * Toggles the navigation mode of the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#view) from `pan` to `rotate` or vice versa.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#toggle)
    *
    *
    */
  def toggle(): Unit = js.native
}

@JSGlobal("__esri.NavigationToggleViewModel")
@js.native
object NavigationToggleViewModel extends TopLevel[NavigationToggleViewModelConstructor]

