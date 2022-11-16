package typings.arcgisJsApi.global.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ListItemPanel")
@js.native
open class ListItemPanel ()
  extends StObject
     with typings.arcgisJsApi.esri.ListItemPanel {
  
  /**
    * Adds a CSS class used to style a node that represents the panel.
    *
    * @default esri-icon-layer-list
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#className)
    */
  /* CompleteClass */
  var className: String = js.native
  
  /**
    * The content displayed in the ListItem panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#content)
    */
  /* CompleteClass */
  var content: typings.arcgisJsApi.esri.Widget_ | HTMLElement | String | js.Array[Any] = js.native
  
  /**
    * If `true`, disables the ListItem's panel so the user cannot open or interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#disabled)
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /**
    * The URL or data URI of an image used to represent the panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#image)
    */
  /* CompleteClass */
  var image: String = js.native
  
  /**
    * The panel's parent ListItem that represents a layer in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#listItem)
    */
  /* CompleteClass */
  var listItem: typings.arcgisJsApi.esri.ListItem = js.native
  
  /**
    * Indicates if the panel's content is open and visible to the user.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#open)
    */
  /* CompleteClass */
  var open: Boolean = js.native
  
  /**
    * The title of the panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#title)
    */
  /* CompleteClass */
  var title: String = js.native
  
  /**
    * Indicates if the node containing the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#image) or [icon font](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#className) is visible to the user.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#visible)
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
