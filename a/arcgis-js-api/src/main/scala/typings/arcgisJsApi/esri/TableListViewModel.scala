package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the logic for the [TableList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html) widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html)
  */
trait TableListViewModel extends StObject {
  
  /**
    * Whether to provide an indication if a layer is being published in the [TableList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html#checkPublishStatusEnabled)
    */
  var checkPublishStatusEnabled: Boolean
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html#listItemCreatedFunction)
    */
  def listItemCreatedFunction(event: Any): scala.Unit
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html#listItemCreatedFunction)
    */
  @JSName("listItemCreatedFunction")
  var listItemCreatedFunction_Original: TableListViewModelListItemCreatedHandler
  
  /**
    * A reference to the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) containing the tables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-TableListViewModel.html#map)
    */
  var map: Map | WebMap
  
  /**
    * The view model's state.
    *
    * @default disabled
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
  
  inline def apply(
    checkPublishStatusEnabled: Boolean,
    listItemCreatedFunction: /* event */ Any => scala.Unit,
    map: Map | WebMap,
    state: loading | ready | disabled,
    tableItems: Collection[TableListListItem]
  ): TableListViewModel = {
    val __obj = js.Dynamic.literal(checkPublishStatusEnabled = checkPublishStatusEnabled.asInstanceOf[js.Any], listItemCreatedFunction = js.Any.fromFunction1(listItemCreatedFunction), map = map.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tableItems = tableItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableListViewModel]
  }
  
  extension [Self <: TableListViewModel](x: Self) {
    
    inline def setCheckPublishStatusEnabled(value: Boolean): Self = StObject.set(x, "checkPublishStatusEnabled", value.asInstanceOf[js.Any])
    
    inline def setListItemCreatedFunction(value: /* event */ Any => scala.Unit): Self = StObject.set(x, "listItemCreatedFunction", js.Any.fromFunction1(value))
    
    inline def setMap(value: Map | WebMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setState(value: loading | ready | disabled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTableItems(value: Collection[TableListListItem]): Self = StObject.set(x, "tableItems", value.asInstanceOf[js.Any])
  }
}
