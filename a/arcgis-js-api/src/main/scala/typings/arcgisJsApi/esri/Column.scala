package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends js.Object {
  
  /**
    * Returns any associated menu items on the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#getMenuItems)
    */
  def getMenuItems(): ButtonMenuItemConfig = js.native
  
  /**
    * The object to customize the feature table column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#menu)
    */
  val menu: ButtonMenu = js.native
  
  /**
    * Indicates whether the column is resizable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#resizable)
    */
  val resizable: Boolean = js.native
}
object Column {
  
  @scala.inline
  def apply(getMenuItems: () => ButtonMenuItemConfig, menu: ButtonMenu, resizable: Boolean): Column = {
    val __obj = js.Dynamic.literal(getMenuItems = js.Any.fromFunction0(getMenuItems), menu = menu.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    
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
    def setGetMenuItems(value: () => ButtonMenuItemConfig): Self = this.set("getMenuItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMenu(value: ButtonMenu): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
  }
}
