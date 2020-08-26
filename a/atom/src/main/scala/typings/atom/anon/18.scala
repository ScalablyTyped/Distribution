package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `18` extends js.Object {
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor = js.native
  var value: String | Double = js.native
}

object `18` {
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: String | Double): `18` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  @scala.inline
  implicit class `18Ops`[Self <: `18`] (val x: Self) extends AnyVal {
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
    def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = this.set("scopeDescriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

