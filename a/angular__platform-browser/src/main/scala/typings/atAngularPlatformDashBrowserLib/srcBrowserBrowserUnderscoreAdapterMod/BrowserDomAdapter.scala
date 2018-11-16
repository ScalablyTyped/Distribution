package typings
package atAngularPlatformDashBrowserLib.srcBrowserBrowserUnderscoreAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/src/browser/browser_adapter", "BrowserDomAdapter")
@js.native
class BrowserDomAdapter ()
  extends atAngularPlatformDashBrowserLib.srcBrowserGenericUnderscoreBrowserUnderscoreAdapterMod.GenericBrowserDomAdapter {
  def appendChild(el: stdLib.Node, node: stdLib.Node): scala.Unit = js.native
  def childNodesAsList(el: stdLib.Node): js.Array[_] = js.native
  def clearNodes(el: stdLib.Node): scala.Unit = js.native
  def content(node: stdLib.Node): stdLib.Node = js.native
  def createElement(tagName: java.lang.String): stdLib.HTMLElement = js.native
  def createElement(tagName: java.lang.String, doc: stdLib.Document): stdLib.HTMLElement = js.native
  def createElementNS(ns: java.lang.String, tagName: java.lang.String, doc: stdLib.Document): stdLib.Element = js.native
  def createEvent(eventType: js.Any): stdLib.Event = js.native
  def createMouseEvent(eventType: java.lang.String): stdLib.MouseEvent = js.native
  def createScriptTag(attrName: java.lang.String, attrValue: java.lang.String, doc: stdLib.Document): stdLib.HTMLScriptElement = js.native
  def createShadowRoot(el: stdLib.HTMLElement): stdLib.DocumentFragment = js.native
  def createStyleElement(css: java.lang.String, doc: stdLib.Document): stdLib.HTMLStyleElement = js.native
  def createTextNode(text: java.lang.String, doc: stdLib.Document): stdLib.Text = js.native
  def dispatchEvent(el: stdLib.Node, evt: js.Any): scala.Unit = js.native
  def firstChild(el: stdLib.Node): stdLib.Node | scala.Null = js.native
  def getAttribute(element: stdLib.Element, attribute: java.lang.String): java.lang.String | scala.Null = js.native
  def getAttributeNS(element: stdLib.Element, ns: java.lang.String, name: java.lang.String): java.lang.String | scala.Null = js.native
  def getBoundingClientRect(el: stdLib.Element): js.Any = js.native
  def getData(element: stdLib.Element, name: java.lang.String): java.lang.String | scala.Null = js.native
  def getHost(el: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def getHref(el: stdLib.Element): java.lang.String = js.native
  def getInnerHTML(el: stdLib.HTMLElement): java.lang.String = js.native
  def getOuterHTML(el: stdLib.HTMLElement): java.lang.String = js.native
  def getProperty(el: stdLib.Node, name: java.lang.String): js.Any = js.native
  def getShadowRoot(el: stdLib.HTMLElement): stdLib.DocumentFragment = js.native
  def getTemplateContent(el: stdLib.Node): stdLib.Node | scala.Null = js.native
  def getText(el: stdLib.Node): java.lang.String | scala.Null = js.native
  def hasAttribute(element: stdLib.Element, attribute: java.lang.String): scala.Boolean = js.native
  def hasAttributeNS(element: stdLib.Element, ns: java.lang.String, attribute: java.lang.String): scala.Boolean = js.native
  def hasProperty(element: stdLib.Node, name: java.lang.String): scala.Boolean = js.native
  def insertAfter(parent: stdLib.Node, ref: stdLib.Node, node: js.Any): scala.Unit = js.native
  def insertAllBefore(parent: stdLib.Node, ref: stdLib.Node, nodes: js.Array[stdLib.Node]): scala.Unit = js.native
  def insertBefore(parent: stdLib.Node, ref: stdLib.Node, node: stdLib.Node): scala.Unit = js.native
  def invoke(el: stdLib.Node, methodName: java.lang.String, args: js.Array[_]): js.Any = js.native
  def isCommentNode(node: stdLib.Node): scala.Boolean = js.native
  def isElementNode(node: stdLib.Node): scala.Boolean = js.native
  def isPrevented(evt: stdLib.Event): scala.Boolean = js.native
  def isTemplateElement(el: stdLib.Node): scala.Boolean = js.native
  def isTextNode(node: stdLib.Node): scala.Boolean = js.native
  def log(error: java.lang.String): scala.Unit = js.native
  def logError(error: java.lang.String): scala.Unit = js.native
  def logGroup(error: java.lang.String): scala.Unit = js.native
  def nextSibling(el: stdLib.Node): stdLib.Node | scala.Null = js.native
  def nodeName(node: stdLib.Node): java.lang.String = js.native
  def nodeValue(node: stdLib.Node): java.lang.String | scala.Null = js.native
  def on(el: stdLib.Node, evt: js.Any, listener: js.Any): scala.Unit = js.native
  def onAndCancel(el: stdLib.Node, evt: js.Any, listener: js.Any): js.Function = js.native
  def parentElement(el: stdLib.Node): stdLib.Node | scala.Null = js.native
  def preventDefault(evt: stdLib.Event): scala.Unit = js.native
  def querySelector(el: stdLib.HTMLElement, selector: java.lang.String): js.Any = js.native
  def remove(node: stdLib.Node): stdLib.Node = js.native
  def removeAttribute(element: stdLib.Element, attribute: java.lang.String): scala.Unit = js.native
  def removeAttributeNS(element: stdLib.Element, ns: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def removeChild(el: stdLib.Node, node: stdLib.Node): scala.Unit = js.native
  def replaceChild(el: stdLib.Node, newChild: stdLib.Node, oldChild: stdLib.Node): scala.Unit = js.native
  def setAttribute(element: stdLib.Element, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttributeNS(element: stdLib.Element, ns: java.lang.String, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setData(element: stdLib.Element, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setInnerHTML(el: stdLib.Element, value: java.lang.String): scala.Unit = js.native
  def setProperty(el: stdLib.Node, name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setText(el: stdLib.Node, value: java.lang.String): scala.Unit = js.native
  def templateAwareRoot(el: stdLib.Node): js.Any = js.native
  def `type`(node: stdLib.HTMLInputElement): java.lang.String = js.native
}

@JSImport("@angular/platform-browser/src/browser/browser_adapter", "BrowserDomAdapter")
@js.native
object BrowserDomAdapter extends js.Object {
  def makeCurrent(): scala.Unit = js.native
}

