package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingExplorerVisibleElements
  extends StObject
     with Object {
  
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
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BuildingExplorerVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BuildingExplorerVisibleElements]
  }
  
  @scala.inline
  implicit class BuildingExplorerVisibleElementsMutableBuilder[Self <: BuildingExplorerVisibleElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisciplines(value: Boolean): Self = StObject.set(x, "disciplines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisciplinesUndefined: Self = StObject.set(x, "disciplines", js.undefined)
    
    @scala.inline
    def setLevels(value: Boolean): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setPhases(value: Boolean): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhasesUndefined: Self = StObject.set(x, "phases", js.undefined)
  }
}
