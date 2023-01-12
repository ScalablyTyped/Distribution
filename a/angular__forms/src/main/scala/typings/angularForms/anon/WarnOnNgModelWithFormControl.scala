package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.always
import typings.angularForms.angularFormsStrings.never
import typings.angularForms.angularFormsStrings.once
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarnOnNgModelWithFormControl extends StObject {
  
  /** @deprecated as of v6 */ var warnOnNgModelWithFormControl: never | once | always
}
object WarnOnNgModelWithFormControl {
  
  inline def apply(warnOnNgModelWithFormControl: never | once | always): WarnOnNgModelWithFormControl = {
    val __obj = js.Dynamic.literal(warnOnNgModelWithFormControl = warnOnNgModelWithFormControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarnOnNgModelWithFormControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WarnOnNgModelWithFormControl] (val x: Self) extends AnyVal {
    
    inline def setWarnOnNgModelWithFormControl(value: never | once | always): Self = StObject.set(x, "warnOnNgModelWithFormControl", value.asInstanceOf[js.Any])
  }
}
