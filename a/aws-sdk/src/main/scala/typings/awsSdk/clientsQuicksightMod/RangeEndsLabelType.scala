package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeEndsLabelType extends StObject {
  
  /**
    * The visibility of the range ends label.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object RangeEndsLabelType {
  
  inline def apply(): RangeEndsLabelType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeEndsLabelType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeEndsLabelType] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
