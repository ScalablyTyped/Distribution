package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLDOMImplementation extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLDOMImplementation_typekey")
  var MSHTMLDotHTMLDOMImplementation_typekey: HTMLDOMImplementation = js.native
  
  val constructor: Any = js.native
  
  def createDocument(pvarNS: Any, pvarTagName: Any, pDocumentType: IDOMDocumentType): IHTMLDocument7 = js.native
  
  def createDocumentType(bstrQualifiedName: String, pvarPublicId: Any, pvarSystemId: Any): IDOMDocumentType = js.native
  
  def createHTMLDocument(bstrTitle: String): IHTMLDocument7 = js.native
  
  def hasFeature(bstrfeature: String): Boolean = js.native
  def hasFeature(bstrfeature: String, version: Any): Boolean = js.native
  
  def ie9_hasFeature(bstrfeature: String): Boolean = js.native
  def ie9_hasFeature(bstrfeature: String, version: Any): Boolean = js.native
}
