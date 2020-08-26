package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionTransport extends js.Object {
  var clear: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.native
  var get: js.UndefOr[js.Function1[/* req */ Request, String | Null]] = js.native
  var set: js.UndefOr[js.Function2[/* res */ Response, /* sid */ String, Unit]] = js.native
}

object SessionTransport {
  @scala.inline
  def apply(): SessionTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionTransport]
  }
  @scala.inline
  implicit class SessionTransportOps[Self <: SessionTransport] (val x: Self) extends AnyVal {
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
    def setClear(value: /* res */ Response => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setGet(value: /* req */ Request => String | Null): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setSet(value: (/* res */ Response, /* sid */ String) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
  
}

