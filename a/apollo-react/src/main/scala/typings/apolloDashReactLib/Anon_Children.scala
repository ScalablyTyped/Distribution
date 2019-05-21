package typings
package apolloDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: reactLib.reactMod.Validator[_]
  var client: reactLib.reactMod.Validator[_]
  var immutable: reactLib.reactMod.Requireable[_]
  var store: reactLib.reactMod.Requireable[_]
}

object Anon_Children {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Validator[_],
    client: reactLib.reactMod.Validator[_],
    immutable: reactLib.reactMod.Requireable[_],
    store: reactLib.reactMod.Requireable[_]
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children, client = client, immutable = immutable, store = store)
  
    __obj.asInstanceOf[Anon_Children]
  }
}

