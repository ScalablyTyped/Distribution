package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisDataOptions extends StObject {
  
  /**
    * The options for an axis with a date field.
    */
  var DateAxisOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateAxisOptions] = js.undefined
  
  /**
    * The options for an axis with a numeric field.
    */
  var NumericAxisOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumericAxisOptions] = js.undefined
}
object AxisDataOptions {
  
  inline def apply(): AxisDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisDataOptions] (val x: Self) extends AnyVal {
    
    inline def setDateAxisOptions(value: DateAxisOptions): Self = StObject.set(x, "DateAxisOptions", value.asInstanceOf[js.Any])
    
    inline def setDateAxisOptionsUndefined: Self = StObject.set(x, "DateAxisOptions", js.undefined)
    
    inline def setNumericAxisOptions(value: NumericAxisOptions): Self = StObject.set(x, "NumericAxisOptions", value.asInstanceOf[js.Any])
    
    inline def setNumericAxisOptionsUndefined: Self = StObject.set(x, "NumericAxisOptions", js.undefined)
  }
}
