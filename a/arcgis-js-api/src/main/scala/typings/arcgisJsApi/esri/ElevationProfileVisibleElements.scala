package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileVisibleElements extends StObject {
  
  /**
    * When set to `false`, the chart is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#VisibleElements)
    */
  var chart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false` the button used to clear the current elevation profile is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#VisibleElements)
    */
  var clearButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the legend (which includes statistics) is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#VisibleElements)
    */
  var legend: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the button used to select a path is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#VisibleElements)
    */
  var selectButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the button used to open the settings popup is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#VisibleElements)
    */
  var settingsButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the button used to start drawing/sketchinng is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#VisibleElements)
    */
  var sketchButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the element used to toggle uniform chart scaling on or off is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#VisibleElements)
    */
  var uniformChartScalingToggle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the dropdown used to select the units is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#VisibleElements)
    */
  var unitSelector: js.UndefOr[Boolean] = js.undefined
}
object ElevationProfileVisibleElements {
  
  inline def apply(): ElevationProfileVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElevationProfileVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationProfileVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Boolean): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
    
    inline def setLegend(value: Boolean): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setSelectButton(value: Boolean): Self = StObject.set(x, "selectButton", value.asInstanceOf[js.Any])
    
    inline def setSelectButtonUndefined: Self = StObject.set(x, "selectButton", js.undefined)
    
    inline def setSettingsButton(value: Boolean): Self = StObject.set(x, "settingsButton", value.asInstanceOf[js.Any])
    
    inline def setSettingsButtonUndefined: Self = StObject.set(x, "settingsButton", js.undefined)
    
    inline def setSketchButton(value: Boolean): Self = StObject.set(x, "sketchButton", value.asInstanceOf[js.Any])
    
    inline def setSketchButtonUndefined: Self = StObject.set(x, "sketchButton", js.undefined)
    
    inline def setUniformChartScalingToggle(value: Boolean): Self = StObject.set(x, "uniformChartScalingToggle", value.asInstanceOf[js.Any])
    
    inline def setUniformChartScalingToggleUndefined: Self = StObject.set(x, "uniformChartScalingToggle", js.undefined)
    
    inline def setUnitSelector(value: Boolean): Self = StObject.set(x, "unitSelector", value.asInstanceOf[js.Any])
    
    inline def setUnitSelectorUndefined: Self = StObject.set(x, "unitSelector", js.undefined)
  }
}
