package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedDataBlockObject extends StObject {
  
  val Caption: String
  
  /* private */ @JSName("InfoPath.SignedDataBlockObject_typekey")
  var InfoPathDotSignedDataBlockObject_typekey: SignedDataBlockObject
  
  val Name: String
  
  def Sign(): Unit
  
  val SignatureContainer: IXMLDOMNode
  
  val SignatureRelation: XdSignatureRelation
  
  val Signatures: SignaturesCollection
  
  val XPath: String
  
  val XPathNamespaceDeclarations: String
}
object SignedDataBlockObject {
  
  inline def apply(
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
  
  extension [Self <: SignedDataBlockObject](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotSignedDataBlockObject_typekey(value: SignedDataBlockObject): Self = StObject.set(x, "InfoPath.SignedDataBlockObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSign(value: () => Unit): Self = StObject.set(x, "Sign", js.Any.fromFunction0(value))
    
    inline def setSignatureContainer(value: IXMLDOMNode): Self = StObject.set(x, "SignatureContainer", value.asInstanceOf[js.Any])
    
    inline def setSignatureRelation(value: XdSignatureRelation): Self = StObject.set(x, "SignatureRelation", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: SignaturesCollection): Self = StObject.set(x, "Signatures", value.asInstanceOf[js.Any])
    
    inline def setXPath(value: String): Self = StObject.set(x, "XPath", value.asInstanceOf[js.Any])
    
    inline def setXPathNamespaceDeclarations(value: String): Self = StObject.set(x, "XPathNamespaceDeclarations", value.asInstanceOf[js.Any])
  }
}
