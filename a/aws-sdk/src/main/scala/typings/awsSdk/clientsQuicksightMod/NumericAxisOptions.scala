package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericAxisOptions extends StObject {
  
  /**
    * The range setup of a numeric axis.
    */
  var Range: js.UndefOr[AxisDisplayRange] = js.undefined
  
  /**
    * The scale setup of a numeric axis.
    */
  var Scale: js.UndefOr[AxisScale] = js.undefined
}
object NumericAxisOptions {
  
  inline def apply(): NumericAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericAxisOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericAxisOptions] (val x: Self) extends AnyVal {
    
    inline def setRange(value: AxisDisplayRange): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "Range", js.undefined)
    
    inline def setScale(value: AxisScale): Self = StObject.set(x, "Scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "Scale", js.undefined)
  }
}
