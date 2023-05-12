package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetElementConfigurationOverrides extends StObject {
  
  /**
    * Determines whether or not the overrides are visible. Choose one of the following options:    VISIBLE     HIDDEN   
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object SheetElementConfigurationOverrides {
  
  inline def apply(): SheetElementConfigurationOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetElementConfigurationOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetElementConfigurationOverrides] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
