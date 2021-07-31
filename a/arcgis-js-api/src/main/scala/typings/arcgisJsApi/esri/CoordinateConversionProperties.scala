package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`expand-down`
import typings.arcgisJsApi.arcgisJsApiStrings.`expand-up`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.capture
import typings.arcgisJsApi.arcgisJsApiStrings.live
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateConversionProperties
  extends StObject
     with WidgetProperties
     with GoToProperties {
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Conversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html) that the widget is currently displaying.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#conversions)
    */
  var conversions: js.UndefOr[CollectionProperties[ConversionProperties]] = js.undefined
  
  /**
    * Describes the location of the coordinates currently displayed by the widget as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#currentLocation)
    */
  var currentLocation: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#formats)
    */
  var formats: js.UndefOr[CollectionProperties[FormatProperties]] = js.undefined
  
  /**
    * Describes the current mode of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#mode)
    */
  var mode: js.UndefOr[live | capture] = js.undefined
  
  /**
    * If this property is set to `true`, multiple conversions can be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#multipleConversions)
    */
  var multipleConversions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether the widget should expand up or down.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#orientation)
    */
  var orientation: js.UndefOr[auto | `expand-up` | `expand-down`] = js.undefined
  
  /**
    * The number of milliseconds of delay before conversion requests will be sent to the [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#requestDelay)
    */
  var requestDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#viewModel)
    */
  var viewModel: js.UndefOr[CoordinateConversionViewModelProperties] = js.undefined
}
object CoordinateConversionProperties {
  
  @scala.inline
  def apply(): CoordinateConversionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordinateConversionProperties]
  }
  
  @scala.inline
  implicit class CoordinateConversionPropertiesMutableBuilder[Self <: CoordinateConversionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversions(value: CollectionProperties[ConversionProperties]): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    @scala.inline
    def setConversionsVarargs(value: ConversionProperties*): Self = StObject.set(x, "conversions", js.Array(value :_*))
    
    @scala.inline
    def setCurrentLocation(value: PointProperties): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLocationUndefined: Self = StObject.set(x, "currentLocation", js.undefined)
    
    @scala.inline
    def setFormats(value: CollectionProperties[FormatProperties]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setFormatsVarargs(value: FormatProperties*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: live | capture): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMultipleConversions(value: Boolean): Self = StObject.set(x, "multipleConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleConversionsUndefined: Self = StObject.set(x, "multipleConversions", js.undefined)
    
    @scala.inline
    def setOrientation(value: auto | `expand-up` | `expand-down`): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setRequestDelay(value: Double): Self = StObject.set(x, "requestDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDelayUndefined: Self = StObject.set(x, "requestDelay", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: CoordinateConversionViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
