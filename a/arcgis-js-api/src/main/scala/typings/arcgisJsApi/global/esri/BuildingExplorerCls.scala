package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BuildingExplorerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.BuildingExplorer")
@js.native
/**
  * The BuildingExplorer widget is used to filter and explore the various components of [BuildingSceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html). [BuildingSceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) are complex digital models of buildings and interiors and can contain thousands of components grouped in sublayers. Using this widget, buildings can be filtered by level, construction phase or by disciplines and categories. Three elements are used to filter [BuildingSceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html): the Level element, the Construction phases element and the Disciplines are Categories list. The visibility of these elements can be configured using the widget's [visibleElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#visibleElements).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html)
  */
class BuildingExplorerCls ()
  extends typings.arcgisJsApi.esri.BuildingExplorer {
  def this(properties: BuildingExplorerProperties) = this()
}

