package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.PictureMarkerSymbolProper
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.anon.SimpleMarkerSymbolPropert
import typings.arcgisJsApi.arcgisJsApiStrings.`expand-down`
import typings.arcgisJsApi.arcgisJsApiStrings.`expand-up`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.capture
import typings.arcgisJsApi.arcgisJsApiStrings.live
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.session
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
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#formats)
    */
  var formats: js.UndefOr[CollectionProperties[FormatProperties]] = js.undefined
  
  /**
    * Indicates the heading level to use for the coordinate input and coordinate settings headings.
    *
    * @default 4
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#headingLevel)
    */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * This symbol is used to visualize the location currently described by the widget when `capture` mode is active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#locationSymbol)
    */
  var locationSymbol: js.UndefOr[SimpleMarkerSymbolPropert | PictureMarkerSymbolProper] = js.undefined
  
  /**
    * Describes the current mode of the widget.
    *
    * @default live
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#mode)
    */
  var mode: js.UndefOr[live | capture] = js.undefined
  
  /**
    * If this property is set to `true`, multiple conversions can be displayed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#multipleConversions)
    */
  var multipleConversions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether the widget should expand up or down.
    *
    * @default auto
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#orientation)
    */
  var orientation: js.UndefOr[auto | `expand-up` | `expand-down`] = js.undefined
  
  /**
    * If this property is set to `true`, sessionStorage or localStorage (depending on [storageType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#storageType)) will be used to hydrate and persist the CoordinateConversion widget's state.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#storageEnabled)
    */
  var storageEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property determines whether sessionStorage or localStorage will be used to store widget state.
    *
    * @default "session"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#storageType)
    */
  var storageType: js.UndefOr[session | local] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#viewModel)
    */
  var viewModel: js.UndefOr[CoordinateConversionViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html#visibleElements)
    */
  var visibleElements: js.UndefOr[CoordinateConversionVisibleElements] = js.undefined
}
object CoordinateConversionProperties {
  
  inline def apply(): CoordinateConversionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordinateConversionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoordinateConversionProperties] (val x: Self) extends AnyVal {
    
    inline def setConversions(value: CollectionProperties[ConversionProperties]): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    inline def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    inline def setConversionsVarargs(value: ConversionProperties*): Self = StObject.set(x, "conversions", js.Array(value*))
    
    inline def setFormats(value: CollectionProperties[FormatProperties]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: FormatProperties*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setLocationSymbol(value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper): Self = StObject.set(x, "locationSymbol", value.asInstanceOf[js.Any])
    
    inline def setLocationSymbolUndefined: Self = StObject.set(x, "locationSymbol", js.undefined)
    
    inline def setMode(value: live | capture): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultipleConversions(value: Boolean): Self = StObject.set(x, "multipleConversions", value.asInstanceOf[js.Any])
    
    inline def setMultipleConversionsUndefined: Self = StObject.set(x, "multipleConversions", js.undefined)
    
    inline def setOrientation(value: auto | `expand-up` | `expand-down`): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setStorageEnabled(value: Boolean): Self = StObject.set(x, "storageEnabled", value.asInstanceOf[js.Any])
    
    inline def setStorageEnabledUndefined: Self = StObject.set(x, "storageEnabled", js.undefined)
    
    inline def setStorageType(value: session | local): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: CoordinateConversionViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: CoordinateConversionVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
