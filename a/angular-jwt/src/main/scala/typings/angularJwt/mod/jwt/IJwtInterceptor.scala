package typings.angularJwt.mod.jwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJwtInterceptor extends js.Object {
  def tokenGetter(params: js.Any*): String
}

object IJwtInterceptor {
  @scala.inline
  def apply(tokenGetter: /* repeated */ js.Any => String): IJwtInterceptor = {
    val __obj = js.Dynamic.literal(tokenGetter = js.Any.fromFunction1(tokenGetter))
  
    __obj.asInstanceOf[IJwtInterceptor]
  }
}

