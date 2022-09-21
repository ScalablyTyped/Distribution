package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemPanel extends StObject {
  
  /**
    * Adds a CSS class used to style a node that represents the panel.
    *
    * @default esri-icon-layer-list
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#className)
    */
  var className: String
  
  /**
    * The content displayed in the ListItem panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#content)
    */
  var content: Widget_ | HTMLElement | String | js.Array[Any]
  
  /**
    * The URL or data URI of an image used to represent the panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#image)
    */
  var image: String
  
  /**
    * The panel's parent ListItem that represents a layer in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#listItem)
    */
  var listItem: ListItem
  
  /**
    * Indicates if the panel's content is open and visible to the user.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#open)
    */
  var open: Boolean
  
  /**
    * The title of the panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#title)
    */
  var title: String
  
  /**
    * Indicates if the node containing the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#image) or [icon font](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#className) is visible to the user.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#visible)
    */
  var visible: Boolean
}
object ListItemPanel {
  
  inline def apply(
    className: String,
    content: Widget_ | HTMLElement | String | js.Array[Any],
    image: String,
    listItem: ListItem,
    open: Boolean,
    title: String,
    visible: Boolean
  ): ListItemPanel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], listItem = listItem.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemPanel]
  }
  
  extension [Self <: ListItemPanel](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Widget_ | HTMLElement | String | js.Array[Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: Any*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setListItem(value: ListItem): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
