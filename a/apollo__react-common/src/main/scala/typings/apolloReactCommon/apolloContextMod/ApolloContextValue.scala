package typings.apolloReactCommon.apolloContextMod

import typings.apolloClient.mod.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloContextValue extends js.Object {
  var client: js.UndefOr[default[js.Object]] = js.native
  var renderPromises: js.UndefOr[Record[_, _]] = js.native
}

object ApolloContextValue {
  @scala.inline
  def apply(): ApolloContextValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApolloContextValue]
  }
  @scala.inline
  implicit class ApolloContextValueOps[Self <: ApolloContextValue] (val x: Self) extends AnyVal {
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
    def setClient(value: default[js.Object]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setRenderPromises(value: Record[_, _]): Self = this.set("renderPromises", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderPromises: Self = this.set("renderPromises", js.undefined)
  }
  
}

