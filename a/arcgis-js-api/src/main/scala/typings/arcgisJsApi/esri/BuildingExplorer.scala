package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingExplorer
  extends StObject
     with Widget_ {
  
  /**
  		 * Indicates the heading level to use for the headings in the widget.
  		 *
  		 * @default 3
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#headingLevel)
  		 */
  var headingLevel: Double = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/BuildingExplorer#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  /**
  		 * A [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of layers of type [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) that are added to the widget for exploration.
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
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#viewModel)
  		 */
  var viewModel: BuildingExplorerViewModel = js.native
  
  /**
  		 * This property provides the ability to display or hide the individual elements of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#visibleElements)
  		 */
  var visibleElements: BuildingExplorerVisibleElements = js.native
}
