package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureObject extends js.Object {
  val Certificate: CertificateObject
  val Comment: String
  @JSName("InfoPath.SignatureObject_typekey")
  var InfoPathDotSignatureObject_typekey: SignatureObject
  val SignatureBlockXmlNode: IXMLDOMNode
  val Status: XdSignatureStatus
  def Sign(): Unit
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
}

