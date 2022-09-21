package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeatherProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Indicates the heading level to use for the title of the widget.
    *
    * @default 4
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#headingLevel)
    */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#viewModel)
    */
  var viewModel: js.UndefOr[WeatherViewModelProperties] = js.undefined
  
  /**
    * This property provides the ability to display or hide the individual elements of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#visibleElements)
    */
  var visibleElements: js.UndefOr[WeatherVisibleElements] = js.undefined
}
object WeatherProperties {
  
  inline def apply(): WeatherProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeatherProperties]
  }
  
  extension [Self <: WeatherProperties](x: Self) {
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: WeatherViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: WeatherVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
