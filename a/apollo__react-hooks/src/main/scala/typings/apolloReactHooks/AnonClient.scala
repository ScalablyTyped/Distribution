package typings.apolloReactHooks

import typings.apolloClient.mod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: ApolloClient[js.Object]
  var isNew: Boolean
}

object AnonClient {
  @scala.inline
  def apply(client: ApolloClient[js.Object], isNew: Boolean): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}

