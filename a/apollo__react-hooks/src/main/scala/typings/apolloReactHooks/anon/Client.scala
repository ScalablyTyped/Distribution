package typings.apolloReactHooks.anon

import typings.apolloClient.mod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var client: ApolloClient[js.Object]
  var isNew: Boolean
}

object Client {
  @scala.inline
  def apply(client: ApolloClient[js.Object], isNew: Boolean): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

