package typings.auth0Js.mod

import typings.auth0Js.auth0JsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SsoSessionNotFoundResult extends SsoDataResult {
  
  var sso: `false` = js.native
}
object SsoSessionNotFoundResult {
  
  @scala.inline
  def apply(sso: `false`): SsoSessionNotFoundResult = {
    val __obj = js.Dynamic.literal(sso = sso.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsoSessionNotFoundResult]
  }
  
  @scala.inline
  implicit class SsoSessionNotFoundResultMutableBuilder[Self <: SsoSessionNotFoundResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSso(value: `false`): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
  }
}
