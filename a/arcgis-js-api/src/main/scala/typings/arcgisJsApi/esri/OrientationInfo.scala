package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrientationInfo extends StObject {
  
  /**
  		 * The identifer for the orientation info.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html#OrientationInfo)
  		 */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether the image displays mirrored.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html#OrientationInfo)
  		 */
  var mirrored: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The rotation value for the attached image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html#OrientationInfo)
  		 */
  var rotation: js.UndefOr[Double] = js.undefined
}
object OrientationInfo {
  
  inline def apply(): OrientationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrientationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrientationInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMirrored(value: Boolean): Self = StObject.set(x, "mirrored", value.asInstanceOf[js.Any])
    
    inline def setMirroredUndefined: Self = StObject.set(x, "mirrored", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}
