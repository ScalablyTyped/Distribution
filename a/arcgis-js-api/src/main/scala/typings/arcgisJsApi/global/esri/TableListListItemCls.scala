package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.TableListListItem")
@js.native
class TableListListItemCls ()
  extends StObject
     with typings.arcgisJsApi.esri.TableListListItem {
  
  /**
    * Indicates whether the actions panel is open in the TableList.
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
  var actionsSections: typings.arcgisJsApi.esri.Collection[
    typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.ActionButton | typings.arcgisJsApi.esri.ActionToggle]
  ] = js.native
  
  /**
    * The Error object returned if an error occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#error)
    */
  /* CompleteClass */
  override val error: typings.arcgisJsApi.esri.Error = js.native
  
  /**
    * The layer associated with the triggered action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#layer)
    */
  /* CompleteClass */
  var layer: typings.arcgisJsApi.esri.Layer = js.native
  
  /**
    * The title of the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html#title)
    */
  /* CompleteClass */
  var title: String = js.native
}
