package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2SignInValue extends StObject {
  
  /**
    * The status of the sign in requested by the app.
    */
  var status: js.UndefOr[GoogleActionsV2SignInValueStatus] = js.native
}
object GoogleActionsV2SignInValue {
  
  @scala.inline
  def apply(): GoogleActionsV2SignInValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SignInValue]
  }
  
  @scala.inline
  implicit class GoogleActionsV2SignInValueMutableBuilder[Self <: GoogleActionsV2SignInValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GoogleActionsV2SignInValueStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
