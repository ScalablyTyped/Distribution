package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocEventObject extends js.Object {
  @JSName("InfoPath.DocEventObject_typekey")
  var InfoPathDotDocEventObject_typekey: DocEventObject = js.native
  val XDocument: _XDocument = js.native
}

object DocEventObject {
  @scala.inline
  def apply(InfoPathDotDocEventObject_typekey: DocEventObject, XDocument: _XDocument): DocEventObject = {
    val __obj = js.Dynamic.literal(XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocEventObject_typekey")(InfoPathDotDocEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocEventObject]
  }
  @scala.inline
  implicit class DocEventObjectOps[Self <: DocEventObject] (val x: Self) extends AnyVal {
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
    def setInfoPathDotDocEventObject_typekey(value: DocEventObject): Self = this.set("InfoPath.DocEventObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setXDocument(value: _XDocument): Self = this.set("XDocument", value.asInstanceOf[js.Any])
  }
  
}

