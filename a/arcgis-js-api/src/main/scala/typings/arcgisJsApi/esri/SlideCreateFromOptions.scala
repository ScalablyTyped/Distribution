package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideCreateFromOptions extends StObject {
  
  /**
    * Screenshot options to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    */
  var screenshot: js.UndefOr[SlideCreateFromOptionsScreenshot] = js.undefined
}
object SlideCreateFromOptions {
  
  inline def apply(): SlideCreateFromOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideCreateFromOptions]
  }
  
  extension [Self <: SlideCreateFromOptions](x: Self) {
    
    inline def setScreenshot(value: SlideCreateFromOptionsScreenshot): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
  }
}
