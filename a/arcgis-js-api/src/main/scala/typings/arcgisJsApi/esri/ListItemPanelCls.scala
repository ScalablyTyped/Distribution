package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.ListItemPanel")
@js.native
/**
  * This class allows you to display custom content for each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget. ListItemPanel objects typically aren't constructed. Rather, they are modified using the [listItemCreatedFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#listItemCreatedFunction) property in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html)
  */
class ListItemPanelCls () extends ListItemPanel {
  /**
    * Adds a CSS class used to style a node that represents the panel. Clicking the node will open and close the panel. Typically, an icon font is used for this property. [Esri Icon Fonts](https://developers.arcgis.com/javascript/latest/guide/esri-icon-font/index.html) are automatically made available and can be used to represent this content. To use one of these provided icon fonts, you must prefix the class name with `esri-`. For example, the default icon font is `esri-icon-layer-list`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#className)
    *
    * @default esri-icon-layer-list
    */
  /* CompleteClass */
  override var className: String = js.native
  /**
    * The content displayed in the ListItem panel. This can be raw text, a [Widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) instance, an HTML Element, or an array of any of those elements.  If the text `legend` is used, then an instance of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget is placed in the content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#content)
    */
  /* CompleteClass */
  override var content: Widget_ | HTMLElement | String | js.Array[_] = js.native
  /**
    * The URL or data URI of an image used to represent the panel. This property will be used as a background image for the node. If neither `image` nor `className` are specified, a default icon ![default icon](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/41/default-action.png) will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#image)
    */
  /* CompleteClass */
  override var image: String = js.native
  /**
    * The panel's parent ListItem that represents a layer in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#listItem)
    */
  /* CompleteClass */
  override var listItem: ListItem = js.native
  /**
    * Indicates if the panel's content is open and visible to the user. This is different from the [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#visible) property, which is used for toggling the visibility of the icon used to control whether the content is expanded or collapsed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#open)
    *
    * @default false
    */
  /* CompleteClass */
  override var open: Boolean = js.native
  /**
    * The title of the panel. By default, this title matches the ListItem's title. Changing this value will not change the title of the ListItem in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#title)
    */
  /* CompleteClass */
  override var title: String = js.native
  /**
    * Indicates if the node containing the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#image) or [icon font](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#className) is visible to the user. Setting this value to `false` will prevent the user from toggling the visibility of the panel's content. Use [open](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#open) to programmatically set the visibility of the panel's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#visible)
    *
    * @default true
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
}

