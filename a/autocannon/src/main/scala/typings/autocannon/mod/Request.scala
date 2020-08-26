package typings.autocannon.mod

import typings.autocannon.autocannonStrings.ACL
import typings.autocannon.autocannonStrings.BIND
import typings.autocannon.autocannonStrings.CHECKOUT
import typings.autocannon.autocannonStrings.CONNECT
import typings.autocannon.autocannonStrings.COPY
import typings.autocannon.autocannonStrings.DELETE
import typings.autocannon.autocannonStrings.GET
import typings.autocannon.autocannonStrings.HEAD
import typings.autocannon.autocannonStrings.LINK
import typings.autocannon.autocannonStrings.LOCK
import typings.autocannon.autocannonStrings.MERGE
import typings.autocannon.autocannonStrings.MKACTIVITY
import typings.autocannon.autocannonStrings.MKCALENDAR
import typings.autocannon.autocannonStrings.MKCOL
import typings.autocannon.autocannonStrings.MOVE
import typings.autocannon.autocannonStrings.NOTIFY
import typings.autocannon.autocannonStrings.OPTIONS
import typings.autocannon.autocannonStrings.PATCH
import typings.autocannon.autocannonStrings.POST
import typings.autocannon.autocannonStrings.PROPFIND
import typings.autocannon.autocannonStrings.PROPPATCH
import typings.autocannon.autocannonStrings.PURGE
import typings.autocannon.autocannonStrings.PUT
import typings.autocannon.autocannonStrings.REBIND
import typings.autocannon.autocannonStrings.REPORT
import typings.autocannon.autocannonStrings.SEARCH
import typings.autocannon.autocannonStrings.SOURCE
import typings.autocannon.autocannonStrings.SUBSCRIBE
import typings.autocannon.autocannonStrings.TRACE
import typings.autocannon.autocannonStrings.UNBIND
import typings.autocannon.autocannonStrings.UNLINK
import typings.autocannon.autocannonStrings.UNLOCK
import typings.autocannon.autocannonStrings.UNSUBSCRIBE
import typings.autocannon.autocannonStrings.`M-SEARCH`
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var body: js.UndefOr[String | Buffer] = js.native
  var headers: js.UndefOr[IncomingHttpHeaders] = js.native
  var method: js.UndefOr[
    ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
  ] = js.native
  var path: js.UndefOr[String] = js.native
}

object Request {
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setBody(value: String | Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(
      value: ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

