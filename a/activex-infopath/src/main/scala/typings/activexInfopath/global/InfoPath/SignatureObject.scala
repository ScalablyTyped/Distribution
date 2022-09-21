package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdSignatureStatus
import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.SignatureObject")
@js.native
/* private */ open class SignatureObject ()
  extends StObject
     with typings.activexInfopath.InfoPath.SignatureObject {
  
  /* CompleteClass */
  override val Certificate: typings.activexInfopath.InfoPath.CertificateObject = js.native
  
  /* CompleteClass */
  override val Comment: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.SignatureObject_typekey")
  var InfoPathDotSignatureObject_typekey: typings.activexInfopath.InfoPath.SignatureObject = js.native
  
  /* CompleteClass */
  override def Sign(): Unit = js.native
  
  /* CompleteClass */
  override val SignatureBlockXmlNode: IXMLDOMNode = js.native
  
  /* CompleteClass */
  override val Status: XdSignatureStatus = js.native
}
