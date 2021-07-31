package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.failed
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingExplorerViewModel
  extends StObject
     with Accessor {
  
  /**
    * A collection of layers of type [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) that are added to the widget for exploration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#layers)
    */
  var layers: Collection[BuildingSceneLayer] = js.native
  
  /**
    * Contains information about the level filter, such as the value selected by the user in the Level element or the minimum and maximum allowed values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#level)
    */
  val level: BuildingLevel = js.native
  
  /**
    * Contains information about the construction phase filter, such as the value selected by the user in the Construction phases element and the minimum and maximum allowed values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#phase)
    */
  val phase: BuildingPhase = js.native
  
  /**
    * The current state of the view model that can be used for rendering the UI of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#state)
    */
  val state: disabled | loading | ready | failed = js.native
  
  /**
    * The view in which the BuildingExplorer is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#view)
    */
  var view: SceneView = js.native
}
