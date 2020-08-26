package typings.arangodb.sessionsMod

import typings.arangodb.ArangoDB.Collection
import typings.arangodb.Foxx.SessionStorage
import typings.arangodb.Foxx.SessionTransport
import typings.arangodb.arangodbStrings.cookie
import typings.arangodb.arangodbStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionsOptions extends js.Object {
  var autoCreate: js.UndefOr[Boolean] = js.native
  var storage: SessionStorage | String | Collection[_] = js.native
  var transport: SessionTransport | js.Array[SessionTransport] | cookie | header = js.native
}

object SessionsOptions {
  @scala.inline
  def apply(
    storage: SessionStorage | String | Collection[_],
    transport: SessionTransport | js.Array[SessionTransport] | cookie | header
  ): SessionsOptions = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionsOptions]
  }
  @scala.inline
  implicit class SessionsOptionsOps[Self <: SessionsOptions] (val x: Self) extends AnyVal {
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
    def setStorage(value: SessionStorage | String | Collection[_]): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportVarargs(value: SessionTransport*): Self = this.set("transport", js.Array(value :_*))
    @scala.inline
    def setTransport(value: SessionTransport | js.Array[SessionTransport] | cookie | header): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoCreate(value: Boolean): Self = this.set("autoCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCreate: Self = this.set("autoCreate", js.undefined)
  }
  
}

