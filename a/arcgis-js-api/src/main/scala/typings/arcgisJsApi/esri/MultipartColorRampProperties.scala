package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartColorRampProperties
  extends StObject
     with ColorRampProperties {
  
  /**
  		 * Define an array of algorithmic color ramps used to generate the multi part ramp.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-MultipartColorRamp.html#colorRamps)
  		 */
  var colorRamps: js.UndefOr[js.Array[AlgorithmicColorRampProperties]] = js.undefined
}
object MultipartColorRampProperties {
  
  inline def apply(): MultipartColorRampProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartColorRampProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultipartColorRampProperties] (val x: Self) extends AnyVal {
    
    inline def setColorRamps(value: js.Array[AlgorithmicColorRampProperties]): Self = StObject.set(x, "colorRamps", value.asInstanceOf[js.Any])
    
    inline def setColorRampsUndefined: Self = StObject.set(x, "colorRamps", js.undefined)
    
    inline def setColorRampsVarargs(value: AlgorithmicColorRampProperties*): Self = StObject.set(x, "colorRamps", js.Array(value*))
  }
}
