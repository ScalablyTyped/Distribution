package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlSearchOptions extends StObject {
  
  /**
    * The visibility configuration of the search options in a list control.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object ListControlSearchOptions {
  
  inline def apply(): ListControlSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListControlSearchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListControlSearchOptions] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
