package typings.arcgisJsApi.sceneLayerMod

import typings.arcgisJsApi.esri.SceneLayer
import typings.arcgisJsApi.esri.SceneLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/SceneLayer", JSImport.Namespace)
@js.native
/**
  * The SceneLayer is a layer type designed for on-demand streaming and displaying large amounts of data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). SceneLayers support two geometry types: [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) and 3D Objects (e.g. Buildings).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html)
  */
class Class () extends SceneLayer {
  def this(properties: SceneLayerProperties) = this()
}

