package typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCore.atAngularCoreMod.Type
import typings.std.Document
import typings.std.Element
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import typings.std.History
import typings.std.Location
import typings.std.Map
import typings.std.Node
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "\u0275DomAdapter")
@js.native
abstract class ɵDomAdapter () extends js.Object {
  /**
    * Maps attribute names to their corresponding property names for cases
    * where attribute name doesn't match property name.
    */
  var attrToPropMap: StringDictionary[String] = js.native
  var resourceLoaderType: Type[_] = js.native
  def addClass(element: js.Any, className: String): js.Any = js.native
  def adoptNode(node: Node): Node = js.native
  def appendChild(el: js.Any, node: js.Any): js.Any = js.native
  def attributeMap(element: js.Any): Map[String, String] = js.native
  def childNodes(el: js.Any): js.Array[Node] = js.native
  def childNodesAsList(el: js.Any): js.Array[Node] = js.native
  def classList(element: js.Any): js.Array[_] = js.native
  def clearNodes(el: js.Any): js.Any = js.native
  def clone(node: Node): Node = js.native
  def contains(nodeA: js.Any, nodeB: js.Any): Boolean = js.native
  def content(node: js.Any): js.Any = js.native
  def createComment(text: String): js.Any = js.native
  def createElement(tagName: js.Any): HTMLElement = js.native
  def createElement(tagName: js.Any, doc: js.Any): HTMLElement = js.native
  def createElementNS(ns: String, tagName: String): Element = js.native
  def createElementNS(ns: String, tagName: String, doc: js.Any): Element = js.native
  def createEvent(eventType: String): js.Any = js.native
  def createHtmlDocument(): HTMLDocument = js.native
  def createMouseEvent(eventType: js.Any): js.Any = js.native
  def createScriptTag(attrName: String, attrValue: String): HTMLElement = js.native
  def createScriptTag(attrName: String, attrValue: String, doc: js.Any): HTMLElement = js.native
  def createShadowRoot(el: js.Any): js.Any = js.native
  def createStyleElement(css: String): HTMLStyleElement = js.native
  def createStyleElement(css: String, doc: js.Any): HTMLStyleElement = js.native
  def createTemplate(html: js.Any): HTMLElement = js.native
  def createTextNode(text: String): Text = js.native
  def createTextNode(text: String, doc: js.Any): Text = js.native
  def dispatchEvent(el: js.Any, evt: js.Any): js.Any = js.native
  def elementMatches(n: js.Any, selector: String): Boolean = js.native
  def firstChild(el: js.Any): Node | Null = js.native
  def getAnimationPrefix(): String = js.native
  def getAttribute(element: js.Any, attribute: String): String | Null = js.native
  def getAttributeNS(element: js.Any, ns: String, attribute: String): String | Null = js.native
  def getBaseHref(doc: Document): String | Null = js.native
  def getBoundingClientRect(el: js.Any): js.Any = js.native
  def getChecked(el: js.Any): Boolean = js.native
  def getComputedStyle(element: js.Any): js.Any = js.native
  def getCookie(name: String): String | Null = js.native
  def getData(element: js.Any, name: String): String | Null = js.native
  def getDefaultDocument(): Document = js.native
  def getDistributedNodes(el: js.Any): js.Array[Node] = js.native
  def getElementsByClassName(element: js.Any, name: String): js.Array[HTMLElement] = js.native
  def getElementsByTagName(element: js.Any, name: String): js.Array[HTMLElement] = js.native
  def getEventKey(event: js.Any): String = js.native
  def getGlobalEventTarget(doc: Document, target: String): js.Any = js.native
  def getHistory(): History = js.native
  def getHost(el: js.Any): js.Any = js.native
  def getHref(element: js.Any): String = js.native
  def getInnerHTML(el: js.Any): String = js.native
  def getLocation(): Location = js.native
  def getOuterHTML(el: js.Any): String = js.native
  def getProperty(el: Element, name: String): js.Any = js.native
  def getShadowRoot(el: js.Any): js.Any = js.native
  def getStyle(element: js.Any, styleName: String): String = js.native
  /** Returns content if el is a <template> element, null otherwise. */
  def getTemplateContent(el: js.Any): js.Any = js.native
  def getText(el: js.Any): String | Null = js.native
  def getTitle(doc: Document): String = js.native
  def getTransitionEnd(): String = js.native
  def getUserAgent(): String = js.native
  def getValue(el: js.Any): String = js.native
  def hasAttribute(element: js.Any, attribute: String): Boolean = js.native
  def hasAttributeNS(element: js.Any, ns: String, attribute: String): Boolean = js.native
  def hasClass(element: js.Any, className: String): Boolean = js.native
  def hasProperty(element: js.Any, name: String): Boolean = js.native
  def hasShadowRoot(node: js.Any): Boolean = js.native
  def hasStyle(element: js.Any, styleName: String): Boolean = js.native
  def hasStyle(element: js.Any, styleName: String, styleValue: String): Boolean = js.native
  def importIntoDoc(node: Node): Node = js.native
  def insertAfter(parent: js.Any, el: js.Any, node: js.Any): js.Any = js.native
  def insertAllBefore(parent: js.Any, ref: js.Any, nodes: js.Any): js.Any = js.native
  def insertBefore(parent: js.Any, ref: js.Any, node: js.Any): js.Any = js.native
  def invoke(el: Element, methodName: String, args: js.Array[_]): js.Any = js.native
  def isCommentNode(node: js.Any): Boolean = js.native
  def isElementNode(node: js.Any): Boolean = js.native
  def isPrevented(evt: js.Any): Boolean = js.native
  def isShadowRoot(node: js.Any): Boolean = js.native
  def isTemplateElement(el: js.Any): Boolean = js.native
  def isTextNode(node: js.Any): Boolean = js.native
  def log(error: js.Any): js.Any = js.native
  def logError(error: js.Any): js.Any = js.native
  def logGroup(error: js.Any): js.Any = js.native
  def logGroupEnd(): js.Any = js.native
  def nextSibling(el: js.Any): Node | Null = js.native
  def nodeName(node: js.Any): String = js.native
  def nodeValue(node: js.Any): String | Null = js.native
  def on(el: js.Any, evt: js.Any, listener: js.Any): js.Any = js.native
  def onAndCancel(el: js.Any, evt: js.Any, listener: js.Any): js.Function = js.native
  def parentElement(el: js.Any): Node | Null = js.native
  def parse(templateHtml: String): js.Any = js.native
  def performanceNow(): Double = js.native
  def preventDefault(evt: js.Any): js.Any = js.native
  def querySelector(el: js.Any, selector: String): js.Any = js.native
  def querySelectorAll(el: js.Any, selector: String): js.Array[_] = js.native
  def remove(el: js.Any): Node = js.native
  def removeAttribute(element: js.Any, attribute: String): js.Any = js.native
  def removeAttributeNS(element: js.Any, ns: String, attribute: String): js.Any = js.native
  def removeChild(el: js.Any, node: js.Any): js.Any = js.native
  def removeClass(element: js.Any, className: String): js.Any = js.native
  def removeStyle(element: js.Any, styleName: String): js.Any = js.native
  def replaceChild(el: js.Any, newNode: js.Any, oldNode: js.Any): js.Any = js.native
  def resetBaseElement(): Unit = js.native
  def resolveAndSetHref(element: js.Any, baseUrl: String, href: String): js.Any = js.native
  def setAttribute(element: js.Any, name: String, value: String): js.Any = js.native
  def setAttributeNS(element: js.Any, ns: String, name: String, value: String): js.Any = js.native
  def setChecked(el: js.Any, value: Boolean): js.Any = js.native
  def setCookie(name: String, value: String): js.Any = js.native
  def setData(element: js.Any, name: String, value: String): js.Any = js.native
  def setInnerHTML(el: js.Any, value: js.Any): js.Any = js.native
  def setProperty(el: Element, name: String, value: js.Any): js.Any = js.native
  def setStyle(element: js.Any, styleName: String, styleValue: String): js.Any = js.native
  def setText(el: js.Any, value: String): js.Any = js.native
  def setTitle(doc: Document, newTitle: String): js.Any = js.native
  def setValue(el: js.Any, value: String): js.Any = js.native
  def supportsAnimation(): Boolean = js.native
  def supportsCookies(): Boolean = js.native
  def supportsDOMEvents(): Boolean = js.native
  def supportsNativeShadowDOM(): Boolean = js.native
  def supportsWebAnimation(): Boolean = js.native
  def tagName(element: js.Any): String = js.native
  def templateAwareRoot(el: js.Any): js.Any = js.native
  def `type`(node: js.Any): String = js.native
}

