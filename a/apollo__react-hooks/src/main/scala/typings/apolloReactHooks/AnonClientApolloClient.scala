package typings.apolloReactHooks

import typings.apolloClient.mod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientApolloClient extends js.Object {
  var client: js.UndefOr[ApolloClient[js.Object]] = js.undefined
}

object AnonClientApolloClient {
  @scala.inline
  def apply(client: ApolloClient[js.Object] = null): AnonClientApolloClient = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientApolloClient]
  }
}

