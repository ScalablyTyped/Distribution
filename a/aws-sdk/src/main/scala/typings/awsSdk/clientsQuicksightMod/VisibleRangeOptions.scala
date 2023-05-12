package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleRangeOptions extends StObject {
  
  /**
    * The percent range in the visible range.
    */
  var PercentRange: js.UndefOr[PercentVisibleRange] = js.undefined
}
object VisibleRangeOptions {
  
  inline def apply(): VisibleRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleRangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleRangeOptions] (val x: Self) extends AnyVal {
    
    inline def setPercentRange(value: PercentVisibleRange): Self = StObject.set(x, "PercentRange", value.asInstanceOf[js.Any])
    
    inline def setPercentRangeUndefined: Self = StObject.set(x, "PercentRange", js.undefined)
  }
}
