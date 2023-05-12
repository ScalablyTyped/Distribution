package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecondaryValueOptions extends StObject {
  
  /**
    * Determines the visibility of the secondary value.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object SecondaryValueOptions {
  
  inline def apply(): SecondaryValueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecondaryValueOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecondaryValueOptions] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
