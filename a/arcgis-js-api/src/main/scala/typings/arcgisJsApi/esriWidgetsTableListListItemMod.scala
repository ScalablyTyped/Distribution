package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ActionButton
import typings.arcgisJsApi.esri.ActionToggle
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Error
import typings.arcgisJsApi.esri.Layer
import typings.arcgisJsApi.esri.TableListListItem
import typings.arcgisJsApi.esri.TableListListItemConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsTableListListItemMod extends Shortcut {
  
  @JSImport("esri/widgets/TableList/ListItem", JSImport.Namespace)
  @js.native
  val ^ : TableListListItemConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/TableList/ListItem", JSImport.Namespace)
  @js.native
  /**
    * In the [TableList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html) widget UI, the ListItem represents a layer's table added to the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html)
    */
  open class Class ()
    extends StObject
       with TableListListItem {
    
    /**
      * Indicates whether the actions panel is open in the TableList.
      *
      * @default false
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#actionsOpen)
      */
    /* CompleteClass */
    var actionsOpen: Boolean = js.native
    
    /**
      * A nested 2-dimensional collection of actions that could be triggered on the item.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#actionsSections)
      */
    /* CompleteClass */
    var actionsSections: Collection[Collection[ActionButton | ActionToggle]] = js.native
    
    /**
      * The Error object returned if an error occurred.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#error)
      */
    /* CompleteClass */
    override val error: Error = js.native
    
    /**
      * When `true`, hides the layer from the TableList instance.
      *
      * @default false
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#hidden)
      */
    /* CompleteClass */
    var hidden: Boolean = js.native
    
    /**
      * The layer associated with the triggered action.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#layer)
      */
    /* CompleteClass */
    var layer: Layer = js.native
    
    /**
      * The title of the table.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#title)
      */
    /* CompleteClass */
    var title: String = js.native
  }
  
  type _To = TableListListItemConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsTableListListItemMod.foo` */
  override def _to: TableListListItemConstructor = ^
}
