package typings.angularJwt.mod.jwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJwtInterceptor extends js.Object {
  
  def tokenGetter(params: js.Any*): String = js.native
}
object IJwtInterceptor {
  
  @scala.inline
  def apply(tokenGetter: /* repeated */ js.Any => String): IJwtInterceptor = {
    val __obj = js.Dynamic.literal(tokenGetter = js.Any.fromFunction1(tokenGetter))
    __obj.asInstanceOf[IJwtInterceptor]
  }
  
  @scala.inline
  implicit class IJwtInterceptorOps[Self <: IJwtInterceptor] (val x: Self) extends AnyVal {
    
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
    def setTokenGetter(value: /* repeated */ js.Any => String): Self = this.set("tokenGetter", js.Any.fromFunction1(value))
  }
}
