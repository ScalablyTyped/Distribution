package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`direct-line`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.area
import typings.arcgisJsApi.arcgisJsApiStrings.ares
import typings.arcgisJsApi.arcgisJsApiStrings.distance
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasurementProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Specifies the current measurement tool to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#activeTool)
    */
  var activeTool: js.UndefOr[area | distance | `direct-line`] = js.undefined
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#areaUnit)
    */
  var areaUnit: js.UndefOr[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.undefined
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#linearUnit)
    */
  var linearUnit: js.UndefOr[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#viewModel)
    */
  var viewModel: js.UndefOr[MeasurementViewModelProperties] = js.undefined
}
object MeasurementProperties {
  
  @scala.inline
  def apply(): MeasurementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasurementProperties]
  }
  
  @scala.inline
  implicit class MeasurementPropertiesMutableBuilder[Self <: MeasurementProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTool(value: area | distance | `direct-line`): Self = StObject.set(x, "activeTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveToolUndefined: Self = StObject.set(x, "activeTool", js.undefined)
    
    @scala.inline
    def setAreaUnit(
      value: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
    ): Self = StObject.set(x, "areaUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUnitUndefined: Self = StObject.set(x, "areaUnit", js.undefined)
    
    @scala.inline
    def setLinearUnit(
      value: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
    ): Self = StObject.set(x, "linearUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearUnitUndefined: Self = StObject.set(x, "linearUnit", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: MeasurementViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
