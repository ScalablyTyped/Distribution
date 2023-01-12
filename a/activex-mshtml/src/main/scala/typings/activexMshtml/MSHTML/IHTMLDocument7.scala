package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLDocument7 extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLDocument7_typekey")
  var MSHTMLDotIHTMLDocument7_typekey: IHTMLDocument7
  
  def adoptNode(pNodeSource: IHTMLDOMNode): IHTMLDOMNode3
  
  def all(): Any
  def all(name: Any): Any
  def all(name: Any, index: Any): Any
  def all(name: Unit, index: Any): Any
  @JSName("all")
  val all_Original: IHTMLElementCollection
  
  var body: IHTMLElement
  
  val characterSet: String
  
  def createAttribute(bstrAttrName: String): IHTMLDOMAttribute
  
  def createAttributeNS(pvarNS: Any, bstrAttrName: String): IHTMLDOMAttribute
  
  def createCDATASection(text: String): IHTMLDOMNode
  
  def createElement(bstrTag: String): IHTMLElement
  
  def createElementNS(pvarNS: Any, bstrTag: String): IHTMLElement
  
  def createProcessingInstruction(bstrTarget: String, bstrData: String): IDOMProcessingInstruction
  
  def defaultView(pvarIndex: Any): Any
  @JSName("defaultView")
  val defaultView_Original: IHTMLWindow2
  
  def getElementsByClassName(v: String): IHTMLElementCollection
  
  def getElementsByTagNameNS(pvarNS: Any, bstrLocalName: String): IHTMLElementCollection
  
  def getSelection(): IHTMLSelection
  
  def hasAttributes(): Boolean
  
  val head: IHTMLElement
  
  def importNode(pNodeSource: IHTMLDOMNode, fDeep: Boolean): IHTMLDOMNode3
  
  val inputEncoding: String
  
  def normalize(): Unit
  
  var onabort: Any
  
  var onblur: Any
  
  var oncanplay: Any
  
  var oncanplaythrough: Any
  
  var onchange: Any
  
  var ondrag: Any
  
  var ondragend: Any
  
  var ondragenter: Any
  
  var ondragleave: Any
  
  var ondragover: Any
  
  var ondrop: Any
  
  var ondurationchange: Any
  
  var onemptied: Any
  
  var onended: Any
  
  var onerror: Any
  
  var onfocus: Any
  
  var oninput: Any
  
  var onload: Any
  
  var onloadeddata: Any
  
  var onloadedmetadata: Any
  
  var onloadstart: Any
  
  var onmssitemodejumplistitemremoved: Any
  
  var onmsthumbnailclick: Any
  
  var onpause: Any
  
  var onplay: Any
  
  var onplaying: Any
  
  var onprogress: Any
  
  var onratechange: Any
  
  var onreset: Any
  
  var onscroll: Any
  
  var onseeked: Any
  
  var onseeking: Any
  
  var onselect: Any
  
  var onstalled: Any
  
  var onsubmit: Any
  
  var onsuspend: Any
  
  var ontimeupdate: Any
  
  var onvolumechange: Any
  
  var onwaiting: Any
  
  def parentWindow(pvarIndex: Any): Any
  @JSName("parentWindow")
  val parentWindow_Original: IHTMLWindow2
  
  val xmlEncoding: String
  
  var xmlStandalone: Boolean
  
  var xmlVersion: String
}
object IHTMLDocument7 {
  
