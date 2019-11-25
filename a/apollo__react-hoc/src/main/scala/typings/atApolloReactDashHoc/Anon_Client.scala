package typings.atApolloReactDashHoc

import typings.apolloDashClient.apolloDashClientMod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: ApolloClient[_]
}

object Anon_Client {
  @scala.inline
  def apply(client: ApolloClient[_]): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Client]
  }
}

