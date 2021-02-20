package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerListViewModelProperties extends StObject {
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.UndefOr[LayerListListItemCreatedHandler] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object LayerListViewModelProperties {
  
  @scala.inline
  def apply(): LayerListViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerListViewModelProperties]
  }
  
  @scala.inline
  implicit class LayerListViewModelPropertiesMutableBuilder[Self <: LayerListViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = StObject.set(x, "listItemCreatedFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListItemCreatedFunctionUndefined: Self = StObject.set(x, "listItemCreatedFunction", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
