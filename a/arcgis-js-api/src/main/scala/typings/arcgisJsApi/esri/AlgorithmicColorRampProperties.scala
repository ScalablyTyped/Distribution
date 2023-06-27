package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`cie-lab`
import typings.arcgisJsApi.arcgisJsApiStrings.`lab-lch`
import typings.arcgisJsApi.arcgisJsApiStrings.hsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmicColorRampProperties
  extends StObject
     with ColorRampProperties {
  
  /**
  		 * The algorithm used to generate the colors between the `fromColor` and `toColor`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html#algorithm)
  		 */
  var algorithm: js.UndefOr[`cie-lab` | `lab-lch` | hsv] = js.undefined
  
  /**
  		 * The first color in the color ramp.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html#fromColor)
  		 */
  var fromColor: js.UndefOr[Color_] = js.undefined
  
  /**
  		 * The last color in the color ramp.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html#toColor)
  		 */
  var toColor: js.UndefOr[Color_] = js.undefined
}
object AlgorithmicColorRampProperties {
  
  inline def apply(): AlgorithmicColorRampProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmicColorRampProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlgorithmicColorRampProperties] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: `cie-lab` | `lab-lch` | hsv): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setFromColor(value: Color_): Self = StObject.set(x, "fromColor", value.asInstanceOf[js.Any])
    
    inline def setFromColorUndefined: Self = StObject.set(x, "fromColor", js.undefined)
    
    inline def setToColor(value: Color_): Self = StObject.set(x, "toColor", value.asInstanceOf[js.Any])
    
    inline def setToColorUndefined: Self = StObject.set(x, "toColor", js.undefined)
  }
}
