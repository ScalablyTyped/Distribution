package typings
package apolloDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cors extends js.Object {
  var cors: js.UndefOr[corsLib.corsMod.CorsOptions | scala.Boolean] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.Request, js.Promise[_]]] = js.undefined
}

object Anon_Cors {
  @scala.inline
  def apply(
    cors: corsLib.corsMod.CorsOptions | scala.Boolean = null,
    onHealthCheck: /* req */ expressLib.expressMod.Request => js.Promise[_] = null
  ): Anon_Cors = {
    val __obj = js.Dynamic.literal()
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (onHealthCheck != null) __obj.updateDynamic("onHealthCheck")(js.Any.fromFunction1(onHealthCheck))
    __obj.asInstanceOf[Anon_Cors]
  }
}

