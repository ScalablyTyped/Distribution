package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdSignatureStatus
import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignatureObject")
@js.native
class SignatureObject protected ()
  extends typings.activexInfopath.InfoPath.SignatureObject {
  /* CompleteClass */
  override val Certificate: typings.activexInfopath.InfoPath.CertificateObject = js.native
  /* CompleteClass */
  override val Comment: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.SignatureObject_typekey")
  override var InfoPathDotSignatureObject_typekey: typings.activexInfopath.InfoPath.SignatureObject = js.native
  /* CompleteClass */
  override val SignatureBlockXmlNode: IXMLDOMNode = js.native
  /* CompleteClass */
  override val Status: XdSignatureStatus = js.native
  /* CompleteClass */
  override def Sign(): Unit = js.native
}

