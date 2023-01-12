package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTableVisibleElements extends StObject {
  
  /**
    * _(Since 4.23)_ Indicates whether to display the menu items within the individual columns.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var columnMenus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the feature table's header information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var header: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the feature table's menu.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var menu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The menu items within the feature table menu.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var menuItems: js.UndefOr[VisibleElementsMenuItems] = js.undefined
  
  /**
    * Indicates whether to display the selection column in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var selectionColumn: js.UndefOr[Boolean] = js.undefined
}
object FeatureTableVisibleElements {
  
  inline def apply(): FeatureTableVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTableVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureTableVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setColumnMenus(value: Boolean): Self = StObject.set(x, "columnMenus", value.asInstanceOf[js.Any])
    
    inline def setColumnMenusUndefined: Self = StObject.set(x, "columnMenus", js.undefined)
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuItems(value: VisibleElementsMenuItems): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
    
    inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setSelectionColumn(value: Boolean): Self = StObject.set(x, "selectionColumn", value.asInstanceOf[js.Any])
    
    inline def setSelectionColumnUndefined: Self = StObject.set(x, "selectionColumn", js.undefined)
  }
}
