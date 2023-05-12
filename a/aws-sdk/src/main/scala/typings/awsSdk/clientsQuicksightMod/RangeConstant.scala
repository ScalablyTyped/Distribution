package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeConstant extends StObject {
  
  /**
    * The maximum value for a range constant.
    */
  var Maximum: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The minimum value for a range constant.
    */
  var Minimum: js.UndefOr[LimitedString] = js.undefined
}
object RangeConstant {
  
  inline def apply(): RangeConstant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeConstant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeConstant] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: LimitedString): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "Maximum", js.undefined)
    
    inline def setMinimum(value: LimitedString): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "Minimum", js.undefined)
  }
}
