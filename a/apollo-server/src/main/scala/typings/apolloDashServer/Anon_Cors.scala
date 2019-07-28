package typings.apolloDashServer

import typings.cors.corsMod.CorsOptions
import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cors extends js.Object {
  var cors: js.UndefOr[CorsOptions | Boolean] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request, js.Promise[_]]] = js.undefined
}

object Anon_Cors {
  @scala.inline
  def apply(cors: CorsOptions | Boolean = null, onHealthCheck: /* req */ Request => js.Promise[_] = null): Anon_Cors = {
    val __obj = js.Dynamic.literal()
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (onHealthCheck != null) __obj.updateDynamic("onHealthCheck")(js.Any.fromFunction1(onHealthCheck))
    __obj.asInstanceOf[Anon_Cors]
  }
}

