package typings.angularMaterial.anon

import typings.angularMaterial.mod.angularAugmentingMod.material.IDialogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  var methods: js.UndefOr[js.Array[String]] = js.native
  def options(): IDialogOptions = js.native
}

object Methods {
  @scala.inline
  def apply(options: () => IDialogOptions): Methods = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction0(options))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
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
    def setOptions(value: () => IDialogOptions): Self = this.set("options", js.Any.fromFunction0(value))
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
  }
  
}

