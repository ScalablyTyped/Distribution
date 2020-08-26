package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedDataBlockObject extends js.Object {
  val Caption: String = js.native
  @JSName("InfoPath.SignedDataBlockObject_typekey")
  var InfoPathDotSignedDataBlockObject_typekey: SignedDataBlockObject = js.native
  val Name: String = js.native
  val SignatureContainer: IXMLDOMNode = js.native
  val SignatureRelation: XdSignatureRelation = js.native
  val Signatures: SignaturesCollection = js.native
  val XPath: String = js.native
  val XPathNamespaceDeclarations: String = js.native
  def Sign(): Unit = js.native
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
  @scala.inline
  implicit class SignedDataBlockObjectOps[Self <: SignedDataBlockObject] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotSignedDataBlockObject_typekey(value: SignedDataBlockObject): Self = this.set("InfoPath.SignedDataBlockObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSign(value: () => Unit): Self = this.set("Sign", js.Any.fromFunction0(value))
    @scala.inline
    def setSignatureContainer(value: IXMLDOMNode): Self = this.set("SignatureContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureRelation(value: XdSignatureRelation): Self = this.set("SignatureRelation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatures(value: SignaturesCollection): Self = this.set("Signatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setXPath(value: String): Self = this.set("XPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setXPathNamespaceDeclarations(value: String): Self = this.set("XPathNamespaceDeclarations", value.asInstanceOf[js.Any])
  }
  
}

