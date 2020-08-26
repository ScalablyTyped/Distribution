package typings.apolloReactHooks.anon

import typings.apolloClient.mod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var client: ApolloClient[js.Object] = js.native
  var isNew: Boolean = js.native
}

object Client {
  @scala.inline
  def apply(client: ApolloClient[js.Object], isNew: Boolean): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
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
    def setClient(value: ApolloClient[js.Object]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNew(value: Boolean): Self = this.set("isNew", value.asInstanceOf[js.Any])
  }
  
}

