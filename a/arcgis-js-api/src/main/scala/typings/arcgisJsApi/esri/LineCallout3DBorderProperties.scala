package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineCallout3DBorderProperties extends StObject {
  
  /**
    * The color of the callout line border.
    *
    * @default white
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object LineCallout3DBorderProperties {
  
  inline def apply(): LineCallout3DBorderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineCallout3DBorderProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineCallout3DBorderProperties] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
  }
}
