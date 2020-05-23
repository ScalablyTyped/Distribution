package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedDataBlockObject extends js.Object {
  val Caption: String
  @JSName("InfoPath.SignedDataBlockObject_typekey")
  var InfoPathDotSignedDataBlockObject_typekey: SignedDataBlockObject
  val Name: String
  val SignatureContainer: IXMLDOMNode
  val SignatureRelation: XdSignatureRelation
  val Signatures: SignaturesCollection
  val XPath: String
  val XPathNamespaceDeclarations: String
  def Sign(): Unit
}

object SignedDataBlockObject {
  @scala.inline
  def apply(
    Caption: String,
    InfoPathDotSignedDataBlockObject_typekey: SignedDataBlockObject,
    Name: String,
    Sign: () => Unit,
    SignatureContainer: IXMLDOMNode,
    SignatureRelation: XdSignatureRelation,
    Signatures: SignaturesCollection,
    XPath: String,
    XPathNamespaceDeclarations: String
  ): SignedDataBlockObject = {
    val __obj = js.Dynamic.literal(Caption = Caption.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Sign = js.Any.fromFunction0(Sign), SignatureContainer = SignatureContainer.asInstanceOf[js.Any], SignatureRelation = SignatureRelation.asInstanceOf[js.Any], Signatures = Signatures.asInstanceOf[js.Any], XPath = XPath.asInstanceOf[js.Any], XPathNamespaceDeclarations = XPathNamespaceDeclarations.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SignedDataBlockObject_typekey")(InfoPathDotSignedDataBlockObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedDataBlockObject]
  }
}

