package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLMediaElement extends StObject {
  
  def FireEvent(bstrEventName: String): Boolean = js.native
  def FireEvent(bstrEventName: String, pvarEventObject: Any): Boolean = js.native
  
  /* private */ @JSName("MSHTML.HTMLMediaElement_typekey")
  var MSHTMLDotHTMLMediaElement_typekey: HTMLMediaElement = js.native
  
  var accessKey: String = js.native
  
  def addBehavior(bstrURL: String): Double = js.native
  def addBehavior(bstrURL: String, pvarFactory: Any): Double = js.native
  
  def addFilter(pUnk: Any): Unit = js.native
  
  val all: Any = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def applyElement(apply: IHTMLElement, where: String): IHTMLElement = js.native
  
  var ariaActivedescendant: String = js.native
  
  var ariaBusy: String = js.native
  
  var ariaChecked: String = js.native
  
  var ariaControls: String = js.native
  
  var ariaDescribedby: String = js.native
  
  var ariaDisabled: String = js.native
  
  var ariaExpanded: String = js.native
  
  var ariaFlowto: String = js.native
  
  var ariaHaspopup: String = js.native
  
  var ariaHidden: String = js.native
  
  var ariaInvalid: String = js.native
  
  var ariaLabelledby: String = js.native
  
  var ariaLevel: Double = js.native
  
  var ariaLive: String = js.native
  
  var ariaMultiselectable: String = js.native
  
  var ariaOwns: String = js.native
  
  var ariaPosinset: Double = js.native
  
  var ariaPressed: String = js.native
  
  var ariaReadonly: String = js.native
  
  var ariaRelevant: String = js.native
  
  var ariaRequired: String = js.native
  
  var ariaSecret: String = js.native
  
  var ariaSelected: String = js.native
  
  var ariaSetsize: Double = js.native
  
  var ariaValuemax: String = js.native
  
  var ariaValuemin: String = js.native
  
  var ariaValuenow: String = js.native
  
  def attachEvent(event: String, pdisp: Any): Boolean = js.native
  
  val attributes: Any = js.native
  
  var autobuffer: Boolean = js.native
  
  var autoplay: Boolean = js.native
  
  val behaviorUrns: Any = js.native
  
  def blur(): Unit = js.native
  
  val buffered: IHTMLTimeRanges = js.native
  
  val canHaveChildren: Boolean = js.native
  
  val canHaveHTML: Boolean = js.native
  
  def canPlayType(`type`: String): String = js.native
  
  val childNodes: Any = js.native
  
  val children: Any = js.native
  
  var className: String = js.native
  
  def clearAttributes(): Unit = js.native
  
  def click(): Unit = js.native
  
  val clientHeight: Double = js.native
  
  val clientLeft: Double = js.native
  
  val clientTop: Double = js.native
  
  val clientWidth: Double = js.native
  
  def cloneNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def compareDocumentPosition(otherNode: IHTMLDOMNode): Double = js.native
  
  def componentFromPoint(x: Double, y: Double): String = js.native
  
  val constructor: Any = js.native
  
  def contains(pChild: IHTMLElement): Boolean = js.native
  
  var contentEditable: String = js.native
  
  var controls: Boolean = js.native
  
  def createControlRange(): Any = js.native
  
  val currentSrc: String = js.native
  
  val currentStyle: IHTMLCurrentStyle = js.native
  
  var currentTime: Double = js.native
  
  var currentTimeDouble: Double = js.native
  
  var dataFld: String = js.native
  
  var dataFormatAs: String = js.native
  
  var dataSrc: String = js.native
  
  var defaultPlaybackRate: Double = js.native
  
  var defaultPlaybackRateDouble: Double = js.native
  
  def detachEvent(event: String, pdisp: Any): Unit = js.native
  
  var dir: String = js.native
  
  var disabled: Boolean = js.native
  
  def doScroll(): Unit = js.native
  def doScroll(component: Any): Unit = js.native
  
  val document: Any = js.native
  
  def dragDrop(): Boolean = js.native
  
  val duration: Double = js.native
  
  val durationDouble: Double = js.native
  
  val ended: Boolean = js.native
  
  val error: IHTMLMediaError = js.native
  
  def filters(pvarIndex: Any): Any = js.native
  @JSName("filters")
  val filters_Original: IHTMLFiltersCollection = js.native
  
  val firstChild: IHTMLDOMNode = js.native
  
  def focus(): Unit = js.native
  
  def getAdjacentText(where: String): String = js.native
  
  /** @param lFlags [lFlags=0] */
  def getAttribute(strAttributeName: String): Any = js.native
  def getAttribute(strAttributeName: String, lFlags: Double): Any = js.native
  
  def getAttributeNS(pvarNS: Any, strAttributeName: String): Any = js.native
  
  def getAttributeNode(bstrName: String): IHTMLDOMAttribute = js.native
  
  def getAttributeNodeNS(pvarNS: Any, bstrName: String): IHTMLDOMAttribute2 = js.native
  
  def getBoundingClientRect(): IHTMLRect = js.native
  
  def getClientRects(): IHTMLRectCollection = js.native
  
  def getElementsByClassName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByTagName(v: String): IHTMLElementCollection = js.native
  
  def getElementsByTagNameNS(varNS: Any, bstrLocalName: String): IHTMLElementCollection = js.native
  
  def getExpression(propname: String): Any = js.native
  
  def hasAttribute(name: String): Boolean = js.native
  
  def hasAttributeNS(pvarNS: Any, name: String): Boolean = js.native
  
  def hasAttributes(): Boolean = js.native
  
  def hasChildNodes(): Boolean = js.native
  
  var hideFocus: Boolean = js.native
  
  var id: String = js.native
  
  val ie8_attributes: IHTMLAttributeCollection3 = js.native
  
  def ie8_getAttribute(strAttributeName: String): Any = js.native
  
  def ie8_getAttributeNode(bstrName: String): IHTMLDOMAttribute2 = js.native
  
  def ie8_removeAttribute(strAttributeName: String): Boolean = js.native
  
  def ie8_removeAttributeNode(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  def ie8_setAttribute(strAttributeName: String, AttributeValue: Any): Unit = js.native
  
  def ie8_setAttributeNode(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_getAttribute(strAttributeName: String): Any = js.native
  
  def ie9_getAttributeNode(strAttributeName: String): IHTMLDOMAttribute2 = js.native
  
  def ie9_hasAttribute(name: String): Boolean = js.native
  
  def ie9_hasAttributes(): Boolean = js.native
  
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: Any): IHTMLDOMNode = js.native
  
  val ie9_nodeName: String = js.native
  
  def ie9_removeAttribute(strAttributeName: String): Unit = js.native
  
  def ie9_removeAttributeNode(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_setAttribute(strAttributeName: String, pvarAttributeValue: Any): Unit = js.native
  
  def ie9_setAttributeNode(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  val ie9_tagName: String = js.native
  
  val initialTime: Double = js.native
  
  val initialTimeDouble: Double = js.native
  
  var innerHTML: String = js.native
  
  var innerText: String = js.native
  
  def insertAdjacentElement(where: String, insertedElement: IHTMLElement): IHTMLElement = js.native
  
  def insertAdjacentHTML(where: String, html: String): Unit = js.native
  
  def insertAdjacentText(where: String, text: String): Unit = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: Any): IHTMLDOMNode = js.native
  
  val isContentEditable: Boolean = js.native
  
  def isDefaultNamespace(pvarNamespace: Any): Boolean = js.native
  
  val isDisabled: Boolean = js.native
  
  def isEqualNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  val isMultiLine: Boolean = js.native
  
  def isSameNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSupported(feature: String, version: Any): Boolean = js.native
  
  val isTextEdit: Boolean = js.native
  
  var lang: String = js.native
  
  var language: String = js.native
  
  val lastChild: IHTMLDOMNode = js.native
  
  def load(): Unit = js.native
  
  val localName: Any = js.native
  
  def lookupNamespaceURI(pvarPrefix: Any): Any = js.native
  
  def lookupPrefix(pvarNamespaceURI: Any): Any = js.native
  
  var loop: Boolean = js.native
  
  def mergeAttributes(mergeThis: IHTMLElement): Unit = js.native
  def mergeAttributes(mergeThis: IHTMLElement, pvarFlags: Any): Unit = js.native
  
  def msMatchesSelector(v: String): Boolean = js.native
  
  var msPlayToDisabled: Boolean = js.native
  
  var msPlayToPrimary: Boolean = js.native
  
  def msReleasePointerCapture(pointerId: Double): Unit = js.native
  
  def msSetPointerCapture(pointerId: Double): Unit = js.native
  
  var muted: Boolean = js.native
  
  val namespaceURI: Any = js.native
  
  val networkState: Double = js.native
  
  val nextSibling: IHTMLDOMNode = js.native
  
  val nodeName: String = js.native
  
  val nodeType: Double = js.native
  
  var nodeValue: Any = js.native
  
  def normalize(): Unit = js.native
  
  val offsetHeight: Double = js.native
  
  val offsetLeft: Double = js.native
  
  val offsetParent: IHTMLElement = js.native
  
  val offsetTop: Double = js.native
  
  val offsetWidth: Double = js.native
  
  var onabort: Any = js.native
  
  var onactivate: Any = js.native
  
  var onafterupdate: Any = js.native
  
  var onbeforeactivate: Any = js.native
  
  var onbeforecopy: Any = js.native
  
  var onbeforecut: Any = js.native
  
  var onbeforedeactivate: Any = js.native
  
  var onbeforeeditfocus: Any = js.native
  
  var onbeforepaste: Any = js.native
  
  var onbeforeupdate: Any = js.native
  
  var onblur: Any = js.native
  
  var oncanplay: Any = js.native
  
  var oncanplaythrough: Any = js.native
  
  var oncellchange: Any = js.native
  
  var onchange: Any = js.native
  
  var onclick: Any = js.native
  
  var oncontextmenu: Any = js.native
  
  var oncontrolselect: Any = js.native
  
  var oncopy: Any = js.native
  
  var oncuechange: Any = js.native
  
  var oncut: Any = js.native
  
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
  
  var onfilterchange: Any = js.native
  
  var onfocus: Any = js.native
  
  var onfocusin: Any = js.native
  
  var onfocusout: Any = js.native
  
  var onhelp: Any = js.native
  
  var oninput: Any = js.native
  
  var oninvalid: Any = js.native
  
  var onkeydown: Any = js.native
  
  var onkeypress: Any = js.native
  
  var onkeyup: Any = js.native
  
  var onlayoutcomplete: Any = js.native
  
  var onload: Any = js.native
  
  var onloadeddata: Any = js.native
  
  var onloadedmetadata: Any = js.native
  
  var onloadstart: Any = js.native
  
  var onlosecapture: Any = js.native
  
  var onmousedown: Any = js.native
  
  var onmouseenter: Any = js.native
  
  var onmouseleave: Any = js.native
  
  var onmousemove: Any = js.native
  
  var onmouseout: Any = js.native
  
  var onmouseover: Any = js.native
  
  var onmouseup: Any = js.native
  
  var onmousewheel: Any = js.native
  
  var onmove: Any = js.native
  
  var onmoveend: Any = js.native
  
  var onmovestart: Any = js.native
  
  var onmsanimationend: Any = js.native
  
  var onmsanimationiteration: Any = js.native
  
  var onmsanimationstart: Any = js.native
  
  var onmsgesturechange: Any = js.native
  
  var onmsgesturedoubletap: Any = js.native
  
  var onmsgestureend: Any = js.native
  
  var onmsgesturehold: Any = js.native
  
  var onmsgesturestart: Any = js.native
  
  var onmsgesturetap: Any = js.native
  
  var onmsgotpointercapture: Any = js.native
  
  var onmsinertiastart: Any = js.native
  
  var onmslostpointercapture: Any = js.native
  
  var onmsmanipulationstatechanged: Any = js.native
  
  var onmspointercancel: Any = js.native
  
  var onmspointerdown: Any = js.native
  
  var onmspointerhover: Any = js.native
  
  var onmspointermove: Any = js.native
  
  var onmspointerout: Any = js.native
  
  var onmspointerover: Any = js.native
  
  var onmspointerup: Any = js.native
  
  var onmstransitionend: Any = js.native
  
  var onmstransitionstart: Any = js.native
  
  var onpage: Any = js.native
  
  var onpaste: Any = js.native
  
  var onpause: Any = js.native
  
  var onplay: Any = js.native
  
  var onplaying: Any = js.native
  
  var onprogress: Any = js.native
  
  var onpropertychange: Any = js.native
  
  var onratechange: Any = js.native
  
  var onreadystatechange: Any = js.native
  
  var onreset: Any = js.native
  
  var onresize: Any = js.native
  
  var onresizeend: Any = js.native
  
  var onresizestart: Any = js.native
  
  var onrowenter: Any = js.native
  
  var onrowexit: Any = js.native
  
  var onrowsdelete: Any = js.native
  
  var onrowsinserted: Any = js.native
  
  var onscroll: Any = js.native
  
  var onseeked: Any = js.native
  
  var onseeking: Any = js.native
  
  var onselect: Any = js.native
  
  var onselectstart: Any = js.native
  
  var onstalled: Any = js.native
  
  var onsubmit: Any = js.native
  
  var onsuspend: Any = js.native
  
  var ontimeupdate: Any = js.native
  
  var onvolumechange: Any = js.native
  
  var onwaiting: Any = js.native
  
  var outerHTML: String = js.native
  
  var outerText: String = js.native
  
  val ownerDocument: Any = js.native
  
  val parentElement: IHTMLElement = js.native
  
  val parentNode: IHTMLDOMNode = js.native
  
  val parentTextEdit: IHTMLElement = js.native
  
  def pause(): Unit = js.native
  
  val paused: Boolean = js.native
  
  def play(): Unit = js.native
  
  var playbackRate: Double = js.native
  
  var playbackRateDouble: Double = js.native
  
  val played: IHTMLTimeRanges = js.native
  
  var prefix: Any = js.native
  
  var preload: String = js.native
  
  val previousSibling: IHTMLDOMNode = js.native
  
  def querySelector(v: String): IHTMLElement = js.native
  
  def querySelectorAll(v: String): IHTMLDOMChildrenCollection = js.native
  
  val readyState: Any = js.native
  
  val recordNumber: Any = js.native
  
  def releaseCapture(): Unit = js.native
  
  /** @param lFlags [lFlags=1] */
  def removeAttribute(strAttributeName: String): Boolean = js.native
  def removeAttribute(strAttributeName: String, lFlags: Double): Boolean = js.native
  
  def removeAttributeNS(pvarNS: Any, strAttributeName: String): Unit = js.native
  
  def removeAttributeNode(pattr: IHTMLDOMAttribute): IHTMLDOMAttribute = js.native
  
  def removeBehavior(cookie: Double): Boolean = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def removeExpression(propname: String): Boolean = js.native
  
  def removeFilter(pUnk: Any): Unit = js.native
  
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def replaceAdjacentText(where: String, newText: String): String = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var role: String = js.native
  
  val runtimeStyle: IHTMLStyle = js.native
  
  val scopeName: String = js.native
  
  val scrollHeight: Double = js.native
  
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(varargStart: Any): Unit = js.native
  
  var scrollLeft: Double = js.native
  
  var scrollTop: Double = js.native
  
  val scrollWidth: Double = js.native
  
  val seekable: IHTMLTimeRanges = js.native
  
  val seeking: Boolean = js.native
  
  def setActive(): Unit = js.native
  
  /** @param lFlags [lFlags=1] */
  def setAttribute(strAttributeName: String, AttributeValue: Any): Unit = js.native
  def setAttribute(strAttributeName: String, AttributeValue: Any, lFlags: Double): Unit = js.native
  
  def setAttributeNS(pvarNS: Any, strAttributeName: String, pvarAttributeValue: Any): Unit = js.native
  
  def setAttributeNode(pattr: IHTMLDOMAttribute): IHTMLDOMAttribute = js.native
  
  def setAttributeNodeNS(pattr: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  
  /** @param containerCapture [containerCapture=true] */
  def setCapture(): Unit = js.native
  def setCapture(containerCapture: Boolean): Unit = js.native
  
  /** @param language [language=''] */
  def setExpression(propname: String, expression: String): Unit = js.native
  def setExpression(propname: String, expression: String, language: String): Unit = js.native
  
  val sourceIndex: Double = js.native
  
  var spellcheck: Any = js.native
  
  var src: String = js.native
  
  val style: IHTMLStyle = js.native
  
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var tabIndex: Double = js.native
  
  val tagName: String = js.native
  
  var tagUrn: String = js.native
  
  var textContent: Any = js.native
  
  var title: String = js.native
  
  val uniqueID: String = js.native
  
  val uniqueNumber: Double = js.native
  
  var volume: Double = js.native
  
  var volumeDouble: Double = js.native
  
  var xmsAcceleratorKey: String = js.native
}
