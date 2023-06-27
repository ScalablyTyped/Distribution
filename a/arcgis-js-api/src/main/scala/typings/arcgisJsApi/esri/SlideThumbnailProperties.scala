package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideThumbnailProperties extends StObject {
  
  /**
  		 * The URI pointing to the thumbnail image representing the slide.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#thumbnail)
  		 */
  var url: js.UndefOr[String] = js.undefined
}
object SlideThumbnailProperties {
  
  inline def apply(): SlideThumbnailProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideThumbnailProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideThumbnailProperties] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
