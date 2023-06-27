package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePixelLocationParametersProperties extends StObject {
  
  /**
  		 * An array of [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) that defines pixel locations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationParameters.html#point)
  		 */
  var point: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
  		 * The rasterId of a raster catalog in the image service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationParameters.html#rasterId)
  		 */
  var rasterId: js.UndefOr[Double] = js.undefined
}
object ImagePixelLocationParametersProperties {
  
  inline def apply(): ImagePixelLocationParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePixelLocationParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagePixelLocationParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setPoint(value: js.Array[PointProperties]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPointVarargs(value: PointProperties*): Self = StObject.set(x, "point", js.Array(value*))
    
    inline def setRasterId(value: Double): Self = StObject.set(x, "rasterId", value.asInstanceOf[js.Any])
    
    inline def setRasterIdUndefined: Self = StObject.set(x, "rasterId", js.undefined)
  }
}
