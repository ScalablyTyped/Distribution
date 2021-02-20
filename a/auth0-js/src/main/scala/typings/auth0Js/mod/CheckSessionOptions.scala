package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckSessionOptions extends AuthorizeOptions {
  
  /**
    * optional parameter for auth0 to use postMessage to communicate between the silent callback and the SPA.
    */
  var usePostMessage: js.UndefOr[Boolean] = js.native
}
object CheckSessionOptions {
  
  @scala.inline
  def apply(): CheckSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckSessionOptions]
  }
  
  @scala.inline
  implicit class CheckSessionOptionsMutableBuilder[Self <: CheckSessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsePostMessage(value: Boolean): Self = StObject.set(x, "usePostMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePostMessageUndefined: Self = StObject.set(x, "usePostMessage", js.undefined)
  }
}
