package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdSignatureRelation
import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignedDataBlockObject")
@js.native
class SignedDataBlockObject protected ()
  extends typings.activexInfopath.InfoPath.SignedDataBlockObject {
  /* CompleteClass */
  override val Caption: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.SignedDataBlockObject_typekey")
  override var InfoPathDotSignedDataBlockObject_typekey: typings.activexInfopath.InfoPath.SignedDataBlockObject = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val SignatureContainer: IXMLDOMNode = js.native
  /* CompleteClass */
  override val SignatureRelation: XdSignatureRelation = js.native
  /* CompleteClass */
  override val Signatures: typings.activexInfopath.InfoPath.SignaturesCollection = js.native
  /* CompleteClass */
  override val XPath: String = js.native
  /* CompleteClass */
  override val XPathNamespaceDeclarations: String = js.native
  /* CompleteClass */
  override def Sign(): Unit = js.native
}

