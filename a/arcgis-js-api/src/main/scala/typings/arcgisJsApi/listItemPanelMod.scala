package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ListItem
import typings.arcgisJsApi.esri.ListItemPanel
import typings.arcgisJsApi.esri.ListItemPanelConstructor
import typings.arcgisJsApi.esri.Widget_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemPanelMod extends Shortcut {
  
  @JSImport("esri/widgets/LayerList/ListItemPanel", JSImport.Namespace)
  @js.native
  val ^ : ListItemPanelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/LayerList/ListItemPanel", JSImport.Namespace)
  @js.native
  /**
    * This class allows you to display custom content for each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html)
    */
  open class Class ()
    extends StObject
       with ListItemPanel {
    
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
    var content: Widget_ | HTMLElement | String | js.Array[Any] = js.native
    
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
    var listItem: ListItem = js.native
    
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
  
  type _To = ListItemPanelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `listItemPanelMod.foo` */
  override def _to: ListItemPanelConstructor = ^
}
