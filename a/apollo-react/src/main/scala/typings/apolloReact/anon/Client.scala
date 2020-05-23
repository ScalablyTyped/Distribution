package typings.apolloReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var client: Validator[_]
  var store: Validator[_]
}

object Client {
  @scala.inline
  def apply(client: Validator[_], store: Validator[_]): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

