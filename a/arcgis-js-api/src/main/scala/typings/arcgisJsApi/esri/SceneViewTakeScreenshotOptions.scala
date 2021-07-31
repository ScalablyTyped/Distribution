package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.png
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewTakeScreenshotOptions
  extends StObject
     with Object {
  
  /**
    * Specifies whether to take a screenshot of a specific area of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var area: js.UndefOr[SceneViewTakeScreenshotOptionsArea] = js.undefined
  
  /**
    * The format of the resulting encoded data url.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var format: js.UndefOr[jpg | png] = js.undefined
  
  /**
    * The height of the screenshot (defaults to the area height).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether view padding should be ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var ignorePadding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The quality (0 to 100) of the encoded image when format is `jpg`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the screenshot (defaults to the area width).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SceneViewTakeScreenshotOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewTakeScreenshotOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewTakeScreenshotOptions]
  }
  
  @scala.inline
  implicit class SceneViewTakeScreenshotOptionsMutableBuilder[Self <: SceneViewTakeScreenshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: SceneViewTakeScreenshotOptionsArea): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
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
    def setIgnorePadding(value: Boolean): Self = StObject.set(x, "ignorePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePaddingUndefined: Self = StObject.set(x, "ignorePadding", js.undefined)
    
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
