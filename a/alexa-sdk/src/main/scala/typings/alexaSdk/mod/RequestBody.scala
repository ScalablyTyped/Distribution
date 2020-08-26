package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestBody[T /* <: Request */] extends js.Object {
  var context: RequestContext = js.native
  var request: T = js.native
  var session: Session = js.native
  var version: String = js.native
}

object RequestBody {
  @scala.inline
  def apply[/* <: typings.alexaSdk.mod.Request */ T](context: RequestContext, request: T, session: Session, version: String): RequestBody[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBody[T]]
  }
  @scala.inline
  implicit class RequestBodyOps[Self <: RequestBody[_], /* <: typings.alexaSdk.mod.Request */ T] (val x: Self with RequestBody[T]) extends AnyVal {
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
    def setContext(value: RequestContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: T): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

