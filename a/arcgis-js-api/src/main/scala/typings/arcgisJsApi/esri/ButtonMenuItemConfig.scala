package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonMenuItemConfig extends Object {
  
  /**
    * Indicates whether to automatically close the menu's item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var autoCloseMenu: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that executes on the ButtonMenuItem's `click` event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var clickFunction: js.UndefOr[ButtonMenuItemClickFunction] = js.native
  
  /**
    * Adds a CSS class to the menu button's DOM node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * An array of individual menu items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var items: js.UndefOr[js.Array[ButtonMenuItem]] = js.native
  
  /**
    * The label of the menu item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the menu content is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the menu item is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether a toggled state should be applied to individual menu items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.native
}
object ButtonMenuItemConfig {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ButtonMenuItemConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ButtonMenuItemConfig]
  }
  
  @scala.inline
  implicit class ButtonMenuItemConfigOps[Self <: ButtonMenuItemConfig] (val x: Self) extends AnyVal {
    
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
    def setAutoCloseMenu(value: Boolean): Self = this.set("autoCloseMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCloseMenu: Self = this.set("autoCloseMenu", js.undefined)
    
    @scala.inline
    def setClickFunction(value: /* event */ js.Any => Unit): Self = this.set("clickFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClickFunction: Self = this.set("clickFunction", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ButtonMenuItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ButtonMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSelectionEnabled(value: Boolean): Self = this.set("selectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionEnabled: Self = this.set("selectionEnabled", js.undefined)
  }
}
