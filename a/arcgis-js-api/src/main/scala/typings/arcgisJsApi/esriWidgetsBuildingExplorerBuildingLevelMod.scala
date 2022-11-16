package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BuildingLevel
import typings.arcgisJsApi.esri.BuildingLevelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBuildingExplorerBuildingLevelMod {
  
  @JSImport("esri/widgets/BuildingExplorer/BuildingLevel", JSImport.Namespace)
  @js.native
  /**
    * Provides information for the building level filter, such as the value selected by the user or the minimum and maximum allowed values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingLevel.html)
    */
  open class ^ ()
    extends StObject
       with BuildingLevel {
    def this(properties: BuildingLevelProperties) = this()
  }
}
