package typings.arcgisJsApi.esri

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorAndIntensity extends StObject {
  
  /**
  		 * RGB color with values between 0 and 1.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
  		 */
  var color: ArrayLike[Double]
  
  /**
  		 * Scalar intensity value by which the color should be scaled for compositing.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
  		 */
  var intensity: Double
}
object ColorAndIntensity {
  
  inline def apply(color: ArrayLike[Double], intensity: Double): ColorAndIntensity = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorAndIntensity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorAndIntensity] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ArrayLike[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
  }
}
