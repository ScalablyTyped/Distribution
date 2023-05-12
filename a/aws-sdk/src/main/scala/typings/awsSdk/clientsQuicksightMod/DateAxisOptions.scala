package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateAxisOptions extends StObject {
  
  /**
    * Determines whether or not missing dates are displayed.
    */
  var MissingDateVisibility: js.UndefOr[Visibility] = js.undefined
}
object DateAxisOptions {
  
  inline def apply(): DateAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateAxisOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateAxisOptions] (val x: Self) extends AnyVal {
    
    inline def setMissingDateVisibility(value: Visibility): Self = StObject.set(x, "MissingDateVisibility", value.asInstanceOf[js.Any])
    
    inline def setMissingDateVisibilityUndefined: Self = StObject.set(x, "MissingDateVisibility", js.undefined)
  }
}
