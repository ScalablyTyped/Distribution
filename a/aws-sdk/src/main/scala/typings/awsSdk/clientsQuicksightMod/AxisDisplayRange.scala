package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisDisplayRange extends StObject {
  
  /**
    * The data-driven setup of an axis display range.
    */
  var DataDriven: js.UndefOr[AxisDisplayDataDrivenRange] = js.undefined
  
  /**
    * The minimum and maximum setup of an axis display range.
    */
  var MinMax: js.UndefOr[AxisDisplayMinMaxRange] = js.undefined
}
object AxisDisplayRange {
  
  inline def apply(): AxisDisplayRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisDisplayRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisDisplayRange] (val x: Self) extends AnyVal {
    
    inline def setDataDriven(value: AxisDisplayDataDrivenRange): Self = StObject.set(x, "DataDriven", value.asInstanceOf[js.Any])
    
    inline def setDataDrivenUndefined: Self = StObject.set(x, "DataDriven", js.undefined)
    
    inline def setMinMax(value: AxisDisplayMinMaxRange): Self = StObject.set(x, "MinMax", value.asInstanceOf[js.Any])
    
    inline def setMinMaxUndefined: Self = StObject.set(x, "MinMax", js.undefined)
  }
}
