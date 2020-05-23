package typings.apolloReactHooks.anon

import typings.apolloClient.mod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApolloClient extends js.Object {
  var client: js.UndefOr[ApolloClient[js.Object]] = js.undefined
}

object ClientApolloClient {
  @scala.inline
  def apply(client: ApolloClient[js.Object] = null): ClientApolloClient = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApolloClient]
  }
}

