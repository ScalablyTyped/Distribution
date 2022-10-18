package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingLevel
import typings.arcgisJsApi.esri.BuildingLevelConstructor
import typings.arcgisJsApi.esri.BuildingLevelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBuildingExplorerBuildingLevelMod extends Shortcut {
  
  @JSImport("esri/widgets/BuildingExplorer/BuildingLevel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingLevelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BuildingExplorer/BuildingLevel", JSImport.Namespace)
  @js.native
  /**
    * Provides information for the building level filter, such as the value selected by the user or the minimum and maximum allowed values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html)
    */
  open class Class ()
    extends StObject
       with BuildingLevel {
    def this(properties: BuildingLevelProperties) = this()
  }
  
  type _To = js.Object & BuildingLevelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBuildingExplorerBuildingLevelMod.foo` */
  override def _to: js.Object & BuildingLevelConstructor = ^
}
