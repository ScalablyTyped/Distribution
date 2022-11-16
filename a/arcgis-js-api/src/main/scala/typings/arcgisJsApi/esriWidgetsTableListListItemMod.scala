package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ActionButton
import typings.arcgisJsApi.esri.ActionToggle
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Error
import typings.arcgisJsApi.esri.Layer
import typings.arcgisJsApi.esri.TableListListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsTableListListItemMod {
  
  @JSImport("esri/widgets/TableList/ListItem", JSImport.Namespace)
  @js.native
  open class ^ ()
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
      * Value is `true` when the [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#layer) is being published.
      *
      * @default false
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#publishing)
      */
    /* CompleteClass */
    override val publishing: Boolean = js.native
    
    /**
      * The title of the table.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#title)
      */
    /* CompleteClass */
    var title: String = js.native
  }
}
