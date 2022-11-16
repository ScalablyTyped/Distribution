package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingExplorerVisibleElements extends StObject {
  
  /**
    * When set to `false`, the disciplines and categories sublayer list is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#VisibleElements)
    */
  var disciplines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the building levels filter is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#VisibleElements)
    */
  var levels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the construction phases filter is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#VisibleElements)
    */
  var phases: js.UndefOr[Boolean] = js.undefined
}
object BuildingExplorerVisibleElements {
  
  inline def apply(): BuildingExplorerVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingExplorerVisibleElements]
  }
  
  extension [Self <: BuildingExplorerVisibleElements](x: Self) {
    
    inline def setDisciplines(value: Boolean): Self = StObject.set(x, "disciplines", value.asInstanceOf[js.Any])
    
    inline def setDisciplinesUndefined: Self = StObject.set(x, "disciplines", js.undefined)
    
    inline def setLevels(value: Boolean): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setPhases(value: Boolean): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    inline def setPhasesUndefined: Self = StObject.set(x, "phases", js.undefined)
  }
}
