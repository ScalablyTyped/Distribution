package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.VideoElementProperties & {  type :'video'} */
trait VideoElementPropertiestyp extends StObject {
  
  /**
    * The geographic location of the image or video element to be placed on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
    */
  var georeference: js.UndefOr[
    ExtentAndRotationGeorefer | CornersGeoreferenceProper | ControlPointsGeoreference
  ] = js.undefined
  
  /**
    * The opacity of the element.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  var `type`: video
  
  /**
    * The video element to be added to the [media layer's source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html#video)
    */
  var video: js.UndefOr[String | Any] = js.undefined
}
object VideoElementPropertiestyp {
  
  inline def apply(): VideoElementPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[VideoElementPropertiestyp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoElementPropertiestyp] (val x: Self) extends AnyVal {
    
    inline def setGeoreference(value: ExtentAndRotationGeorefer | CornersGeoreferenceProper | ControlPointsGeoreference): Self = StObject.set(x, "georeference", value.asInstanceOf[js.Any])
    
    inline def setGeoreferenceUndefined: Self = StObject.set(x, "georeference", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: String | Any): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
