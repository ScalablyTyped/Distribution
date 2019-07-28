package typings.apolloDashReact

import typings.react.reactMod.Requireable
import typings.react.reactMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: Validator[_]
  var client: Validator[_]
  var immutable: Requireable[_]
  var store: Requireable[_]
}

object Anon_Children {
  @scala.inline
  def apply(children: Validator[_], client: Validator[_], immutable: Requireable[_], store: Requireable[_]): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children, client = client, immutable = immutable, store = store)
  
    __obj.asInstanceOf[Anon_Children]
  }
}

