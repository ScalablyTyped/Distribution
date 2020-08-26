package typings.activexOffice.anon

import typings.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewPart extends js.Object {
  val NewPart: CustomXMLPart = js.native
}

object NewPart {
  @scala.inline
  def apply(NewPart: CustomXMLPart): NewPart = {
    val __obj = js.Dynamic.literal(NewPart = NewPart.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewPart]
  }
  @scala.inline
  implicit class NewPartOps[Self <: NewPart] (val x: Self) extends AnyVal {
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
    def setNewPart(value: CustomXMLPart): Self = this.set("NewPart", value.asInstanceOf[js.Any])
  }
  
}

