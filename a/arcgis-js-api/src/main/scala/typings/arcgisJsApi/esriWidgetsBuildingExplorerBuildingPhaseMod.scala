package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingPhase
import typings.arcgisJsApi.esri.BuildingPhaseConstructor
import typings.arcgisJsApi.esri.BuildingPhaseProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBuildingExplorerBuildingPhaseMod extends Shortcut {
  
  @JSImport("esri/widgets/BuildingExplorer/BuildingPhase", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingPhaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BuildingExplorer/BuildingPhase", JSImport.Namespace)
  @js.native
  /**
    * BuildingPhase provides information for the construction phase filter, such as the value selected by the user or the minimum and maximum allowed values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html)
    */
  open class Class ()
    extends StObject
       with BuildingPhase {
    def this(properties: BuildingPhaseProperties) = this()
  }
  
  type _To = js.Object & BuildingPhaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBuildingExplorerBuildingPhaseMod.foo` */
  override def _to: js.Object & BuildingPhaseConstructor = ^
}
