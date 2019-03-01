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
  def apply(tokenGetter: js.Function1[/* repeated */ js.Any, java.lang.String]): IJwtInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tokenGetter")(tokenGetter)
    __obj.asInstanceOf[IJwtInterceptor]
  }
}

