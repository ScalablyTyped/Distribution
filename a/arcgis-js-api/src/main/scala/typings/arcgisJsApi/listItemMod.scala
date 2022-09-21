package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ListItem
import typings.arcgisJsApi.esri.ListItemConstructor
import typings.arcgisJsApi.esri.ListItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod extends Shortcut {
  
  @JSImport("esri/widgets/LayerList/ListItem", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ListItemConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/LayerList/ListItem", JSImport.Namespace)
  @js.native
  /**
    * The ListItem class represents one of the [operationalItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#operationalItems) in the [LayerListViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)
    */
  open class Class ()
    extends StObject
       with ListItem {
    def this(properties: ListItemProperties) = this()
  }
  
  type _To = js.Object & ListItemConstructor
  
  /* This means you don't have to write `^`, but can instead just say `listItemMod.foo` */
  override def _to: js.Object & ListItemConstructor = ^
}
