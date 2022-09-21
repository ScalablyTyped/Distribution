package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLDOMAttribute2 extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLDOMAttribute2_typekey")
  var MSHTMLDotIHTMLDOMAttribute2_typekey: IHTMLDOMAttribute2 = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val attributes: Any = js.native
  
  val childNodes: Any = js.native
  
  def cloneNode(fDeep: Boolean): IHTMLDOMAttribute = js.native
  
  val expando: Boolean = js.native
  
  val firstChild: IHTMLDOMNode = js.native
  
  def hasChildNodes(): Boolean = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: Any): IHTMLDOMNode = js.native
  
  val lastChild: IHTMLDOMNode = js.native
  
  val name: String = js.native
  
  val nextSibling: IHTMLDOMNode = js.native
  
  val nodeType: Double = js.native
  
  val ownerDocument: Any = js.native
  
  val parentNode: IHTMLDOMNode = js.native
  
  val previousSibling: IHTMLDOMNode = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var value: String = js.native
}
