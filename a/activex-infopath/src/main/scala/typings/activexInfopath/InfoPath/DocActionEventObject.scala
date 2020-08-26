package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocActionEventObject extends js.Object {
  @JSName("InfoPath.DocActionEventObject_typekey")
  var InfoPathDotDocActionEventObject_typekey: DocActionEventObject = js.native
  var ReturnStatus: Boolean = js.native
  val Source: IXMLDOMNode = js.native
  val XDocument: _XDocument = js.native
}

object DocActionEventObject {
  @scala.inline
  def apply(
    InfoPathDotDocActionEventObject_typekey: DocActionEventObject,
    ReturnStatus: Boolean,
    Source: IXMLDOMNode,
    XDocument: _XDocument
  ): DocActionEventObject = {
    val __obj = js.Dynamic.literal(ReturnStatus = ReturnStatus.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocActionEventObject_typekey")(InfoPathDotDocActionEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocActionEventObject]
  }
  @scala.inline
  implicit class DocActionEventObjectOps[Self <: DocActionEventObject] (val x: Self) extends AnyVal {
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
    def setInfoPathDotDocActionEventObject_typekey(value: DocActionEventObject): Self = this.set("InfoPath.DocActionEventObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnStatus(value: Boolean): Self = this.set("ReturnStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: IXMLDOMNode): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def setXDocument(value: _XDocument): Self = this.set("XDocument", value.asInstanceOf[js.Any])
  }
  
}

