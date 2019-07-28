package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapToggleViewModel
  extends Accessor
     with Evented {
  /**
    * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#activeBasemap)
    */
  val activeBasemap: Basemap = js.native
  /**
    * The next basemap for toggling. One of the following values may be set to this property:
    *   * The [string ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) of any Esri basemap.
    *   * A custom [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) object. Since this property may be [autocast](https://developers.arcgis.com/javascript/latest/guide/autocasting/index.html), the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) module does not need to be included in the `require()` function in most applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#nextBasemap)
    */
  var nextBasemap: Basemap = js.native
  /**
    * The view model's state.  **Possible Values:** ready | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * The view from which the widget will operate. This view provides access to the initial [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) to toggle from via the view's [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Toggles to the [next basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#nextBasemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#toggle)
    *
    *
    */
  def toggle(): Unit = js.native
}

@JSGlobal("__esri.BasemapToggleViewModel")
@js.native
class BasemapToggleViewModelCls () extends BasemapToggleViewModel {
  def this(properties: BasemapToggleViewModelProperties) = this()
}

