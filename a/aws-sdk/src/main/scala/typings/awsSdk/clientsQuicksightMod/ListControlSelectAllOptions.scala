package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlSelectAllOptions extends StObject {
  
  /**
    * The visibility configuration of the Select all options in a list control.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object ListControlSelectAllOptions {
  
  inline def apply(): ListControlSelectAllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListControlSelectAllOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListControlSelectAllOptions] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
