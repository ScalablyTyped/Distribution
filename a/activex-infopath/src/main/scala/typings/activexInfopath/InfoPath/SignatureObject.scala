package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignatureObject")
@js.native
class SignatureObject protected () extends js.Object {
  val Certificate: CertificateObject = js.native
  val Comment: String = js.native
  @JSName("InfoPath.SignatureObject_typekey")
  var InfoPathDotSignatureObject_typekey: SignatureObject = js.native
  val SignatureBlockXmlNode: IXMLDOMNode = js.native
  val Status: XdSignatureStatus = js.native
  def Sign(): Unit = js.native
}

