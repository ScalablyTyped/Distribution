package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisDisplayMinMaxRange extends StObject {
  
  /**
    * The maximum setup for an axis display range.
    */
  var Maximum: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum setup for an axis display range.
    */
  var Minimum: js.UndefOr[Double] = js.undefined
}
object AxisDisplayMinMaxRange {
  
  inline def apply(): AxisDisplayMinMaxRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisDisplayMinMaxRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisDisplayMinMaxRange] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "Maximum", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "Minimum", js.undefined)
  }
}
