package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisibleElementsMenuItems extends Object {
  
  /**
    * Indicates whether to display the `Clear selection` menu item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var clearSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to display the `Refresh data` menu item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var refreshData: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to enable toggling column visibility within the menu.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var toggleColumns: js.UndefOr[js.Any] = js.native
}
object VisibleElementsMenuItems {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VisibleElementsMenuItems = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VisibleElementsMenuItems]
  }
  
  @scala.inline
  implicit class VisibleElementsMenuItemsMutableBuilder[Self <: VisibleElementsMenuItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearSelection(value: Boolean): Self = StObject.set(x, "clearSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearSelectionUndefined: Self = StObject.set(x, "clearSelection", js.undefined)
    
    @scala.inline
    def setRefreshData(value: Boolean): Self = StObject.set(x, "refreshData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshDataUndefined: Self = StObject.set(x, "refreshData", js.undefined)
    
    @scala.inline
    def setToggleColumns(value: js.Any): Self = StObject.set(x, "toggleColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleColumnsUndefined: Self = StObject.set(x, "toggleColumns", js.undefined)
  }
}
