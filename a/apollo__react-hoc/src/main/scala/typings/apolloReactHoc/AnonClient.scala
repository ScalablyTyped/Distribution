package typings.apolloReactHoc

import typings.apolloClient.mod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: ApolloClient[_]
}

object AnonClient {
  @scala.inline
  def apply(client: ApolloClient[_]): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}

