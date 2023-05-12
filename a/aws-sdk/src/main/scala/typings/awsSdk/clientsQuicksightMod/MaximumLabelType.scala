package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumLabelType extends StObject {
  
  /**
    * The visibility of the maximum label.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object MaximumLabelType {
  
  inline def apply(): MaximumLabelType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumLabelType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaximumLabelType] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
