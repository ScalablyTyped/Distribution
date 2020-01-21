package typings.angularPlatformBrowser.mod

import typings.std.DocumentFragment
import typings.std.Document_
import typings.std.Element
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLScriptElement
import typings.std.HTMLStyleElement
import typings.std.MouseEvent
import typings.std.Node
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "\u0275BrowserDomAdapter")
@js.native
class ɵBrowserDomAdapter () extends ɵangularPackagesPlatformBrowserPlatformBrowserL {
  def appendChild(el: Node, node: Node): Unit = js.native
  def childNodesAsList(el: Node): js.Array[_] = js.native
  def clearNodes(el: Node): Unit = js.native
  def content(node: Node): Node = js.native
  def createElement(tagName: String): HTMLElement = js.native
  def createElement(tagName: String, doc: Document_): HTMLElement = js.native
  def createElementNS(ns: String, tagName: String, doc: Document_): Element = js.native
  def createEvent(eventType: js.Any): Event_ = js.native
  def createMouseEvent(eventType: String): MouseEvent = js.native
  def createScriptTag(attrName: String, attrValue: String, doc: Document_): HTMLScriptElement = js.native
  def createShadowRoot(el: HTMLElement): DocumentFragment = js.native
  def createStyleElement(css: String, doc: Document_): HTMLStyleElement = js.native
  def createTextNode(text: String, doc: Document_): Text = js.native
  def dispatchEvent(el: Node, evt: js.Any): Unit = js.native
  def firstChild(el: Node): Node | Null = js.native
  def getAttribute(element: Element, attribute: String): String | Null = js.native
  def getAttributeNS(element: Element, ns: String, name: String): String | Null = js.native
  def getBoundingClientRect(el: Element): js.Any = js.native
  def getData(element: Element, name: String): String | Null = js.native
  def getHost(el: HTMLElement): HTMLElement = js.native
  def getHref(el: Element): String = js.native
  def getInnerHTML(el: HTMLElement): String = js.native
  def getOuterHTML(el: HTMLElement): String = js.native
  def getProperty(el: Node, name: String): js.Any = js.native
  def getShadowRoot(el: HTMLElement): DocumentFragment = js.native
  def getTemplateContent(el: Node): Node | Null = js.native
  def getText(el: Node): String | Null = js.native
  def hasAttribute(element: Element, attribute: String): Boolean = js.native
  def hasAttributeNS(element: Element, ns: String, attribute: String): Boolean = js.native
  def hasProperty(element: Node, name: String): Boolean = js.native
  def insertAfter(parent: Node, ref: Node, node: js.Any): Unit = js.native
  def insertAllBefore(parent: Node, ref: Node, nodes: js.Array[Node]): Unit = js.native
  def insertBefore(parent: Node, ref: Node, node: Node): Unit = js.native
  def invoke(el: Node, methodName: String, args: js.Array[_]): js.Any = js.native
  def isCommentNode(node: Node): Boolean = js.native
  def isElementNode(node: Node): Boolean = js.native
  def isPrevented(evt: Event_): Boolean = js.native
  def isTemplateElement(el: Node): Boolean = js.native
  def isTextNode(node: Node): Boolean = js.native
  def log(error: String): Unit = js.native
  def logError(error: String): Unit = js.native
  def logGroup(error: String): Unit = js.native
  def nextSibling(el: Node): Node | Null = js.native
  def nodeName(node: Node): String = js.native
  def nodeValue(node: Node): String | Null = js.native
  def on(el: Node, evt: js.Any, listener: js.Any): Unit = js.native
  def onAndCancel(el: Node, evt: js.Any, listener: js.Any): js.Function = js.native
  def parentElement(el: Node): Node | Null = js.native
  def preventDefault(evt: Event_): Unit = js.native
  def querySelector(el: HTMLElement, selector: String): js.Any = js.native
  def remove(node: Node): Node = js.native
  def removeAttribute(element: Element, attribute: String): Unit = js.native
  def removeAttributeNS(element: Element, ns: String, name: String): Unit = js.native
  def removeChild(el: Node, node: Node): Unit = js.native
  def replaceChild(el: Node, newChild: Node, oldChild: Node): Unit = js.native
  def setAttribute(element: Element, name: String, value: String): Unit = js.native
  def setAttributeNS(element: Element, ns: String, name: String, value: String): Unit = js.native
  def setData(element: Element, name: String, value: String): Unit = js.native
  def setInnerHTML(el: Element, value: String): Unit = js.native
  def setProperty(el: Node, name: String, value: js.Any): Unit = js.native
  def setText(el: Node, value: String): Unit = js.native
  def templateAwareRoot(el: Node): js.Any = js.native
  def `type`(node: HTMLInputElement): String = js.native
}

/* static members */
@JSImport("@angular/platform-browser", "\u0275BrowserDomAdapter")
@js.native
object ɵBrowserDomAdapter extends js.Object {
  def makeCurrent(): Unit = js.native
}

