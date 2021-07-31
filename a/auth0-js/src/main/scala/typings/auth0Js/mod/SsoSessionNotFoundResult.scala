package typings.auth0Js.mod

import typings.auth0Js.auth0JsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsoSessionNotFoundResult
  extends StObject
     with SsoDataResult {
  
  var sso: `false`
}
object SsoSessionNotFoundResult {
  
  @scala.inline
  def apply(): SsoSessionNotFoundResult = {
    val __obj = js.Dynamic.literal(sso = false)
    __obj.asInstanceOf[SsoSessionNotFoundResult]
  }
  
  @scala.inline
  implicit class SsoSessionNotFoundResultMutableBuilder[Self <: SsoSessionNotFoundResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSso(value: `false`): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
  }
}
