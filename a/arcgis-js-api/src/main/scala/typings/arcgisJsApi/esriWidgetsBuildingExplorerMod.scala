package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BuildingExplorer
import typings.arcgisJsApi.esri.BuildingExplorerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBuildingExplorerMod {
  
  @JSImport("esri/widgets/BuildingExplorer", JSImport.Namespace)
  @js.native
  /**
    * The BuildingExplorer widget is used to filter and explore the various components of [BuildingSceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html)
    */
  open class ^ ()
    extends StObject
       with BuildingExplorer {
    def this(properties: BuildingExplorerProperties) = this()
  }
}
