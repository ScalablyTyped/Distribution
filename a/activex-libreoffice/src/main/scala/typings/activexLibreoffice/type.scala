package typings.activexLibreoffice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `type` extends js.Object {
  var typekey: `type` = js.native
}

object `type` {
  @scala.inline
  def apply(typekey: `type`): `type` = {
    val __obj = js.Dynamic.literal(typekey = typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[`type`]
  }
  @scala.inline
  implicit class typeOps[Self <: `type`] (val x: Self) extends AnyVal {
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
    def setTypekey(value: `type`): Self = this.set("typekey", value.asInstanceOf[js.Any])
  }
  
}

