package typings.apolloReact

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: Validator[_]
  var store: Validator[_]
}

object AnonClient {
  @scala.inline
  def apply(client: Validator[_], store: Validator[_]): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}

