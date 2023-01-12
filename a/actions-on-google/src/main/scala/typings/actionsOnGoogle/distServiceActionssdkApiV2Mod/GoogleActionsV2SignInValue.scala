package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2SignInValue extends StObject {
  
  /**
    * The status of the sign in requested by the app.
    */
  var status: js.UndefOr[GoogleActionsV2SignInValueStatus] = js.undefined
}
object GoogleActionsV2SignInValue {
  
  inline def apply(): GoogleActionsV2SignInValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SignInValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2SignInValue] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: GoogleActionsV2SignInValueStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
