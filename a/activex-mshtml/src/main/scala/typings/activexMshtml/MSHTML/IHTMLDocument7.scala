package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLDocument7 extends StObject {
  
  @JSName("MSHTML.IHTMLDocument7_typekey")
  var MSHTMLDotIHTMLDocument7_typekey: IHTMLDocument7
  
  def adoptNode(pNodeSource: IHTMLDOMNode): IHTMLDOMNode3
  
  def all(): js.Any
  def all(name: js.Any): js.Any
  def all(name: js.Any, index: js.Any): js.Any
  def all(name: Unit, index: js.Any): js.Any
  @JSName("all")
  val all_Original: IHTMLElementCollection
  
  var body: IHTMLElement
  
  val characterSet: String
  
  def createAttribute(bstrAttrName: String): IHTMLDOMAttribute
  
  def createAttributeNS(pvarNS: js.Any, bstrAttrName: String): IHTMLDOMAttribute
  
  def createCDATASection(text: String): IHTMLDOMNode
  
  def createElement(bstrTag: String): IHTMLElement
  
  def createElementNS(pvarNS: js.Any, bstrTag: String): IHTMLElement
  
  def createProcessingInstruction(bstrTarget: String, bstrData: String): IDOMProcessingInstruction
  
  def defaultView(pvarIndex: js.Any): js.Any
  @JSName("defaultView")
  val defaultView_Original: IHTMLWindow2
  
  def getElementsByClassName(v: String): IHTMLElementCollection
  
  def getElementsByTagNameNS(pvarNS: js.Any, bstrLocalName: String): IHTMLElementCollection
  
  def getSelection(): IHTMLSelection
  
  def hasAttributes(): Boolean
  
  val head: IHTMLElement
  
  def importNode(pNodeSource: IHTMLDOMNode, fDeep: Boolean): IHTMLDOMNode3
  
  val inputEncoding: String
  
  def normalize(): Unit
  
  var onabort: js.Any
  
  var onblur: js.Any
  
  var oncanplay: js.Any
  
  var oncanplaythrough: js.Any
  
  var onchange: js.Any
  
  var ondrag: js.Any
  
  var ondragend: js.Any
  
  var ondragenter: js.Any
  
  var ondragleave: js.Any
  
  var ondragover: js.Any
  
  var ondrop: js.Any
  
  var ondurationchange: js.Any
  
  var onemptied: js.Any
  
  var onended: js.Any
  
  var onerror: js.Any
  
  var onfocus: js.Any
  
  var oninput: js.Any
  
  var onload: js.Any
  
  var onloadeddata: js.Any
  
  var onloadedmetadata: js.Any
  
  var onloadstart: js.Any
  
  var onmssitemodejumplistitemremoved: js.Any
  
  var onmsthumbnailclick: js.Any
  
  var onpause: js.Any
  
  var onplay: js.Any
  
  var onplaying: js.Any
  
  var onprogress: js.Any
  
  var onratechange: js.Any
  
  var onreset: js.Any
  
  var onscroll: js.Any
  
  var onseeked: js.Any
  
  var onseeking: js.Any
  
  var onselect: js.Any
  
  var onstalled: js.Any
  
  var onsubmit: js.Any
  
  var onsuspend: js.Any
  
  var ontimeupdate: js.Any
  
  var onvolumechange: js.Any
  
  var onwaiting: js.Any
  
  def parentWindow(pvarIndex: js.Any): js.Any
  @JSName("parentWindow")
  val parentWindow_Original: IHTMLWindow2
  
  val xmlEncoding: String
  
  var xmlStandalone: Boolean
  
  var xmlVersion: String
}
object IHTMLDocument7 {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDocument7_typekey: IHTMLDocument7,
    adoptNode: IHTMLDOMNode => IHTMLDOMNode3,
    all: IHTMLElementCollection,
    body: IHTMLElement,
    characterSet: String,
    createAttribute: String => IHTMLDOMAttribute,
    createAttributeNS: (js.Any, String) => IHTMLDOMAttribute,
    createCDATASection: String => IHTMLDOMNode,
    createElement: String => IHTMLElement,
    createElementNS: (js.Any, String) => IHTMLElement,
    createProcessingInstruction: (String, String) => IDOMProcessingInstruction,
    defaultView: IHTMLWindow2,
    getElementsByClassName: String => IHTMLElementCollection,
    getElementsByTagNameNS: (js.Any, String) => IHTMLElementCollection,
    getSelection: () => IHTMLSelection,
    hasAttributes: () => Boolean,
    head: IHTMLElement,
    importNode: (IHTMLDOMNode, Boolean) => IHTMLDOMNode3,
    inputEncoding: String,
    normalize: () => Unit,
    onabort: js.Any,
    onblur: js.Any,
    oncanplay: js.Any,
    oncanplaythrough: js.Any,
    onchange: js.Any,
    ondrag: js.Any,
    ondragend: js.Any,
    ondragenter: js.Any,
    ondragleave: js.Any,
    ondragover: js.Any,
    ondrop: js.Any,
    ondurationchange: js.Any,
    onemptied: js.Any,
    onended: js.Any,
    onerror: js.Any,
    onfocus: js.Any,
    oninput: js.Any,
    onload: js.Any,
    onloadeddata: js.Any,
    onloadedmetadata: js.Any,
    onloadstart: js.Any,
    onmssitemodejumplistitemremoved: js.Any,
    onmsthumbnailclick: js.Any,
    onpause: js.Any,
    onplay: js.Any,
    onplaying: js.Any,
    onprogress: js.Any,
    onratechange: js.Any,
    onreset: js.Any,
    onscroll: js.Any,
    onseeked: js.Any,
    onseeking: js.Any,
    onselect: js.Any,
    onstalled: js.Any,
    onsubmit: js.Any,
    onsuspend: js.Any,
    ontimeupdate: js.Any,
    onvolumechange: js.Any,
    onwaiting: js.Any,
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
  implicit class IHTMLDocument7MutableBuilder[Self <: IHTMLDocument7] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdoptNode(value: IHTMLDOMNode => IHTMLDOMNode3): Self = StObject.set(x, "adoptNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAll(value: IHTMLElementCollection): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: IHTMLElement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterSet(value: String): Self = StObject.set(x, "characterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAttribute(value: String => IHTMLDOMAttribute): Self = StObject.set(x, "createAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAttributeNS(value: (js.Any, String) => IHTMLDOMAttribute): Self = StObject.set(x, "createAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateCDATASection(value: String => IHTMLDOMNode): Self = StObject.set(x, "createCDATASection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElement(value: String => IHTMLElement): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElementNS(value: (js.Any, String) => IHTMLElement): Self = StObject.set(x, "createElementNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateProcessingInstruction(value: (String, String) => IDOMProcessingInstruction): Self = StObject.set(x, "createProcessingInstruction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefaultView(value: IHTMLWindow2): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetElementsByClassName(value: String => IHTMLElementCollection): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagNameNS(value: (js.Any, String) => IHTMLElementCollection): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSelection(value: () => IHTMLSelection): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAttributes(value: () => Boolean): Self = StObject.set(x, "hasAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHead(value: IHTMLElement): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportNode(value: (IHTMLDOMNode, Boolean) => IHTMLDOMNode3): Self = StObject.set(x, "importNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInputEncoding(value: String): Self = StObject.set(x, "inputEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLDocument7_typekey(value: IHTMLDocument7): Self = StObject.set(x, "MSHTML.IHTMLDocument7_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnabort(value: js.Any): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnblur(value: js.Any): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncanplay(value: js.Any): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncanplaythrough(value: js.Any): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnchange(value: js.Any): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndrag(value: js.Any): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragend(value: js.Any): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragenter(value: js.Any): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragleave(value: js.Any): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragover(value: js.Any): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndrop(value: js.Any): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndurationchange(value: js.Any): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnemptied(value: js.Any): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnended(value: js.Any): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: js.Any): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfocus(value: js.Any): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOninput(value: js.Any): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnload(value: js.Any): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadeddata(value: js.Any): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadedmetadata(value: js.Any): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadstart(value: js.Any): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmssitemodejumplistitemremoved(value: js.Any): Self = StObject.set(x, "onmssitemodejumplistitemremoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmsthumbnailclick(value: js.Any): Self = StObject.set(x, "onmsthumbnailclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpause(value: js.Any): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnplay(value: js.Any): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnplaying(value: js.Any): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprogress(value: js.Any): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnratechange(value: js.Any): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnreset(value: js.Any): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnscroll(value: js.Any): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnseeked(value: js.Any): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnseeking(value: js.Any): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselect(value: js.Any): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstalled(value: js.Any): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsubmit(value: js.Any): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsuspend(value: js.Any): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntimeupdate(value: js.Any): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnvolumechange(value: js.Any): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnwaiting(value: js.Any): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentWindow(value: IHTMLWindow2): Self = StObject.set(x, "parentWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlEncoding(value: String): Self = StObject.set(x, "xmlEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlStandalone(value: Boolean): Self = StObject.set(x, "xmlStandalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlVersion(value: String): Self = StObject.set(x, "xmlVersion", value.asInstanceOf[js.Any])
  }
}
