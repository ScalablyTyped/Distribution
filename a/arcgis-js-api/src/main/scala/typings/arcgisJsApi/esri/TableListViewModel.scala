package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableListViewModel extends StObject {
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html#listItemCreatedFunction)
    */
  def listItemCreatedFunction(event: js.Any): Unit
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html#listItemCreatedFunction)
    */
  @JSName("listItemCreatedFunction")
  var listItemCreatedFunction_Original: TableListViewModelListItemCreatedHandler
  
  /**
    * A reference to the [web map](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) containing the tables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html#map)
    */
  var map: WebMap
  
  /**
    * The view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html#state)
    */
  val state: loading | ready | disabled
  
  /**
    * The collection of table [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html)s displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html#tableItems)
    */
  val tableItems: Collection[TableListListItem]
}
object TableListViewModel {
  
  @scala.inline
  def apply(
    listItemCreatedFunction: /* event */ js.Any => Unit,
    map: WebMap,
    state: loading | ready | disabled,
    tableItems: Collection[TableListListItem]
  ): TableListViewModel = {
    val __obj = js.Dynamic.literal(listItemCreatedFunction = js.Any.fromFunction1(listItemCreatedFunction), map = map.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tableItems = tableItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableListViewModel]
  }
  
  @scala.inline
  implicit class TableListViewModelMutableBuilder[Self <: TableListViewModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = StObject.set(x, "listItemCreatedFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: WebMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: loading | ready | disabled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableItems(value: Collection[TableListListItem]): Self = StObject.set(x, "tableItems", value.asInstanceOf[js.Any])
  }
}
