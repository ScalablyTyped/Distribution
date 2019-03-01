package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationToggleViewModelProperties extends js.Object {
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
  var navigationMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}

object NavigationToggleViewModelProperties {
  @scala.inline
  def apply(navigationMode: java.lang.String = null, view: SceneViewProperties = null): NavigationToggleViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (navigationMode != null) __obj.updateDynamic("navigationMode")(navigationMode)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[NavigationToggleViewModelProperties]
  }
}

