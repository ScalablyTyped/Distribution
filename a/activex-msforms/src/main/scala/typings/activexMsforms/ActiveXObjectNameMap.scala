package typings.activexMsforms

import typings.activexMsforms.MSForms.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("Forms.Image")
  var FormsDotImage: Image = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(FormsDotImage: Image): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Forms.Image")(FormsDotImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
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
    def setFormsDotImage(value: Image): Self = this.set("Forms.Image", value.asInstanceOf[js.Any])
  }
  
}

