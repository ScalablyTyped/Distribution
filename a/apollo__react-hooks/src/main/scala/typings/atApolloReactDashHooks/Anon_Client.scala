package typings.atApolloReactDashHooks

import typings.apolloDashClient.apolloDashClientMod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: ApolloClient[js.Object]
  var isNew: Boolean
}

object Anon_Client {
  @scala.inline
  def apply(client: ApolloClient[js.Object], isNew: Boolean): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Client]
  }
}

