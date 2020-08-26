package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldListKeyAscii extends js.Object {
  val FieldList: Double = js.native
  var KeyAscii: Double = js.native
}

object FieldListKeyAscii {
  @scala.inline
  def apply(FieldList: Double, KeyAscii: Double): FieldListKeyAscii = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any], KeyAscii = KeyAscii.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldListKeyAscii]
  }
  @scala.inline
  implicit class FieldListKeyAsciiOps[Self <: FieldListKeyAscii] (val x: Self) extends AnyVal {
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
    def setFieldList(value: Double): Self = this.set("FieldList", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyAscii(value: Double): Self = this.set("KeyAscii", value.asInstanceOf[js.Any])
  }
  
}

