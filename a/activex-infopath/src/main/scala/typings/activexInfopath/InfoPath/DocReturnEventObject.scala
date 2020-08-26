package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocReturnEventObject extends js.Object {
  @JSName("InfoPath.DocReturnEventObject_typekey")
  var InfoPathDotDocReturnEventObject_typekey: DocReturnEventObject = js.native
  var ReturnStatus: Boolean = js.native
  val XDocument: _XDocument = js.native
}

object DocReturnEventObject {
  @scala.inline
  def apply(
    InfoPathDotDocReturnEventObject_typekey: DocReturnEventObject,
    ReturnStatus: Boolean,
    XDocument: _XDocument
  ): DocReturnEventObject = {
    val __obj = js.Dynamic.literal(ReturnStatus = ReturnStatus.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocReturnEventObject_typekey")(InfoPathDotDocReturnEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocReturnEventObject]
  }
  @scala.inline
  implicit class DocReturnEventObjectOps[Self <: DocReturnEventObject] (val x: Self) extends AnyVal {
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
    def setInfoPathDotDocReturnEventObject_typekey(value: DocReturnEventObject): Self = this.set("InfoPath.DocReturnEventObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnStatus(value: Boolean): Self = this.set("ReturnStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setXDocument(value: _XDocument): Self = this.set("XDocument", value.asInstanceOf[js.Any])
  }
  
}

