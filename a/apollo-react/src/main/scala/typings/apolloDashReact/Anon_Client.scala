package typings.apolloDashReact

import typings.react.reactMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: Validator[_]
  var store: Validator[_]
}

object Anon_Client {
  @scala.inline
  def apply(client: Validator[_], store: Validator[_]): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client, store = store)
  
    __obj.asInstanceOf[Anon_Client]
  }
}

