package typings.angularCore.anon

import typings.angularCore.mod.RCssStyleDeclaration
import typings.angularCore.mod.RDomTokenList
import typings.angularCore.mod.RElement
import typings.angularCore.mod.RNode
import typings.angularCore.mod.TrustedHTML
import typings.angularCore.mod.TrustedScript
import typings.angularCore.mod.TrustedScriptURL
import typings.std.Document
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/core.@angular/core.RElement & {  ownerDocument :std.Document} */
@js.native
trait RElementownerDocumentDocu extends StObject {
  
  def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
  
  /**
    * Append a child node.
    *
    * Used exclusively for building up DOM which are static (ie not View roots)
    */
  def appendChild(newChild: RNode): RNode = js.native
  
  var classList: RDomTokenList = js.native
  
  var className: String = js.native
  
  def insertBefore(newChild: RNode, refChild: Null, isViewRoot: Boolean): Unit = js.native
  /**
    * Insert a child node.
    *
    * Used exclusively for adding View root nodes into ViewAnchor location.
    */
  def insertBefore(newChild: RNode, refChild: RNode, isViewRoot: Boolean): Unit = js.native
  
  /**
    * Gets the Node immediately following this one in the parent's childNodes
    */
  var nextSibling: RNode | Null = js.native
  
  var ownerDocument: Document = js.native
  
  /**
    * Returns the parent Element if there is one
    */
  var parentElement: RElement | Null = js.native
  
  /**
    * Returns the parent Element, Document, or DocumentFragment
    */
  var parentNode: RNode | Null = js.native
  
  def removeAttribute(name: String): Unit = js.native
  
  /**
    * Removes a child from the current node and returns the removed node
    * @param oldChild the child node to remove
    */
  def removeChild(oldChild: RNode): RNode = js.native
  
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, listener: Unit, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener, options: Boolean): Unit = js.native
  
  def setAttribute(name: String, value: String): Unit = js.native
  def setAttribute(name: String, value: TrustedHTML): Unit = js.native
  def setAttribute(name: String, value: TrustedScript): Unit = js.native
  def setAttribute(name: String, value: TrustedScriptURL): Unit = js.native
  
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit = js.native
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: TrustedHTML): Unit = js.native
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: TrustedScript): Unit = js.native
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: TrustedScriptURL): Unit = js.native
  
  var setProperty: js.UndefOr[js.Function2[/* name */ String, /* value */ js.Any, Unit]] = js.native
  
  var style: RCssStyleDeclaration = js.native
  
  var textContent: String | Null = js.native
}
