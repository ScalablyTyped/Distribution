package typings
package apolloDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: reactLib.reactMod.Validator[_]
  var store: reactLib.reactMod.Validator[_]
}

object Anon_Client {
  @scala.inline
  def apply(client: reactLib.reactMod.Validator[_], store: reactLib.reactMod.Validator[_]): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client, store = store)
  
    __obj.asInstanceOf[Anon_Client]
  }
}

