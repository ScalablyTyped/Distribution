package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableListListItem
  extends StObject
     with Identifiable {
  
  /**
    * Indicates whether the actions panel is open in the TableList.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#actionsOpen)
    */
  var actionsOpen: Boolean
  
  /**
    * A nested 2-dimensional collection of actions that could be triggered on the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#actionsSections)
    */
  var actionsSections: Collection[Collection[ActionButton | ActionToggle]]
  
  /**
    * The Error object returned if an error occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#error)
    */
  val error: Error
  
  /**
    * When `true`, hides the layer from the TableList instance.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#hidden)
    */
  var hidden: Boolean
  
  /**
    * The layer associated with the triggered action.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#layer)
    */
  var layer: Layer
  
  /**
    * Value is `true` when the [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#layer) is being published.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#publishing)
    */
  val publishing: Boolean
  
  /**
    * The title of the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#title)
    */
  var title: String
}
object TableListListItem {
  
  inline def apply(
    actionsOpen: Boolean,
    actionsSections: Collection[Collection[ActionButton | ActionToggle]],
    error: Error,
    hidden: Boolean,
    layer: Layer,
    publishing: Boolean,
    title: String
  ): TableListListItem = {
    val __obj = js.Dynamic.literal(actionsOpen = actionsOpen.asInstanceOf[js.Any], actionsSections = actionsSections.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], publishing = publishing.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableListListItem]
  }
  
  extension [Self <: TableListListItem](x: Self) {
    
    inline def setActionsOpen(value: Boolean): Self = StObject.set(x, "actionsOpen", value.asInstanceOf[js.Any])
    
    inline def setActionsSections(value: Collection[Collection[ActionButton | ActionToggle]]): Self = StObject.set(x, "actionsSections", value.asInstanceOf[js.Any])
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setPublishing(value: Boolean): Self = StObject.set(x, "publishing", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
