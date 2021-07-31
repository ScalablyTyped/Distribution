package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasemapToggleProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The next basemap for toggling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#nextBasemap)
    */
  var nextBasemap: js.UndefOr[BasemapProperties | String] = js.undefined
  
  /**
    * Indicates if the title of the basemap is visible in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#titleVisible)
    */
  var titleVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#viewModel)
    */
  var viewModel: js.UndefOr[BasemapToggleViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#visibleElements)
    */
  var visibleElements: js.UndefOr[BasemapToggleVisibleElements] = js.undefined
}
object BasemapToggleProperties {
  
  @scala.inline
  def apply(): BasemapToggleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapToggleProperties]
  }
  
  @scala.inline
  implicit class BasemapTogglePropertiesMutableBuilder[Self <: BasemapToggleProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextBasemap(value: BasemapProperties | String): Self = StObject.set(x, "nextBasemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextBasemapUndefined: Self = StObject.set(x, "nextBasemap", js.undefined)
    
    @scala.inline
    def setTitleVisible(value: Boolean): Self = StObject.set(x, "titleVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleVisibleUndefined: Self = StObject.set(x, "titleVisible", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: BasemapToggleViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: BasemapToggleVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
