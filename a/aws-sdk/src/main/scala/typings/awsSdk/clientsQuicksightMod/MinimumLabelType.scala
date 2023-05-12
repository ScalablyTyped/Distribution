package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumLabelType extends StObject {
  
  /**
    * The visibility of the minimum label.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object MinimumLabelType {
  
  inline def apply(): MinimumLabelType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumLabelType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinimumLabelType] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
