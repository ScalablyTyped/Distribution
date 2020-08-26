package typings.activexOffice.anon

import typings.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Part extends js.Object {
  val Part: CustomXMLPart = js.native
}

object Part {
  @scala.inline
  def apply(Part: CustomXMLPart): Part = {
    val __obj = js.Dynamic.literal(Part = Part.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
  @scala.inline
  implicit class PartOps[Self <: Part] (val x: Self) extends AnyVal {
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
    def setPart(value: CustomXMLPart): Self = this.set("Part", value.asInstanceOf[js.Any])
  }
  
}

