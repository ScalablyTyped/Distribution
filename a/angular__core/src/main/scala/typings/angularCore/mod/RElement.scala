package typings.angularCore.mod

import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subset of API needed for writing attributes, properties, and setting up
  * listeners on Element.
  */
@js.native
trait RElement
  extends StObject
     with RNode {
  
  def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
  
  var classList: RDomTokenList = js.native
  
  var className: String = js.native
  
  def removeAttribute(name: String): Unit = js.native
  
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
  
  var setProperty: js.UndefOr[js.Function2[/* name */ String, /* value */ Any, Unit]] = js.native
  
  var style: RCssStyleDeclaration = js.native
  
  var tagName: String = js.native
  
  var textContent: String | Null = js.native
}
