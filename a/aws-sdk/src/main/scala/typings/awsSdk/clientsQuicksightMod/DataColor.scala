package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataColor extends StObject {
  
  /**
    * The color that is applied to the data value.
    */
  var Color: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The data value that the color is applied to.
    */
  var DataValue: js.UndefOr[Double] = js.undefined
}
object DataColor {
  
  inline def apply(): DataColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setDataValue(value: Double): Self = StObject.set(x, "DataValue", value.asInstanceOf[js.Any])
    
    inline def setDataValueUndefined: Self = StObject.set(x, "DataValue", js.undefined)
  }
}
