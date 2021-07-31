package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasemapLayerListViewModelProperties extends StObject {
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#baseListItemCreatedFunction)
    */
  var baseListItemCreatedFunction: js.UndefOr[ListItemCreatedHandler] = js.undefined
  
  /**
    * The current basemap's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#basemapTitle)
    */
  var basemapTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing reference layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#referenceListItemCreatedFunction)
    */
  var referenceListItemCreatedFunction: js.UndefOr[ListItemCreatedHandler] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object BasemapLayerListViewModelProperties {
  
  @scala.inline
  def apply(): BasemapLayerListViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapLayerListViewModelProperties]
  }
  
  @scala.inline
  implicit class BasemapLayerListViewModelPropertiesMutableBuilder[Self <: BasemapLayerListViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = StObject.set(x, "baseListItemCreatedFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBaseListItemCreatedFunctionUndefined: Self = StObject.set(x, "baseListItemCreatedFunction", js.undefined)
    
    @scala.inline
    def setBasemapTitle(value: String): Self = StObject.set(x, "basemapTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapTitleUndefined: Self = StObject.set(x, "basemapTitle", js.undefined)
    
    @scala.inline
    def setReferenceListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = StObject.set(x, "referenceListItemCreatedFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReferenceListItemCreatedFunctionUndefined: Self = StObject.set(x, "referenceListItemCreatedFunction", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
