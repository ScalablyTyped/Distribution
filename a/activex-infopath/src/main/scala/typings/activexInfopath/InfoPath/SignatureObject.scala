package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureObject extends js.Object {
  val Certificate: CertificateObject = js.native
  val Comment: String = js.native
  @JSName("InfoPath.SignatureObject_typekey")
  var InfoPathDotSignatureObject_typekey: SignatureObject = js.native
  val SignatureBlockXmlNode: IXMLDOMNode = js.native
  val Status: XdSignatureStatus = js.native
  def Sign(): Unit = js.native
}

object SignatureObject {
  @scala.inline
  def apply(
    Certificate: CertificateObject,
    Comment: String,
    InfoPathDotSignatureObject_typekey: SignatureObject,
    Sign: () => Unit,
    SignatureBlockXmlNode: IXMLDOMNode,
    Status: XdSignatureStatus
  ): SignatureObject = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Sign = js.Any.fromFunction0(Sign), SignatureBlockXmlNode = SignatureBlockXmlNode.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SignatureObject_typekey")(InfoPathDotSignatureObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureObject]
  }
  @scala.inline
  implicit class SignatureObjectOps[Self <: SignatureObject] (val x: Self) extends AnyVal {
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
    def setCertificate(value: CertificateObject): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotSignatureObject_typekey(value: SignatureObject): Self = this.set("InfoPath.SignatureObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSign(value: () => Unit): Self = this.set("Sign", js.Any.fromFunction0(value))
    @scala.inline
    def setSignatureBlockXmlNode(value: IXMLDOMNode): Self = this.set("SignatureBlockXmlNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: XdSignatureStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

