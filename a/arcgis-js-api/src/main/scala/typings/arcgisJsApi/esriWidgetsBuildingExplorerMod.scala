package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingExplorer
import typings.arcgisJsApi.esri.BuildingExplorerConstructor
import typings.arcgisJsApi.esri.BuildingExplorerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBuildingExplorerMod extends Shortcut {
  
  @JSImport("esri/widgets/BuildingExplorer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingExplorerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BuildingExplorer", JSImport.Namespace)
  @js.native
  /**
    * The BuildingExplorer widget is used to filter and explore the various components of [BuildingSceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html)
    */
  open class Class ()
    extends StObject
       with BuildingExplorer {
    def this(properties: BuildingExplorerProperties) = this()
  }
  
  type _To = js.Object & BuildingExplorerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBuildingExplorerMod.foo` */
  override def _to: js.Object & BuildingExplorerConstructor = ^
}
