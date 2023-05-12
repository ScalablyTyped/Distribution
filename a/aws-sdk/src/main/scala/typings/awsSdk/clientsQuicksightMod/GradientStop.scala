package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientStop extends StObject {
  
  /**
    * Determines the color.
    */
  var Color: js.UndefOr[HexColor] = js.undefined
  
  /**
    * Determines the data value.
    */
  var DataValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines gradient offset value.
    */
  var GradientOffset: Double
}
object GradientStop {
  
  inline def apply(GradientOffset: Double): GradientStop = {
    val __obj = js.Dynamic.literal(GradientOffset = GradientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradientStop] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setDataValue(value: Double): Self = StObject.set(x, "DataValue", value.asInstanceOf[js.Any])
    
    inline def setDataValueUndefined: Self = StObject.set(x, "DataValue", js.undefined)
    
    inline def setGradientOffset(value: Double): Self = StObject.set(x, "GradientOffset", value.asInstanceOf[js.Any])
  }
}
