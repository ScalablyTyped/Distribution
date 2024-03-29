package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectJog
  extends StObject
     with CIMGeometricEffect {
  
  /**
  		 * The angle of the job in the line which is measured in degrees.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectJog)
  		 */
  var angle: Double
  
  /**
  		 * The length of the segment that forms the jog in the line.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectJog)
  		 */
  var length: Double
  
  /**
  		 * The location of the center of the jog, as a percentage measured from the start of the input geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectJog)
  		 */
  var position: Double
  
  /**
  		 * The primitive name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectJog)
  		 */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectJog
}
object CIMGeometricEffectJog {
  
  inline def apply(angle: Double, length: Double, position: Double): CIMGeometricEffectJog = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectJog")
    __obj.asInstanceOf[CIMGeometricEffectJog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectJog] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectJog): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
