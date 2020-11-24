package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingExplorerVisibleElements extends Object {
  
  /**
    * When set to `false`, the disciplines and categories sublayer list is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#VisibleElements)
    */
  var disciplines: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to `false`, the building levels filter is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#VisibleElements)
    */
  var levels: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to `false`, the construction phases filter is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#VisibleElements)
    */
  var phases: js.UndefOr[Boolean] = js.native
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
  implicit class BuildingExplorerVisibleElementsOps[Self <: BuildingExplorerVisibleElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisciplines(value: Boolean): Self = this.set("disciplines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisciplines: Self = this.set("disciplines", js.undefined)
    
    @scala.inline
    def setLevels(value: Boolean): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setPhases(value: Boolean): Self = this.set("phases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhases: Self = this.set("phases", js.undefined)
  }
}
