package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * Returns any associated menu items on the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#getMenuItems)
    */
  def getMenuItems(): ButtonMenuItemConfig
  
  /**
    * The object to customize the feature table column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#menu)
    */
  val menu: ButtonMenu
  
  /**
    * Indicates whether the column is resizable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#resizable)
    */
  val resizable: Boolean
}
object Column {
  
  @scala.inline
  def apply(getMenuItems: () => ButtonMenuItemConfig, menu: ButtonMenu, resizable: Boolean): Column = {
    val __obj = js.Dynamic.literal(getMenuItems = js.Any.fromFunction0(getMenuItems), menu = menu.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMenuItems(value: () => ButtonMenuItemConfig): Self = StObject.set(x, "getMenuItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMenu(value: ButtonMenu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
  }
}
