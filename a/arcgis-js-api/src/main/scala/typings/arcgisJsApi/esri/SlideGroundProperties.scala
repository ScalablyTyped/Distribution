package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideGroundProperties extends StObject {
  
  /**
    * Ground opacity
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#ground)
    */
  var opacity: js.UndefOr[Double] = js.undefined
}
object SlideGroundProperties {
  
  inline def apply(): SlideGroundProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideGroundProperties]
  }
  
  extension [Self <: SlideGroundProperties](x: Self) {
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
