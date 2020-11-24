package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableListProperties extends WidgetProperties {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.UndefOr[TableListListItemCreatedHandler] = js.native
  
  /**
    * A reference to a [web map](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) containing the tables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#map)
    */
  var map: js.UndefOr[WebMapProperties] = js.native
  
  /**
    * Indicates whether more than one [list item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html) can be selected by a user at a single time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#multipleSelectionEnabled)
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A collection of selected [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html)s representing table list items selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#selectedItems)
    */
  var selectedItems: js.UndefOr[CollectionProperties[TableListListItem]] = js.native
  
  /**
    * Indicates whether [list items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html) may be selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#selectionEnabled)
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#viewModel)
    */
  var viewModel: js.UndefOr[TableListViewModel] = js.native
}
object TableListProperties {
  
  @scala.inline
  def apply(): TableListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableListProperties]
  }
  
  @scala.inline
  implicit class TableListPropertiesOps[Self <: TableListProperties] (val x: Self) extends AnyVal {
    
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
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = this.set("listItemCreatedFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteListItemCreatedFunction: Self = this.set("listItemCreatedFunction", js.undefined)
    
    @scala.inline
    def setMap(value: WebMapProperties): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMultipleSelectionEnabled(value: Boolean): Self = this.set("multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleSelectionEnabled: Self = this.set("multipleSelectionEnabled", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: TableListListItem*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: CollectionProperties[TableListListItem]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setSelectionEnabled(value: Boolean): Self = this.set("selectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionEnabled: Self = this.set("selectionEnabled", js.undefined)
    
    @scala.inline
    def setViewModel(value: TableListViewModel): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
