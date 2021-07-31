package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.png
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewTakeScreenshotOptions
  extends StObject
     with Object {
  
  /**
    * Specifies whether to take a screenshot of a specific area of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var area: js.UndefOr[MapViewTakeScreenshotOptionsArea] = js.undefined
  
  /**
    * The format of the resulting encoded data url.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var format: js.UndefOr[jpg | png] = js.undefined
  
  /**
    * The height of the screenshot (defaults to the area height).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to ignore the background color set in the [initial view properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#initialViewProperties) of the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var ignoreBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether view padding should be ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var ignorePadding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When used, only the visible layers in this list will be included in the output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  
  /**
    * The quality (0 to 100) of the encoded image when encoding as `jpg`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the screenshot (defaults to the area width).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object MapViewTakeScreenshotOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MapViewTakeScreenshotOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MapViewTakeScreenshotOptions]
  }
  
  @scala.inline
  implicit class MapViewTakeScreenshotOptionsMutableBuilder[Self <: MapViewTakeScreenshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: MapViewTakeScreenshotOptionsArea): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setFormat(value: jpg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIgnoreBackground(value: Boolean): Self = StObject.set(x, "ignoreBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBackgroundUndefined: Self = StObject.set(x, "ignoreBackground", js.undefined)
    
    @scala.inline
    def setIgnorePadding(value: Boolean): Self = StObject.set(x, "ignorePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePaddingUndefined: Self = StObject.set(x, "ignorePadding", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
