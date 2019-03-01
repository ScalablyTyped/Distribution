package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestBody[T /* <: Request */] extends js.Object {
  var context: RequestContext
  var request: T
  var session: Session
  var version: java.lang.String
}

object RequestBody {
  @scala.inline
  def apply[T /* <: Request */](context: RequestContext, request: T, session: Session, version: java.lang.String): RequestBody[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.updateDynamic("session")(session)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[RequestBody[T]]
  }
}

