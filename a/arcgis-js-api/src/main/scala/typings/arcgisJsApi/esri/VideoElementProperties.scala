package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoElementProperties
  extends StObject
     with MediaElementBaseProperties {
  
  /**
  		 * The video element to be added to the [media layer's source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html#video)
  		 */
  var video: js.UndefOr[String | Any] = js.undefined
}
object VideoElementProperties {
  
  inline def apply(): VideoElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoElementProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoElementProperties] (val x: Self) extends AnyVal {
    
    inline def setVideo(value: String | Any): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
