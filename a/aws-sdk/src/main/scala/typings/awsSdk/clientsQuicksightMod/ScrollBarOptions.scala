package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollBarOptions extends StObject {
  
  /**
    * The visibility of the data zoom scroll bar.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
  
  /**
    * The visibility range for the data zoom scroll bar.
    */
  var VisibleRange: js.UndefOr[VisibleRangeOptions] = js.undefined
}
object ScrollBarOptions {
  
  inline def apply(): ScrollBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollBarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollBarOptions] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
    
    inline def setVisibleRange(value: VisibleRangeOptions): Self = StObject.set(x, "VisibleRange", value.asInstanceOf[js.Any])
    
    inline def setVisibleRangeUndefined: Self = StObject.set(x, "VisibleRange", js.undefined)
  }
}
