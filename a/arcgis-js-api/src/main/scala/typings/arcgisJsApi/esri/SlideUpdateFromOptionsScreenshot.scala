package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideUpdateFromOptionsScreenshot extends StObject {
  
  /**
    * The image format.
    *
    * @default png
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * The image height.
    *
    * @default 75
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The image quality (due to compression).
    *
    * @default 80
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * The image width.
    *
    * @default 120
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SlideUpdateFromOptionsScreenshot {
  
  inline def apply(): SlideUpdateFromOptionsScreenshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideUpdateFromOptionsScreenshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideUpdateFromOptionsScreenshot] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
