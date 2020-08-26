package typings.apolloReact.anon

import typings.react.mod.Requireable
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: Validator[_] = js.native
  var client: Validator[_] = js.native
  var immutable: Requireable[_] = js.native
  var store: Requireable[_] = js.native
}

object Children {
  @scala.inline
  def apply(children: Validator[_], client: Validator[_], immutable: Requireable[_], store: Requireable[_]): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], immutable = immutable.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: Validator[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: Validator[_]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setImmutable(value: Requireable[_]): Self = this.set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: Requireable[_]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

