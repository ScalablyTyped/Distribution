package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresentationProperties extends StObject {
  
  /**
    * A collection of [slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html) that bookmark [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), visible layers, and other settings previously defined in a [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides)
    */
  var slides: js.UndefOr[CollectionProperties[SlideProperties]] = js.undefined
}
object PresentationProperties {
  
  inline def apply(): PresentationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresentationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PresentationProperties] (val x: Self) extends AnyVal {
    
    inline def setSlides(value: CollectionProperties[SlideProperties]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
    
    inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
    
    inline def setSlidesVarargs(value: SlideProperties*): Self = StObject.set(x, "slides", js.Array(value*))
  }
}
