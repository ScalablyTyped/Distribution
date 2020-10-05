package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Definition[DF /* <: DefinitionFactory[_] */] extends js.Object {
  var factory: DF | Null = js.native
}

object Definition {
  @scala.inline
  def apply[/* <: typings.angularCore.mod.DefinitionFactory[_] */ DF](): Definition[DF] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition[DF]]
  }
  @scala.inline
  implicit class DefinitionOps[Self <: Definition[_], /* <: typings.angularCore.mod.DefinitionFactory[_] */ DF] (val x: Self with Definition[DF]) extends AnyVal {
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
    def setFactory(value: DF): Self = this.set("factory", value.asInstanceOf[js.Any])
    @scala.inline
    def setFactoryNull: Self = this.set("factory", null)
  }
  
}

