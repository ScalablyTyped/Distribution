package typings.apolloServerTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fauxpaque[T] extends js.Object {
  var __fauxpaque: T = js.native
}

object Fauxpaque {
  @scala.inline
  def apply[T](__fauxpaque: T): Fauxpaque[T] = {
    val __obj = js.Dynamic.literal(__fauxpaque = __fauxpaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fauxpaque[T]]
  }
  @scala.inline
  implicit class FauxpaqueOps[Self <: Fauxpaque[_], T] (val x: Self with Fauxpaque[T]) extends AnyVal {
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
    def set__fauxpaque(value: T): Self = this.set("__fauxpaque", value.asInstanceOf[js.Any])
  }
  
}

