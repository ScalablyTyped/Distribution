package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignatureObject")
@js.native
class SignatureObject protected () extends js.Object {
  val Certificate: CertificateObject = js.native
  val Comment: java.lang.String = js.native
  var `InfoPath.SignatureObject_typekey`: SignatureObject = js.native
  val SignatureBlockXmlNode: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode = js.native
  val Status: XdSignatureStatus = js.native
  def Sign(): scala.Unit = js.native
}

