package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingPhase
import typings.arcgisJsApi.esri.BuildingPhaseConstructor
import typings.arcgisJsApi.esri.BuildingPhaseProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingPhaseMod extends Shortcut {
  
  @JSImport("esri/widgets/BuildingExplorer/BuildingPhase", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingPhaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BuildingExplorer/BuildingPhase", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with BuildingPhase {
    def this(properties: BuildingPhaseProperties) = this()
  }
  
  type _To = js.Object & BuildingPhaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingPhaseMod.foo` */
  override def _to: js.Object & BuildingPhaseConstructor = ^
}
