package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableListProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.UndefOr[TableListListItemCreatedHandler] = js.undefined
  
  /**
    * A reference to a [web map](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) containing the tables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#map)
    */
  var map: js.UndefOr[WebMapProperties] = js.undefined
  
  /**
    * Indicates whether more than one [list item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html) can be selected by a user at a single time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#multipleSelectionEnabled)
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A collection of selected [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html)s representing table list items selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#selectedItems)
    */
  var selectedItems: js.UndefOr[CollectionProperties[TableListListItem]] = js.undefined
  
  /**
    * Indicates whether [list items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html) may be selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#selectionEnabled)
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#viewModel)
    */
  var viewModel: js.UndefOr[TableListViewModel] = js.undefined
}
object TableListProperties {
  
  @scala.inline
  def apply(): TableListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableListProperties]
  }
  
  @scala.inline
  implicit class TableListPropertiesMutableBuilder[Self <: TableListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = StObject.set(x, "listItemCreatedFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListItemCreatedFunctionUndefined: Self = StObject.set(x, "listItemCreatedFunction", js.undefined)
    
    @scala.inline
    def setMap(value: WebMapProperties): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMultipleSelectionEnabled(value: Boolean): Self = StObject.set(x, "multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleSelectionEnabledUndefined: Self = StObject.set(x, "multipleSelectionEnabled", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: CollectionProperties[TableListListItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: TableListListItem*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectionEnabled(value: Boolean): Self = StObject.set(x, "selectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionEnabledUndefined: Self = StObject.set(x, "selectionEnabled", js.undefined)
    
    @scala.inline
    def setViewModel(value: TableListViewModel): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
