package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailAdapterObject extends js.Object {
  var AttachmentFileName: String = js.native
  var AttachmentType: XdAttachmentType = js.native
  var BCC: String = js.native
  var CC: String = js.native
  @JSName("InfoPath.EmailAdapterObject_typekey")
  var InfoPathDotEmailAdapterObject_typekey: EmailAdapterObject = js.native
  var Intro: String = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  var Subject: String = js.native
  val SubmitAllowed: Boolean = js.native
  var To: String = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
  def SubmitData(pData: IXMLDOMNode): Unit = js.native
}

object EmailAdapterObject {
  @scala.inline
  def apply(
    AttachmentFileName: String,
    AttachmentType: XdAttachmentType,
    BCC: String,
    CC: String,
    InfoPathDotEmailAdapterObject_typekey: EmailAdapterObject,
    Intro: String,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Subject: String,
    Submit: () => Unit,
    SubmitAllowed: Boolean,
    SubmitData: IXMLDOMNode => Unit,
    To: String
  ): EmailAdapterObject = {
    val __obj = js.Dynamic.literal(AttachmentFileName = AttachmentFileName.asInstanceOf[js.Any], AttachmentType = AttachmentType.asInstanceOf[js.Any], BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Intro = Intro.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], SubmitData = js.Any.fromFunction1(SubmitData), To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.EmailAdapterObject_typekey")(InfoPathDotEmailAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAdapterObject]
  }
  @scala.inline
  implicit class EmailAdapterObjectOps[Self <: EmailAdapterObject] (val x: Self) extends AnyVal {
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
    def setAttachmentFileName(value: String): Self = this.set("AttachmentFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentType(value: XdAttachmentType): Self = this.set("AttachmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBCC(value: String): Self = this.set("BCC", value.asInstanceOf[js.Any])
    @scala.inline
    def setCC(value: String): Self = this.set("CC", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotEmailAdapterObject_typekey(value: EmailAdapterObject): Self = this.set("InfoPath.EmailAdapterObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntro(value: String): Self = this.set("Intro", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: () => Unit): Self = this.set("Query", js.Any.fromFunction0(value))
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = this.set("QueryAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmit(value: () => Unit): Self = this.set("Submit", js.Any.fromFunction0(value))
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = this.set("SubmitAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitData(value: IXMLDOMNode => Unit): Self = this.set("SubmitData", js.Any.fromFunction1(value))
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
  }
  
}

