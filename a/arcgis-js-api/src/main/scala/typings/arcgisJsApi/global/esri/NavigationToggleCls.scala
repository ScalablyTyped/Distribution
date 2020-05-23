package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.NavigationToggleProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.NavigationToggle")
@js.native
/**
  * Provides two simple buttons for toggling the [navigation mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#navigationMode) of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Note that this widget is designed only for 3D mouse interaction in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). It has no effect on touch navigation and it should not be used with 2D mouse interaction in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html)
  */
class NavigationToggleCls ()
  extends typings.arcgisJsApi.esri.NavigationToggle {
  def this(properties: NavigationToggleProperties) = this()
}

