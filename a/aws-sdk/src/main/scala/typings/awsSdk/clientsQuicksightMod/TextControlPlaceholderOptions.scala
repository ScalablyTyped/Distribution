package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextControlPlaceholderOptions extends StObject {
  
  /**
    * The visibility configuration of the placeholder options in a text control.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object TextControlPlaceholderOptions {
  
  inline def apply(): TextControlPlaceholderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextControlPlaceholderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextControlPlaceholderOptions] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
