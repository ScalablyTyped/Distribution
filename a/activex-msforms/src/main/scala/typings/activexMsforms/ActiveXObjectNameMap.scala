package typings.activexMsforms

import typings.activexMsforms.MSForms.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("Forms.Image")
  var FormsDotImage: Image
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(FormsDotImage: Image): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Forms.Image")(FormsDotImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

