package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePointResultProperties
  extends StObject
     with BaseImageMeasureResultProperties {
  
  /**
    * The measured point on an image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePointResult.html#point)
    */
  var point: js.UndefOr[PointProperties] = js.undefined
}
object ImagePointResultProperties {
  
  inline def apply(): ImagePointResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePointResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagePointResultProperties] (val x: Self) extends AnyVal {
    
    inline def setPoint(value: PointProperties): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
  }
}
