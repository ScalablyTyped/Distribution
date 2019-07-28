package typings.activexDashInfopath.InfoPathNs

import typings.activexDashMsxml2.MSXML2Ns.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignatureObject")
@js.native
class SignatureObject protected () extends js.Object {
  val Certificate: CertificateObject = js.native
  val Comment: String = js.native
  var `InfoPath.SignatureObject_typekey`: SignatureObject = js.native
  val SignatureBlockXmlNode: IXMLDOMNode = js.native
  val Status: XdSignatureStatus = js.native
  def Sign(): Unit = js.native
}

