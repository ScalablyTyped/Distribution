package typings.activexDashMshtml.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLDocument7")
@js.native
class IHTMLDocument7 protected () extends js.Object {
  var `MSHTML.IHTMLDocument7_typekey`: IHTMLDocument7 = js.native
  @JSName("all")
  val all_Original: IHTMLElementCollection = js.native
  var body: IHTMLElement = js.native
  val characterSet: String = js.native
  @JSName("defaultView")
  val defaultView_Original: IHTMLWindow2 = js.native
  val head: IHTMLElement = js.native
  val inputEncoding: String = js.native
  var onabort: js.Any = js.native
  var onblur: js.Any = js.native
  var oncanplay: js.Any = js.native
  var oncanplaythrough: js.Any = js.native
  var onchange: js.Any = js.native
  var ondrag: js.Any = js.native
  var ondragend: js.Any = js.native
  var ondragenter: js.Any = js.native
  var ondragleave: js.Any = js.native
  var ondragover: js.Any = js.native
  var ondrop: js.Any = js.native
  var ondurationchange: js.Any = js.native
  var onemptied: js.Any = js.native
  var onended: js.Any = js.native
  var onerror: js.Any = js.native
  var onfocus: js.Any = js.native
  var oninput: js.Any = js.native
  var onload: js.Any = js.native
  var onloadeddata: js.Any = js.native
  var onloadedmetadata: js.Any = js.native
  var onloadstart: js.Any = js.native
  var onmssitemodejumplistitemremoved: js.Any = js.native
  var onmsthumbnailclick: js.Any = js.native
  var onpause: js.Any = js.native
  var onplay: js.Any = js.native
  var onplaying: js.Any = js.native
  var onprogress: js.Any = js.native
  var onratechange: js.Any = js.native
  var onreset: js.Any = js.native
  var onscroll: js.Any = js.native
  var onseeked: js.Any = js.native
  var onseeking: js.Any = js.native
  var onselect: js.Any = js.native
  var onstalled: js.Any = js.native
  var onsubmit: js.Any = js.native
  var onsuspend: js.Any = js.native
  var ontimeupdate: js.Any = js.native
  var onvolumechange: js.Any = js.native
  var onwaiting: js.Any = js.native
  @JSName("parentWindow")
  val parentWindow_Original: IHTMLWindow2 = js.native
  val xmlEncoding: String = js.native
  var xmlStandalone: Boolean = js.native
  var xmlVersion: String = js.native
  def adoptNode(pNodeSource: IHTMLDOMNode): IHTMLDOMNode3 = js.native
  def all(): js.Any = js.native
  def all(name: js.Any): js.Any = js.native
  def all(name: js.Any, index: js.Any): js.Any = js.native
  def createAttribute(bstrAttrName: String): IHTMLDOMAttribute = js.native
  def createAttributeNS(pvarNS: js.Any, bstrAttrName: String): IHTMLDOMAttribute = js.native
  def createCDATASection(text: String): IHTMLDOMNode = js.native
  def createElement(bstrTag: String): IHTMLElement = js.native
  def createElementNS(pvarNS: js.Any, bstrTag: String): IHTMLElement = js.native
  def createProcessingInstruction(bstrTarget: String, bstrData: String): IDOMProcessingInstruction = js.native
  def defaultView(pvarIndex: js.Any): js.Any = js.native
  def getElementsByClassName(v: String): IHTMLElementCollection = js.native
  def getElementsByTagNameNS(pvarNS: js.Any, bstrLocalName: String): IHTMLElementCollection = js.native
  def getSelection(): IHTMLSelection = js.native
  def hasAttributes(): Boolean = js.native
  def importNode(pNodeSource: IHTMLDOMNode, fDeep: Boolean): IHTMLDOMNode3 = js.native
  def normalize(): Unit = js.native
  def parentWindow(pvarIndex: js.Any): js.Any = js.native
}

