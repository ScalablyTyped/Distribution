package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerListViewModelProperties extends StObject {
  
  /**
    * Whether to provide an indication if a layer is being published in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#checkPublishStatusEnabled)
    */
  var checkPublishStatusEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.UndefOr[LayerListListItemCreatedHandler] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object LayerListViewModelProperties {
  
  inline def apply(): LayerListViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerListViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerListViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setCheckPublishStatusEnabled(value: Boolean): Self = StObject.set(x, "checkPublishStatusEnabled", value.asInstanceOf[js.Any])
    
    inline def setCheckPublishStatusEnabledUndefined: Self = StObject.set(x, "checkPublishStatusEnabled", js.undefined)
    
    inline def setListItemCreatedFunction(value: /* event */ Any => scala.Unit): Self = StObject.set(x, "listItemCreatedFunction", js.Any.fromFunction1(value))
    
    inline def setListItemCreatedFunctionUndefined: Self = StObject.set(x, "listItemCreatedFunction", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
