package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAdapterObject extends js.Object {
  var AttachmentFileName: String
  var AttachmentType: XdAttachmentType
  var BCC: String
  var CC: String
  @JSName("InfoPath.EmailAdapterObject_typekey")
  var InfoPathDotEmailAdapterObject_typekey: EmailAdapterObject
  var Intro: String
  val Name: String
  val QueryAllowed: Boolean
  var Subject: String
  val SubmitAllowed: Boolean
  var To: String
  def Query(): Unit
  def Submit(): Unit
  def SubmitData(pData: IXMLDOMNode): Unit
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
}

