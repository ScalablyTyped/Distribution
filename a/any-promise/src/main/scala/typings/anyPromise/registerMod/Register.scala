package typings.anyPromise.registerMod

import typings.anyPromise.anon.TypeofPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Register extends js.Object {
  var Promise: TypeofPromise = js.native
  var implementation: String = js.native
}

object Register {
  @scala.inline
  def apply(Promise: TypeofPromise, implementation: String): Register = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Register]
  }
  @scala.inline
  implicit class RegisterOps[Self <: Register] (val x: Self) extends AnyVal {
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
    def setPromise(value: TypeofPromise): Self = this.set("Promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setImplementation(value: String): Self = this.set("implementation", value.asInstanceOf[js.Any])
  }
  
}

