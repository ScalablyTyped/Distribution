package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideUpdateFromOptions extends StObject {
  
  /**
    * Screenshot options to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    */
  var screenshot: SlideUpdateFromOptionsScreenshot
}
object SlideUpdateFromOptions {
  
  inline def apply(screenshot: SlideUpdateFromOptionsScreenshot): SlideUpdateFromOptions = {
    val __obj = js.Dynamic.literal(screenshot = screenshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideUpdateFromOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideUpdateFromOptions] (val x: Self) extends AnyVal {
    
    inline def setScreenshot(value: SlideUpdateFromOptionsScreenshot): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
  }
}
