package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParameterObject extends js.Object {
  @JSName("InfoPath.InputParameterObject_typekey")
  var InfoPathDotInputParameterObject_typekey: InputParameterObject = js.native
  val Name: String = js.native
  val Value: String = js.native
}

object InputParameterObject {
  @scala.inline
  def apply(InfoPathDotInputParameterObject_typekey: InputParameterObject, Name: String, Value: String): InputParameterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.InputParameterObject_typekey")(InfoPathDotInputParameterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParameterObject]
  }
  @scala.inline
  implicit class InputParameterObjectOps[Self <: InputParameterObject] (val x: Self) extends AnyVal {
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
    def setInfoPathDotInputParameterObject_typekey(value: InputParameterObject): Self = this.set("InfoPath.InputParameterObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

