package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLDOMNode3 extends StObject {
  
  @JSName("MSHTML.IHTMLDOMNode3_typekey")
  var MSHTMLDotIHTMLDOMNode3_typekey: IHTMLDOMNode3 = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def compareDocumentPosition(otherNode: IHTMLDOMNode): Double = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  
  def isDefaultNamespace(pvarNamespace: js.Any): Boolean = js.native
  
  def isEqualNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSameNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSupported(feature: String, version: js.Any): Boolean = js.native
  
  val localName: js.Any = js.native
  
  def lookupNamespaceURI(pvarPrefix: js.Any): js.Any = js.native
  
  def lookupPrefix(pvarNamespaceURI: js.Any): js.Any = js.native
  
  val namespaceURI: js.Any = js.native
  
  var prefix: js.Any = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var textContent: js.Any = js.native
}
