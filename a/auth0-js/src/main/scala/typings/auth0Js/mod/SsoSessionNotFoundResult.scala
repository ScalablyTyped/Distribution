package typings.auth0Js.mod

import typings.auth0Js.auth0JsBooleans.`false`
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
  implicit class SsoSessionNotFoundResultOps[Self <: SsoSessionNotFoundResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSso(value: `false`): Self = this.set("sso", value.asInstanceOf[js.Any])
  }
}
