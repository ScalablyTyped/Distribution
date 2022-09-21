package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldHTMLDocument extends StObject {
  
  def CreateEventObject(): IHTMLEventObj = js.native
  def CreateEventObject(pvarEventObject: Any): IHTMLEventObj = js.native
  
  def FireEvent(bstrEventName: String): Boolean = js.native
  def FireEvent(bstrEventName: String, pvarEventObject: Any): Boolean = js.native
  
  /* private */ @JSName("MSHTML.OldHTMLDocument_typekey")
  var MSHTMLDotOldHTMLDocument_typekey: OldHTMLDocument = js.native
  
  val Script: Any = js.native
  
  val URLUnencoded: String = js.native
  
  val activeElement: IHTMLElement = js.native
  
  def addEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit = js.native
  
  def adoptNode(pNodeSource: IHTMLDOMNode): IHTMLDOMNode3 = js.native
  
  var alinkColor: Any = js.native
  
  def all(): Any = js.native
  def all(name: Any): Any = js.native
  def all(name: Any, index: Any): Any = js.native
  def all(name: Unit, index: Any): Any = js.native
  @JSName("all")
  val all_Original: IHTMLElementCollection = js.native
  
  def anchors(): Any = js.native
  def anchors(name: Any): Any = js.native
  def anchors(name: Any, index: Any): Any = js.native
  def anchors(name: Unit, index: Any): Any = js.native
  @JSName("anchors")
  val anchors_Original: IHTMLElementCollection = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def applets(): Any = js.native
  def applets(name: Any): Any = js.native
  def applets(name: Any, index: Any): Any = js.native
  def applets(name: Unit, index: Any): Any = js.native
  @JSName("applets")
  val applets_Original: IHTMLElementCollection = js.native
  
  def attachEvent(event: String, pdisp: Any): Boolean = js.native
  
  val attributes: Any = js.native
  
  var bgColor: Any = js.native
  
  val body: IHTMLElement = js.native
  
  val characterSet: String = js.native
  
  var charset: String = js.native
  
  val childNodes: Any = js.native
  
  def clear(): Unit = js.native
  
  def cloneNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def close(): Unit = js.native
  
  def compareDocumentPosition(otherNode: IHTMLDOMNode): Double = js.native
  
  val compatMode: String = js.native
  
  def compatible(index: Double): IHTMLDocumentCompatibleInfo = js.native
  @JSName("compatible")
  val compatible_Original: IHTMLDocumentCompatibleInfoCollection = js.native
  
  val constructor: Any = js.native
  
  var cookie: String = js.native
  
  def createAttribute(bstrAttrName: String): IHTMLDOMAttribute = js.native
  
  def createAttributeNS(pvarNS: Any, bstrAttrName: String): IHTMLDOMAttribute = js.native
  
  def createCDATASection(text: String): IHTMLDOMNode = js.native
  
  def createComment(bstrData: String): IHTMLDOMNode = js.native
  
  def createDocumentFragment(): IHTMLDocument2 = js.native
  
  def createDocumentFromUrl(bstrURL: String, bstrOptions: String): IHTMLDocument2 = js.native
  
  def createElement(eTag: String): IHTMLElement = js.native
  
  def createElementNS(pvarNS: Any, bstrTag: String): IHTMLElement = js.native
  
  def createEvent(eventType: String): IDOMEvent = js.native
  
  def createNodeIterator(pRootNode: Any, ulWhatToShow: Double, pFilter: Any, fEntityReferenceExpansion: Boolean): IDOMNodeIterator = js.native
  
  def createProcessingInstruction(bstrTarget: String, bstrData: String): IDOMProcessingInstruction = js.native
  
  def createRange(): IHTMLDOMRange = js.native
  
  def createRenderStyle(v: String): IHTMLRenderStyle = js.native
  
  /**
    * @param bstrHref [bstrHref='']
    * @param lIndex [lIndex=-1]
    */
  def createStyleSheet(): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: String): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: String, lIndex: Double): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: Unit, lIndex: Double): IHTMLStyleSheet = js.native
  
  def createTextNode(text: String): IHTMLDOMNode = js.native
  
  def createTreeWalker(pRootNode: Any, ulWhatToShow: Double, pFilter: Any, fEntityReferenceExpansion: Boolean): IDOMTreeWalker = js.native
  
  var defaultCharset: String = js.native
  
  def defaultView(pvarIndex: Any): Any = js.native
  @JSName("defaultView")
  val defaultView_Original: IHTMLWindow2 = js.native
  
  var designMode: String = js.native
  
  def detachEvent(event: String, pdisp: Any): Unit = js.native
  
  var dir: String = js.native
  
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  
  val doctype: IHTMLDOMNode = js.native
  
  val documentElement: IHTMLElement = js.native
  
  val documentMode: Any = js.native
  
  var domain: String = js.native
  
  def elementFromPoint(x: Double, y: Double): IHTMLElement = js.native
  
  def elementsFromPoint(x: Double, y: Double): IHTMLDOMChildrenCollection = js.native
  
  def elementsFromRect(left: Double, top: Double, width: Double, height: Double): IHTMLDOMChildrenCollection = js.native
  
  def embeds(): Any = js.native
  def embeds(name: Any): Any = js.native
  def embeds(name: Any, index: Any): Any = js.native
  def embeds(name: Unit, index: Any): Any = js.native
  @JSName("embeds")
  val embeds_Original: IHTMLElementCollection = js.native
  
  /** @param showUI [showUI=false] */
  def execCommand(cmdID: String): Boolean = js.native
  def execCommand(cmdID: String, showUI: Boolean): Boolean = js.native
  def execCommand(cmdID: String, showUI: Boolean, value: Any): Boolean = js.native
  def execCommand(cmdID: String, showUI: Unit, value: Any): Boolean = js.native
  
  def execCommandShowHelp(cmdID: String): Boolean = js.native
  
  var expando: Boolean = js.native
  
  var fgColor: Any = js.native
  
  val fileCreatedDate: String = js.native
  
  val fileModifiedDate: String = js.native
  
  val fileSize: String = js.native
  
  val fileUpdatedDate: String = js.native
  
  val firstChild: IHTMLDOMNode = js.native
  
  def focus(): Unit = js.native
  
  def forms(): Any = js.native
  def forms(name: Any): Any = js.native
  def forms(name: Any, index: Any): Any = js.native
  def forms(name: Unit, index: Any): Any = js.native
  @JSName("forms")
  val forms_Original: IHTMLElementCollection = js.native
  
  def frames(pvarIndex: Any): Any = js.native
  @JSName("frames")
  val frames_Original: FramesCollection = js.native
  
  def getElementById(v: String): IHTMLElement = js.native
  
  def getElementsByClassName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByTagName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByTagNameNS(pvarNS: Any, bstrLocalName: String): IHTMLElementCollection = js.native
  
  def getSelection(): IHTMLSelection = js.native
  
  def hasAttributes(): Boolean = js.native
  
  def hasChildNodes(): Boolean = js.native
  
  def hasFocus(): Boolean = js.native
  
  val head: IHTMLElement = js.native
  
  def ie8_getElementById(bstrId: String): IHTMLElement2 = js.native
  
  def ie9_all(): Any = js.native
  def ie9_all(name: Any): Any = js.native
  def ie9_all(name: Any, index: Any): Any = js.native
  def ie9_all(name: Unit, index: Any): Any = js.native
  @JSName("ie9_all")
  val ie9_all_Original: IHTMLElementCollection = js.native
  
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var ie9_body: IHTMLElement = js.native
  
  def ie9_createAttribute(bstrAttrName: String): IHTMLDOMAttribute = js.native
  
  def ie9_createElement(bstrTag: String): IHTMLElement = js.native
  
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: Any): IHTMLDOMNode = js.native
  
  def ie9_parentWindow(pvarIndex: Any): Any = js.native
  @JSName("ie9_parentWindow")
  val ie9_parentWindow_Original: IHTMLWindow2 = js.native
  
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def images(): Any = js.native
  def images(name: Any): Any = js.native
  def images(name: Any, index: Any): Any = js.native
  def images(name: Unit, index: Any): Any = js.native
  @JSName("images")
  val images_Original: IHTMLElementCollection = js.native
  
  val implementation: IHTMLDOMImplementation = js.native
  
  def importNode(pNodeSource: IHTMLDOMNode, fDeep: Boolean): IHTMLDOMNode3 = js.native
  
  val inputEncoding: String = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: Any): IHTMLDOMNode = js.native
  
  def isDefaultNamespace(pvarNamespace: Any): Boolean = js.native
  
  def isEqualNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSameNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSupported(feature: String, version: Any): Boolean = js.native
  
  val lastChild: IHTMLDOMNode = js.native
  
  val lastModified: String = js.native
  
  var linkColor: Any = js.native
  
  def links(): Any = js.native
  def links(name: Any): Any = js.native
  def links(name: Any, index: Any): Any = js.native
  def links(name: Unit, index: Any): Any = js.native
  @JSName("links")
  val links_Original: IHTMLElementCollection = js.native
  
  val localName: Any = js.native
  
  val location: IHTMLLocation = js.native
  
  def lookupNamespaceURI(pvarPrefix: Any): Any = js.native
  
  def lookupPrefix(pvarNamespaceURI: Any): Any = js.native
  
  var media: String = js.native
  
  val mimeType: String = js.native
  
  var msCapsLockWarningOff: Boolean = js.native
  
  val nameProp: String = js.native
  
  val namespaceURI: Any = js.native
  
  val namespaces: Any = js.native
  
  val nextSibling: IHTMLDOMNode = js.native
  
  val nodeName: String = js.native
  
  val nodeType: Double = js.native
  
  var nodeValue: Any = js.native
  
  def normalize(): Unit = js.native
  
  var onabort: Any = js.native
  
  var onactivate: Any = js.native
  
  var onafterupdate: Any = js.native
  
  var onbeforeactivate: Any = js.native
  
  var onbeforedeactivate: Any = js.native
  
  var onbeforeeditfocus: Any = js.native
  
  var onbeforeupdate: Any = js.native
  
  var onblur: Any = js.native
  
  var oncanplay: Any = js.native
  
  var oncanplaythrough: Any = js.native
  
  var oncellchange: Any = js.native
  
  var onchange: Any = js.native
  
  var onclick: Any = js.native
  
  var oncontextmenu: Any = js.native
  
  var oncontrolselect: Any = js.native
  
  var ondataavailable: Any = js.native
  
  var ondatasetchanged: Any = js.native
  
  var ondatasetcomplete: Any = js.native
  
  var ondblclick: Any = js.native
  
  var ondeactivate: Any = js.native
  
  var ondrag: Any = js.native
  
  var ondragend: Any = js.native
  
  var ondragenter: Any = js.native
  
  var ondragleave: Any = js.native
  
  var ondragover: Any = js.native
  
  var ondragstart: Any = js.native
  
  var ondrop: Any = js.native
  
  var ondurationchange: Any = js.native
  
  var onemptied: Any = js.native
  
  var onended: Any = js.native
  
  var onerror: Any = js.native
  
  var onerrorupdate: Any = js.native
  
  var onfocus: Any = js.native
  
  var onfocusin: Any = js.native
  
  var onfocusout: Any = js.native
  
  var onhelp: Any = js.native
  
  var oninput: Any = js.native
  
  var onkeydown: Any = js.native
  
  var onkeypress: Any = js.native
  
  var onkeyup: Any = js.native
  
  var onload: Any = js.native
  
  var onloadeddata: Any = js.native
  
  var onloadedmetadata: Any = js.native
  
  var onloadstart: Any = js.native
  
  var onmousedown: Any = js.native
  
  var onmousemove: Any = js.native
  
  var onmouseout: Any = js.native
  
  var onmouseover: Any = js.native
  
  var onmouseup: Any = js.native
  
  var onmousewheel: Any = js.native
  
  var onmscontentzoom: Any = js.native
  
  var onmsgesturechange: Any = js.native
  
  var onmsgesturedoubletap: Any = js.native
  
  var onmsgestureend: Any = js.native
  
  var onmsgesturehold: Any = js.native
  
  var onmsgesturestart: Any = js.native
  
  var onmsgesturetap: Any = js.native
  
  var onmsinertiastart: Any = js.native
  
  var onmsmanipulationstatechanged: Any = js.native
  
  var onmspointercancel: Any = js.native
  
  var onmspointerdown: Any = js.native
  
  var onmspointerhover: Any = js.native
  
  var onmspointermove: Any = js.native
  
  var onmspointerout: Any = js.native
  
  var onmspointerover: Any = js.native
  
  var onmspointerup: Any = js.native
  
  var onmssitemodejumplistitemremoved: Any = js.native
  
  var onmsthumbnailclick: Any = js.native
  
  var onpause: Any = js.native
  
  var onplay: Any = js.native
  
  var onplaying: Any = js.native
  
  var onprogress: Any = js.native
  
  var onpropertychange: Any = js.native
  
  var onratechange: Any = js.native
  
  var onreadystatechange: Any = js.native
  
  var onreset: Any = js.native
  
  var onrowenter: Any = js.native
  
  var onrowexit: Any = js.native
  
  var onrowsdelete: Any = js.native
  
  var onrowsinserted: Any = js.native
  
  var onscroll: Any = js.native
  
  var onseeked: Any = js.native
  
  var onseeking: Any = js.native
  
  var onselect: Any = js.native
  
  var onselectionchange: Any = js.native
  
  var onselectstart: Any = js.native
  
  var onstalled: Any = js.native
  
  var onstop: Any = js.native
  
  var onstorage: Any = js.native
  
  var onstoragecommit: Any = js.native
  
  var onsubmit: Any = js.native
  
  var onsuspend: Any = js.native
  
  var ontimeupdate: Any = js.native
  
  var onvolumechange: Any = js.native
  
  var onwaiting: Any = js.native
  
  /** @param url [url='text/html'] */
  def open(): Any = js.native
  def open(url: String): Any = js.native
  def open(url: String, name: Any): Any = js.native
  def open(url: String, name: Any, features: Any): Any = js.native
  def open(url: String, name: Any, features: Any, replace: Any): Any = js.native
  def open(url: String, name: Any, features: Unit, replace: Any): Any = js.native
  def open(url: String, name: Unit, features: Any): Any = js.native
  def open(url: String, name: Unit, features: Any, replace: Any): Any = js.native
  def open(url: String, name: Unit, features: Unit, replace: Any): Any = js.native
  def open(url: Unit, name: Any): Any = js.native
  def open(url: Unit, name: Any, features: Any): Any = js.native
  def open(url: Unit, name: Any, features: Any, replace: Any): Any = js.native
  def open(url: Unit, name: Any, features: Unit, replace: Any): Any = js.native
  def open(url: Unit, name: Unit, features: Any): Any = js.native
  def open(url: Unit, name: Unit, features: Any, replace: Any): Any = js.native
  def open(url: Unit, name: Unit, features: Unit, replace: Any): Any = js.native
  
  val ownerDocument: Any = js.native
  
  val parentNode: IHTMLDOMNode = js.native
  
  def parentWindow(pvarIndex: Any): Any = js.native
  @JSName("parentWindow")
  val parentWindow_Original: IHTMLWindow2 = js.native
  
  def plugins(): Any = js.native
  def plugins(name: Any): Any = js.native
  def plugins(name: Any, index: Any): Any = js.native
  def plugins(name: Unit, index: Any): Any = js.native
  @JSName("plugins")
  val plugins_Original: IHTMLElementCollection = js.native
  
  var prefix: Any = js.native
  
  val previousSibling: IHTMLDOMNode = js.native
  
  val protocol: String = js.native
  
  def queryCommandEnabled(cmdID: String): Boolean = js.native
  
  def queryCommandIndeterm(cmdID: String): Boolean = js.native
  
  def queryCommandState(cmdID: String): Boolean = js.native
  
  def queryCommandSupported(cmdID: String): Boolean = js.native
  
  def queryCommandText(cmdID: String): String = js.native
  
  def queryCommandValue(cmdID: String): Any = js.native
  
  def querySelector(v: String): IHTMLElement = js.native
  
  def querySelectorAll(v: String): IHTMLDOMChildrenCollection = js.native
  
  val readyState: String = js.native
  
  /** @param fForce [fForce=false] */
  def recalc(): Unit = js.native
  def recalc(fForce: Boolean): Unit = js.native
  
  val referrer: String = js.native
  
  def releaseCapture(): Unit = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def removeEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit = js.native
  
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val rootElement: ISVGSVGElement = js.native
  
  def scripts(): Any = js.native
  def scripts(name: Any): Any = js.native
  def scripts(name: Any, index: Any): Any = js.native
  def scripts(name: Unit, index: Any): Any = js.native
  @JSName("scripts")
  val scripts_Original: IHTMLElementCollection = js.native
  
  val security: String = js.native
  
  val selection: IHTMLSelectionObject = js.native
  
  def styleSheets(pvarIndex: Any): Any = js.native
  @JSName("styleSheets")
  val styleSheets_Original: IHTMLStyleSheetsCollection = js.native
  
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var textContent: Any = js.native
  
  var title: String = js.native
  
  val uniqueID: String = js.native
  
  def updateSettings(): Unit = js.native
  
  var url: String = js.native
  
  var vlinkColor: Any = js.native
  
  def write(psarray: Any*): Unit = js.native
  
  def writeln(psarray: Any*): Unit = js.native
  
  val xmlEncoding: String = js.native
  
  var xmlStandalone: Boolean = js.native
  
  var xmlVersion: String = js.native
}
