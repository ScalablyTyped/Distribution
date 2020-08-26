package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BuildingSceneLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.BuildingSceneLayer")
@js.native
/**
  * The BuildingSceneLayer is designed for visualizing buildings with detailed interiors in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). These building models are usually exported from Building Information Modeling (BIM) projects. The data in a BuildingSceneLayer can represent walls, lighting fixtures, mechanical systems, furniture and so on.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html)
  */
class BuildingSceneLayerCls ()
  extends typings.arcgisJsApi.esri.BuildingSceneLayer {
  def this(properties: BuildingSceneLayerProperties) = this()
}

