package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingExplorer extends Widget_ {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * A collection of layers of type [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) that are added to the widget for exploration. The widget is only displayed when this property is set. In case of multiple layers, the widget will display and apply the filters on all layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#layers)
    */
  var layers: Collection[BuildingSceneLayer] = js.native
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#view)
    */
  var view: SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BuildingExplorerViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#viewModel)
    */
  var viewModel: BuildingExplorerViewModel = js.native
  /**
    * This property provides the ability to display or hide the individual elements of the widget. BuildingExplorer has three elements: buildings levels filter, construction phases filter and the sublayers list. By default they are all displayed. In case the [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) doesn't provide [field statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html) information, then the filters for building levels and construction phases will not be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#visibleElements)
    */
  var visibleElements: BuildingExplorerVisibleElements = js.native
}

