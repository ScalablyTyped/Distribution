package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureObject extends StObject {
  
  val Certificate: CertificateObject = js.native
  
  val Comment: String = js.native
  
  @JSName("InfoPath.SignatureObject_typekey")
  var InfoPathDotSignatureObject_typekey: SignatureObject = js.native
  
  def Sign(): Unit = js.native
  
  val SignatureBlockXmlNode: IXMLDOMNode = js.native
  
  val Status: XdSignatureStatus = js.native
}
object SignatureObject {
  
  @scala.inline
  def apply(
    Certificate: CertificateObject,
    Comment: String,
    InfoPathDotSignatureObject_typekey: SignatureObject,
    Sign: () => Unit,
    SignatureBlockXmlNode: IXMLDOMNode,
    Status: XdSignatureStatus
  ): SignatureObject = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Sign = js.Any.fromFunction0(Sign), SignatureBlockXmlNode = SignatureBlockXmlNode.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SignatureObject_typekey")(InfoPathDotSignatureObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureObject]
  }
  
  @scala.inline
  implicit class SignatureObjectMutableBuilder[Self <: SignatureObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: CertificateObject): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSignatureObject_typekey(value: SignatureObject): Self = StObject.set(x, "InfoPath.SignatureObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign(value: () => Unit): Self = StObject.set(x, "Sign", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignatureBlockXmlNode(value: IXMLDOMNode): Self = StObject.set(x, "SignatureBlockXmlNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: XdSignatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
