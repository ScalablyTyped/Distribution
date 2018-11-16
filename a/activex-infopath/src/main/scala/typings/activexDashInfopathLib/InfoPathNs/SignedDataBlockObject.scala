package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignedDataBlockObject")
@js.native
class SignedDataBlockObject protected () extends js.Object {
  val Caption: java.lang.String = js.native
  var `InfoPath.SignedDataBlockObject_typekey`: SignedDataBlockObject = js.native
  val Name: java.lang.String = js.native
  val SignatureContainer: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode = js.native
  val SignatureRelation: XdSignatureRelation = js.native
  val Signatures: SignaturesCollection = js.native
  val XPath: java.lang.String = js.native
  val XPathNamespaceDeclarations: java.lang.String = js.native
  def Sign(): scala.Unit = js.native
}

