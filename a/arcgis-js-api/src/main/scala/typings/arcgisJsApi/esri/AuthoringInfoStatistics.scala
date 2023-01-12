package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthoringInfoStatistics extends StObject {
  
  /**
    * The maximum data value of the attribute represented by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#statistics)
    */
  var max: Double
  
  /**
    * The minimum data value of the attribute represented by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#statistics)
    */
  var min: Double
}
object AuthoringInfoStatistics {
  
  inline def apply(max: Double, min: Double): AuthoringInfoStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthoringInfoStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthoringInfoStatistics] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
