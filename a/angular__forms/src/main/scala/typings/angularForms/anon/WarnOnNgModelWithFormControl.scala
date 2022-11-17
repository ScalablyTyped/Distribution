package typings.angularForms.anon

import typings.angularForms.mod.SetDisabledStateOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarnOnNgModelWithFormControl extends StObject {
  
  var callSetDisabledState: js.UndefOr[SetDisabledStateOption] = js.undefined
  
  /** @deprecated as of v6 */ var warnOnNgModelWithFormControl: js.UndefOr["never" | "once" | "always"] = js.undefined
}
object WarnOnNgModelWithFormControl {
  
  inline def apply(): WarnOnNgModelWithFormControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarnOnNgModelWithFormControl]
  }
  
  extension [Self <: WarnOnNgModelWithFormControl](x: Self) {
    
    inline def setCallSetDisabledState(value: SetDisabledStateOption): Self = StObject.set(x, "callSetDisabledState", value.asInstanceOf[js.Any])
    
    inline def setCallSetDisabledStateUndefined: Self = StObject.set(x, "callSetDisabledState", js.undefined)
    
    inline def setWarnOnNgModelWithFormControl(value: "never" | "once" | "always"): Self = StObject.set(x, "warnOnNgModelWithFormControl", value.asInstanceOf[js.Any])
    
    inline def setWarnOnNgModelWithFormControlUndefined: Self = StObject.set(x, "warnOnNgModelWithFormControl", js.undefined)
  }
}
