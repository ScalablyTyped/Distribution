package typings.apolloReact.anon

import typings.react.mod.Requireable
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: Validator[_]
  var client: Validator[_]
  var immutable: Requireable[_]
  var store: Requireable[_]
}

object Children {
  @scala.inline
  def apply(children: Validator[_], client: Validator[_], immutable: Requireable[_], store: Requireable[_]): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], immutable = immutable.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

