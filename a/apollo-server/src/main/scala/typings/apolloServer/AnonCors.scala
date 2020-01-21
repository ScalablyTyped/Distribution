package typings.apolloServer

import typings.cors.mod.CorsOptions
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCors extends js.Object {
  var cors: js.UndefOr[CorsOptions | Boolean] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], js.Promise[_]]] = js.undefined
}

object AnonCors {
  @scala.inline
  def apply(
    cors: CorsOptions | Boolean = null,
    onHealthCheck: /* req */ Request_[ParamsDictionary] => js.Promise[_] = null
  ): AnonCors = {
    val __obj = js.Dynamic.literal()
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (onHealthCheck != null) __obj.updateDynamic("onHealthCheck")(js.Any.fromFunction1(onHealthCheck))
    __obj.asInstanceOf[AnonCors]
  }
}

