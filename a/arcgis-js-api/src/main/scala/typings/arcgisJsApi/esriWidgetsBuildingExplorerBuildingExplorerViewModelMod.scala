package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingExplorerViewModel
import typings.arcgisJsApi.esri.BuildingExplorerViewModelConstructor
import typings.arcgisJsApi.esri.BuildingExplorerViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBuildingExplorerBuildingExplorerViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/BuildingExplorer/BuildingExplorerViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingExplorerViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BuildingExplorer/BuildingExplorerViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [BuildingExplorer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html)
    */
  open class Class ()
    extends StObject
       with BuildingExplorerViewModel {
    def this(properties: BuildingExplorerViewModelProperties) = this()
  }
  
  type _To = js.Object & BuildingExplorerViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBuildingExplorerBuildingExplorerViewModelMod.foo` */
  override def _to: js.Object & BuildingExplorerViewModelConstructor = ^
}
