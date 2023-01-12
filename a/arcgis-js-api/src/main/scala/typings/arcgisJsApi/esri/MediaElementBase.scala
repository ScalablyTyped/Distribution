package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaElementBase extends StObject {
  
  /**
    * The geographic location of the image or video element to be placed on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
    */
  var georeference: ExtentAndRotationGeoreference | CornersGeoreference | ControlPointsGeoreference
  
  /**
    * The opacity of the element.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
    */
  var opacity: Double
}
object MediaElementBase {
  
  inline def apply(
    georeference: ExtentAndRotationGeoreference | CornersGeoreference | ControlPointsGeoreference,
    opacity: Double
  ): MediaElementBase = {
    val __obj = js.Dynamic.literal(georeference = georeference.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaElementBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaElementBase] (val x: Self) extends AnyVal {
    
    inline def setGeoreference(value: ExtentAndRotationGeoreference | CornersGeoreference | ControlPointsGeoreference): Self = StObject.set(x, "georeference", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
