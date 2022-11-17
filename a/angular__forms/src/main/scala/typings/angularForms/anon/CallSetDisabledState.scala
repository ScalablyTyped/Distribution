package typings.angularForms.anon

import typings.angularForms.mod.SetDisabledStateOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallSetDisabledState extends StObject {
  
  var callSetDisabledState: js.UndefOr[SetDisabledStateOption] = js.undefined
}
object CallSetDisabledState {
  
  inline def apply(): CallSetDisabledState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallSetDisabledState]
  }
  
  extension [Self <: CallSetDisabledState](x: Self) {
    
    inline def setCallSetDisabledState(value: SetDisabledStateOption): Self = StObject.set(x, "callSetDisabledState", value.asInstanceOf[js.Any])
    
    inline def setCallSetDisabledStateUndefined: Self = StObject.set(x, "callSetDisabledState", js.undefined)
  }
}
