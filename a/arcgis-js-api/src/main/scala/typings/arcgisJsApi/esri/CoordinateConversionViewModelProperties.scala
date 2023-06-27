package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.PictureMarkerSymbolProper
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.anon.SimpleMarkerSymbolPropert
import typings.arcgisJsApi.arcgisJsApiStrings.capture
import typings.arcgisJsApi.arcgisJsApiStrings.live
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateConversionViewModelProperties
  extends StObject
     with GoToProperties {
  
  /**
  		 * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Conversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html) that the widget is currently displaying.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#conversions)
  		 */
  var conversions: js.UndefOr[CollectionProperties[ConversionProperties]] = js.undefined
  
  /**
  		 * Describes the location of the coordinates currently displayed by the widget as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#currentLocation)
  		 */
  var currentLocation: js.UndefOr[PointProperties] = js.undefined
  
  /**
  		 * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#formats)
  		 */
  var formats: js.UndefOr[CollectionProperties[FormatProperties]] = js.undefined
  
  /**
  		 * This symbol is used to visualize the location currently described by the widget when `capture` mode is active.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#locationSymbol)
  		 */
  var locationSymbol: js.UndefOr[SimpleMarkerSymbolPropert | PictureMarkerSymbolProper] = js.undefined
  
  /**
  		 * Describes the current mode of the widget.
  		 *
  		 * @default live
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#mode)
  		 */
  var mode: js.UndefOr[live | capture] = js.undefined
  
  /**
  		 * If this property is set to `true`, sessionStorage or localStorage (depending on [storageType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#storageType)) will be used to hydrate and persist the CoordinateConversion widget's state.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#storageEnabled)
  		 */
  var storageEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * This property determines whether sessionStorage or localStorage will be used to store widget state.
  		 *
  		 * @default "session"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#storageType)
  		 */
  var storageType: js.UndefOr[session | local] = js.undefined
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object CoordinateConversionViewModelProperties {
  
  inline def apply(): CoordinateConversionViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordinateConversionViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoordinateConversionViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setConversions(value: CollectionProperties[ConversionProperties]): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    inline def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    inline def setConversionsVarargs(value: ConversionProperties*): Self = StObject.set(x, "conversions", js.Array(value*))
    
    inline def setCurrentLocation(value: PointProperties): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    inline def setCurrentLocationUndefined: Self = StObject.set(x, "currentLocation", js.undefined)
    
    inline def setFormats(value: CollectionProperties[FormatProperties]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: FormatProperties*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setLocationSymbol(value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper): Self = StObject.set(x, "locationSymbol", value.asInstanceOf[js.Any])
    
    inline def setLocationSymbolUndefined: Self = StObject.set(x, "locationSymbol", js.undefined)
    
    inline def setMode(value: live | capture): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setStorageEnabled(value: Boolean): Self = StObject.set(x, "storageEnabled", value.asInstanceOf[js.Any])
    
    inline def setStorageEnabledUndefined: Self = StObject.set(x, "storageEnabled", js.undefined)
    
    inline def setStorageType(value: session | local): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
