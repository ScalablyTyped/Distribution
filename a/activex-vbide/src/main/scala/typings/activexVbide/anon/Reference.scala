package typings.activexVbide.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  val Reference: typings.activexVbide.VBIDE.Reference = js.native
}

object Reference {
  @scala.inline
  def apply(Reference: typings.activexVbide.VBIDE.Reference): Reference = {
    val __obj = js.Dynamic.literal(Reference = Reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
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
    def setReference(value: typings.activexVbide.VBIDE.Reference): Self = this.set("Reference", value.asInstanceOf[js.Any])
  }
  
}

