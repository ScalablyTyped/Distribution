package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestBody[T /* <: Request */] extends js.Object {
  var context: RequestContext
  var request: T
  var session: Session
  var version: String
}

object RequestBody {
  @scala.inline
  def apply[T /* <: Request */](context: RequestContext, request: T, session: Session, version: String): RequestBody[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestBody[T]]
  }
}

