package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElementsMenuItems extends StObject {
  
  /**
  		 * Indicates whether to display the `Clear selection` menu item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
  		 */
  var clearSelection: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * _(Since 4.25)_ Indicates whether to display the `Delete Selection` menu item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
  		 */
  var deleteSelection: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the `Refresh data` menu item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
  		 */
  var refreshData: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * _(Since 4.23)_ Indicates whether to toggle between showing only selected records in the table to showing all of the records.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
  		 */
  var selectedRecordsShowAllToggle: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * _(Since 4.23)_ Indicates whether to display the `Show selected records` menu item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
  		 */
  var showSelectedToggle: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to enable toggling column visibility within the menu.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
  		 */
  var toggleColumns: js.UndefOr[Any] = js.undefined
  
  /**
  		 * _(Since 4.23)_ Indicates whether to display the `Zoom to selected` menu item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
  		 */
  var zoomToSelection: js.UndefOr[Any] = js.undefined
}
object VisibleElementsMenuItems {
  
  inline def apply(): VisibleElementsMenuItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleElementsMenuItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleElementsMenuItems] (val x: Self) extends AnyVal {
    
    inline def setClearSelection(value: Boolean): Self = StObject.set(x, "clearSelection", value.asInstanceOf[js.Any])
    
    inline def setClearSelectionUndefined: Self = StObject.set(x, "clearSelection", js.undefined)
    
    inline def setDeleteSelection(value: Boolean): Self = StObject.set(x, "deleteSelection", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelectionUndefined: Self = StObject.set(x, "deleteSelection", js.undefined)
    
    inline def setRefreshData(value: Boolean): Self = StObject.set(x, "refreshData", value.asInstanceOf[js.Any])
    
    inline def setRefreshDataUndefined: Self = StObject.set(x, "refreshData", js.undefined)
    
    inline def setSelectedRecordsShowAllToggle(value: Boolean): Self = StObject.set(x, "selectedRecordsShowAllToggle", value.asInstanceOf[js.Any])
    
    inline def setSelectedRecordsShowAllToggleUndefined: Self = StObject.set(x, "selectedRecordsShowAllToggle", js.undefined)
    
    inline def setShowSelectedToggle(value: Boolean): Self = StObject.set(x, "showSelectedToggle", value.asInstanceOf[js.Any])
    
    inline def setShowSelectedToggleUndefined: Self = StObject.set(x, "showSelectedToggle", js.undefined)
    
    inline def setToggleColumns(value: Any): Self = StObject.set(x, "toggleColumns", value.asInstanceOf[js.Any])
    
    inline def setToggleColumnsUndefined: Self = StObject.set(x, "toggleColumns", js.undefined)
    
    inline def setZoomToSelection(value: Any): Self = StObject.set(x, "zoomToSelection", value.asInstanceOf[js.Any])
    
    inline def setZoomToSelectionUndefined: Self = StObject.set(x, "zoomToSelection", js.undefined)
  }
}
