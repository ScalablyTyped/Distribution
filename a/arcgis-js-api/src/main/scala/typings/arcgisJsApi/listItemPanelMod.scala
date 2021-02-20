package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ListItemPanel
import typings.arcgisJsApi.esri.ListItemPanelConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  class Class () extends ListItemPanel
  
  type _To = ListItemPanelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `listItemPanelMod.foo` */
  override def _to: ListItemPanelConstructor = ^
}
