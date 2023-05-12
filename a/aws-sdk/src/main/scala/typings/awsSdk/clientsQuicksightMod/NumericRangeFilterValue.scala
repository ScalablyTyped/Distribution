package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericRangeFilterValue extends StObject {
  
  /**
    * The parameter that is used in the numeric range.
    */
  var Parameter: js.UndefOr[ParameterName] = js.undefined
  
  /**
    * The static value of the numeric range filter.
    */
  var StaticValue: js.UndefOr[Double] = js.undefined
}
object NumericRangeFilterValue {
  
  inline def apply(): NumericRangeFilterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericRangeFilterValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericRangeFilterValue] (val x: Self) extends AnyVal {
    
    inline def setParameter(value: ParameterName): Self = StObject.set(x, "Parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "Parameter", js.undefined)
    
    inline def setStaticValue(value: Double): Self = StObject.set(x, "StaticValue", value.asInstanceOf[js.Any])
    
    inline def setStaticValueUndefined: Self = StObject.set(x, "StaticValue", js.undefined)
  }
}
