package typings.atApolloReactDashHooks

import typings.apolloDashClient.apolloDashClientMod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientApolloClient extends js.Object {
  var client: js.UndefOr[ApolloClient[js.Object]] = js.undefined
}

object Anon_ClientApolloClient {
  @scala.inline
  def apply(client: ApolloClient[js.Object] = null): Anon_ClientApolloClient = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[Anon_ClientApolloClient]
  }
}

