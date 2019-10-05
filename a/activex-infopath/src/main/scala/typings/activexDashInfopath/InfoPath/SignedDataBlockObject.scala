package typings.activexDashInfopath.InfoPath

import typings.activexDashMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignedDataBlockObject")
@js.native
class SignedDataBlockObject protected () extends js.Object {
  val Caption: String = js.native
  var `InfoPath.SignedDataBlockObject_typekey`: SignedDataBlockObject = js.native
  val Name: String = js.native
  val SignatureContainer: IXMLDOMNode = js.native
  val SignatureRelation: XdSignatureRelation = js.native
  val Signatures: SignaturesCollection = js.native
  val XPath: String = js.native
  val XPathNamespaceDeclarations: String = js.native
  def Sign(): Unit = js.native
}

