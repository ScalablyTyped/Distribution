package typings
package angularDashJwtLib.angularMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJwtInterceptor extends js.Object {
  def tokenGetter(params: js.Any*): java.lang.String
}

object IJwtInterceptor {
  @scala.inline
  def apply(tokenGetter: /* repeated */ js.Any => java.lang.String): IJwtInterceptor = {
    val __obj = js.Dynamic.literal(tokenGetter = js.Any.fromFunction1(tokenGetter))
  
    __obj.asInstanceOf[IJwtInterceptor]
  }
}

