package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRangeFilterValue extends StObject {
  
  /**
    * The parameter type input value.
    */
  var Parameter: js.UndefOr[ParameterName] = js.undefined
  
  /**
    * The rolling date input value.
    */
  var RollingDate: js.UndefOr[RollingDateConfiguration] = js.undefined
  
  /**
    * The static input value.
    */
  var StaticValue: js.UndefOr[js.Date] = js.undefined
}
object TimeRangeFilterValue {
  
  inline def apply(): TimeRangeFilterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRangeFilterValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeRangeFilterValue] (val x: Self) extends AnyVal {
    
    inline def setParameter(value: ParameterName): Self = StObject.set(x, "Parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "Parameter", js.undefined)
    
    inline def setRollingDate(value: RollingDateConfiguration): Self = StObject.set(x, "RollingDate", value.asInstanceOf[js.Any])
    
    inline def setRollingDateUndefined: Self = StObject.set(x, "RollingDate", js.undefined)
    
    inline def setStaticValue(value: js.Date): Self = StObject.set(x, "StaticValue", value.asInstanceOf[js.Any])
    
    inline def setStaticValueUndefined: Self = StObject.set(x, "StaticValue", js.undefined)
  }
}