  inline def apply(
    MSHTMLDotIHTMLDocument7_typekey: IHTMLDocument7,
    adoptNode: IHTMLDOMNode => IHTMLDOMNode3,
    all: IHTMLElementCollection,
    body: IHTMLElement,
    characterSet: String,
    createAttribute: String => IHTMLDOMAttribute,
    createAttributeNS: (Any, String) => IHTMLDOMAttribute,
    createCDATASection: String => IHTMLDOMNode,
    createElement: String => IHTMLElement,
    createElementNS: (Any, String) => IHTMLElement,
    createProcessingInstruction: (String, String) => IDOMProcessingInstruction,
    defaultView: IHTMLWindow2,
    getElementsByClassName: String => IHTMLElementCollection,
    getElementsByTagNameNS: (Any, String) => IHTMLElementCollection,
    getSelection: () => IHTMLSelection,
    hasAttributes: () => Boolean,
    head: IHTMLElement,
    importNode: (IHTMLDOMNode, Boolean) => IHTMLDOMNode3,
    inputEncoding: String,
    normalize: () => Unit,
    onabort: Any,
    onblur: Any,
    oncanplay: Any,
    oncanplaythrough: Any,
    onchange: Any,
    ondrag: Any,
    ondragend: Any,
    ondragenter: Any,
    ondragleave: Any,
    ondragover: Any,
    ondrop: Any,
    ondurationchange: Any,
    onemptied: Any,
    onended: Any,
    onerror: Any,
    onfocus: Any,
    oninput: Any,
    onload: Any,
    onloadeddata: Any,
    onloadedmetadata: Any,
    onloadstart: Any,
    onmssitemodejumplistitemremoved: Any,
    onmsthumbnailclick: Any,
    onpause: Any,
    onplay: Any,
    onplaying: Any,
    onprogress: Any,
    onratechange: Any,
    onreset: Any,
    onscroll: Any,
    onseeked: Any,
    onseeking: Any,
    onselect: Any,
    onstalled: Any,
    onsubmit: Any,
    onsuspend: Any,
    ontimeupdate: Any,
    onvolumechange: Any,
    onwaiting: Any,
    parentWindow: IHTMLWindow2,
    xmlEncoding: String,
    xmlStandalone: Boolean,
    xmlVersion: String
  ): IHTMLDocument7 = {
    val __obj = js.Dynamic.literal(adoptNode = js.Any.fromFunction1(adoptNode), all = all.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], characterSet = characterSet.asInstanceOf[js.Any], createAttribute = js.Any.fromFunction1(createAttribute), createAttributeNS = js.Any.fromFunction2(createAttributeNS), createCDATASection = js.Any.fromFunction1(createCDATASection), createElement = js.Any.fromFunction1(createElement), createElementNS = js.Any.fromFunction2(createElementNS), createProcessingInstruction = js.Any.fromFunction2(createProcessingInstruction), defaultView = defaultView.asInstanceOf[js.Any], getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getSelection = js.Any.fromFunction0(getSelection), hasAttributes = js.Any.fromFunction0(hasAttributes), head = head.asInstanceOf[js.Any], importNode = js.Any.fromFunction2(importNode), inputEncoding = inputEncoding.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), onabort = onabort.asInstanceOf[js.Any], onblur = onblur.asInstanceOf[js.Any], oncanplay = oncanplay.asInstanceOf[js.Any], oncanplaythrough = oncanplaythrough.asInstanceOf[js.Any], onchange = onchange.asInstanceOf[js.Any], ondrag = ondrag.asInstanceOf[js.Any], ondragend = ondragend.asInstanceOf[js.Any], ondragenter = ondragenter.asInstanceOf[js.Any], ondragleave = ondragleave.asInstanceOf[js.Any], ondragover = ondragover.asInstanceOf[js.Any], ondrop = ondrop.asInstanceOf[js.Any], ondurationchange = ondurationchange.asInstanceOf[js.Any], onemptied = onemptied.asInstanceOf[js.Any], onended = onended.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onfocus = onfocus.asInstanceOf[js.Any], oninput = oninput.asInstanceOf[js.Any], onload = onload.asInstanceOf[js.Any], onloadeddata = onloadeddata.asInstanceOf[js.Any], onloadedmetadata = onloadedmetadata.asInstanceOf[js.Any], onloadstart = onloadstart.asInstanceOf[js.Any], onmssitemodejumplistitemremoved = onmssitemodejumplistitemremoved.asInstanceOf[js.Any], onmsthumbnailclick = onmsthumbnailclick.asInstanceOf[js.Any], onpause = onpause.asInstanceOf[js.Any], onplay = onplay.asInstanceOf[js.Any], onplaying = onplaying.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onratechange = onratechange.asInstanceOf[js.Any], onreset = onreset.asInstanceOf[js.Any], onscroll = onscroll.asInstanceOf[js.Any], onseeked = onseeked.asInstanceOf[js.Any], onseeking = onseeking.asInstanceOf[js.Any], onselect = onselect.asInstanceOf[js.Any], onstalled = onstalled.asInstanceOf[js.Any], onsubmit = onsubmit.asInstanceOf[js.Any], onsuspend = onsuspend.asInstanceOf[js.Any], ontimeupdate = ontimeupdate.asInstanceOf[js.Any], onvolumechange = onvolumechange.asInstanceOf[js.Any], onwaiting = onwaiting.asInstanceOf[js.Any], parentWindow = parentWindow.asInstanceOf[js.Any], xmlEncoding = xmlEncoding.asInstanceOf[js.Any], xmlStandalone = xmlStandalone.asInstanceOf[js.Any], xmlVersion = xmlVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDocument7_typekey")(MSHTMLDotIHTMLDocument7_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDocument7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHTMLDocument7] (val x: Self) extends AnyVal {
    
    inline def setAdoptNode(value: IHTMLDOMNode => IHTMLDOMNode3): Self = StObject.set(x, "adoptNode", js.Any.fromFunction1(value))
    
