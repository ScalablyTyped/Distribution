package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideThumbnail
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The URI pointing to the thumbnail image representing the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#thumbnail)
    */
  var url: js.UndefOr[String] = js.undefined
}
object SlideThumbnail {
  
  inline def apply(): SlideThumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideThumbnail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideThumbnail] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
