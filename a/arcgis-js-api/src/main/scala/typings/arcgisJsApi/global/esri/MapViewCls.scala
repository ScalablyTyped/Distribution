package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MapViewProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.MapView")
@js.native
/**
  * A MapView displays a 2D view of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) instance. An instance of MapView must be created to render a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) (along with its operational and base layers) in 2D. To render a map and its layers in 3D, see the documentation for [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). For a general overview of views, see [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html)
  */
class MapViewCls ()
  extends typings.arcgisJsApi.esri.MapView {
  def this(properties: MapViewProperties) = this()
}