    inline def setAll(value: IHTMLElementCollection): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setBody(value: IHTMLElement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCharacterSet(value: String): Self = StObject.set(x, "characterSet", value.asInstanceOf[js.Any])
    
    inline def setCreateAttribute(value: String => IHTMLDOMAttribute): Self = StObject.set(x, "createAttribute", js.Any.fromFunction1(value))
    
    inline def setCreateAttributeNS(value: (Any, String) => IHTMLDOMAttribute): Self = StObject.set(x, "createAttributeNS", js.Any.fromFunction2(value))
    
    inline def setCreateCDATASection(value: String => IHTMLDOMNode): Self = StObject.set(x, "createCDATASection", js.Any.fromFunction1(value))
    
    inline def setCreateElement(value: String => IHTMLElement): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
    
    inline def setCreateElementNS(value: (Any, String) => IHTMLElement): Self = StObject.set(x, "createElementNS", js.Any.fromFunction2(value))
    
    inline def setCreateProcessingInstruction(value: (String, String) => IDOMProcessingInstruction): Self = StObject.set(x, "createProcessingInstruction", js.Any.fromFunction2(value))
    
    inline def setDefaultView(value: IHTMLWindow2): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
    
    inline def setGetElementsByClassName(value: String => IHTMLElementCollection): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
    
    inline def setGetElementsByTagNameNS(value: (Any, String) => IHTMLElementCollection): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    inline def setGetSelection(value: () => IHTMLSelection): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    inline def setHasAttributes(value: () => Boolean): Self = StObject.set(x, "hasAttributes", js.Any.fromFunction0(value))
    
    inline def setHead(value: IHTMLElement): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setImportNode(value: (IHTMLDOMNode, Boolean) => IHTMLDOMNode3): Self = StObject.set(x, "importNode", js.Any.fromFunction2(value))
    
    inline def setInputEncoding(value: String): Self = StObject.set(x, "inputEncoding", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLDocument7_typekey(value: IHTMLDocument7): Self = StObject.set(x, "MSHTML.IHTMLDocument7_typekey", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    inline def setOnabort(value: Any): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
    
    inline def setOnblur(value: Any): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
    
    inline def setOncanplay(value: Any): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
    
    inline def setOncanplaythrough(value: Any): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
    
    inline def setOnchange(value: Any): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
    
    inline def setOndrag(value: Any): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
    
    inline def setOndragend(value: Any): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
    
    inline def setOndragenter(value: Any): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
    
    inline def setOndragleave(value: Any): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
    
    inline def setOndragover(value: Any): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
    
    inline def setOndrop(value: Any): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
    
    inline def setOndurationchange(value: Any): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
    
    inline def setOnemptied(value: Any): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
    
    inline def setOnended(value: Any): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
    
    inline def setOnerror(value: Any): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnfocus(value: Any): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
    
    inline def setOninput(value: Any): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
    
    inline def setOnload(value: Any): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
    
    inline def setOnloadeddata(value: Any): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
    
    inline def setOnloadedmetadata(value: Any): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
    
    inline def setOnloadstart(value: Any): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
    
    inline def setOnmssitemodejumplistitemremoved(value: Any): Self = StObject.set(x, "onmssitemodejumplistitemremoved", value.asInstanceOf[js.Any])
    
    inline def setOnmsthumbnailclick(value: Any): Self = StObject.set(x, "onmsthumbnailclick", value.asInstanceOf[js.Any])
    
    inline def setOnpause(value: Any): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
    
    inline def setOnplay(value: Any): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
    
    inline def setOnplaying(value: Any): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
    
    inline def setOnprogress(value: Any): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    inline def setOnratechange(value: Any): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
    
    inline def setOnreset(value: Any): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
    
    inline def setOnscroll(value: Any): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
    
    inline def setOnseeked(value: Any): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
    
    inline def setOnseeking(value: Any): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
    
    inline def setOnselect(value: Any): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
    
    inline def setOnstalled(value: Any): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
    
    inline def setOnsubmit(value: Any): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
    
    inline def setOnsuspend(value: Any): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
    
    inline def setOntimeupdate(value: Any): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
    
    inline def setOnvolumechange(value: Any): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
    
    inline def setOnwaiting(value: Any): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
    
    inline def setParentWindow(value: IHTMLWindow2): Self = StObject.set(x, "parentWindow", value.asInstanceOf[js.Any])
    
    inline def setXmlEncoding(value: String): Self = StObject.set(x, "xmlEncoding", value.asInstanceOf[js.Any])
    
    inline def setXmlStandalone(value: Boolean): Self = StObject.set(x, "xmlStandalone", value.asInstanceOf[js.Any])
    
    inline def setXmlVersion(value: String): Self = StObject.set(x, "xmlVersion", value.asInstanceOf[js.Any])
  }
}
