package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLElement2")
@js.native
class IHTMLElement2 protected () extends js.Object {
  @JSName("MSHTML.IHTMLElement2_typekey")
  var MSHTMLDotIHTMLElement2_typekey: IHTMLElement2 = js.native
  var accessKey: String = js.native
  val behaviorUrns: js.Any = js.native
  val canHaveChildren: Boolean = js.native
  val clientHeight: Double = js.native
  val clientLeft: Double = js.native
  val clientTop: Double = js.native
  val clientWidth: Double = js.native
  val currentStyle: IHTMLCurrentStyle = js.native
  var dir: String = js.native
  var onbeforecopy: js.Any = js.native
  var onbeforecut: js.Any = js.native
  var onbeforeeditfocus: js.Any = js.native
  var onbeforepaste: js.Any = js.native
  var onblur: js.Any = js.native
  var oncellchange: js.Any = js.native
  var oncontextmenu: js.Any = js.native
  var oncopy: js.Any = js.native
  var oncut: js.Any = js.native
  var ondrag: js.Any = js.native
  var ondragend: js.Any = js.native
  var ondragenter: js.Any = js.native
  var ondragleave: js.Any = js.native
  var ondragover: js.Any = js.native
  var ondrop: js.Any = js.native
  var onfocus: js.Any = js.native
  var onlosecapture: js.Any = js.native
  var onpaste: js.Any = js.native
  var onpropertychange: js.Any = js.native
  var onreadystatechange: js.Any = js.native
  var onresize: js.Any = js.native
  var onrowsdelete: js.Any = js.native
  var onrowsinserted: js.Any = js.native
  var onscroll: js.Any = js.native
  val readyState: js.Any = js.native
  val runtimeStyle: IHTMLStyle = js.native
  val scopeName: String = js.native
  val scrollHeight: Double = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  val scrollWidth: Double = js.native
  var tabIndex: Double = js.native
  var tagUrn: String = js.native
  def addBehavior(bstrURL: String): Double = js.native
  def addBehavior(bstrURL: String, pvarFactory: js.Any): Double = js.native
  def addFilter(pUnk: js.Any): Unit = js.native
  def applyElement(apply: IHTMLElement, where: String): IHTMLElement = js.native
  def attachEvent(event: String, pdisp: js.Any): Boolean = js.native
  def blur(): Unit = js.native
  def clearAttributes(): Unit = js.native
  def componentFromPoint(x: Double, y: Double): String = js.native
  def createControlRange(): js.Any = js.native
  def detachEvent(event: String, pdisp: js.Any): Unit = js.native
  def doScroll(): Unit = js.native
  def doScroll(component: js.Any): Unit = js.native
  def focus(): Unit = js.native
  def getAdjacentText(where: String): String = js.native
  def getBoundingClientRect(): IHTMLRect = js.native
  def getClientRects(): IHTMLRectCollection = js.native
  def getElementsByTagName(v: String): IHTMLElementCollection = js.native
  def getExpression(propname: String): js.Any = js.native
  def insertAdjacentElement(where: String, insertedElement: IHTMLElement): IHTMLElement = js.native
  def mergeAttributes(mergeThis: IHTMLElement): Unit = js.native
  def releaseCapture(): Unit = js.native
  def removeBehavior(cookie: Double): Boolean = js.native
  def removeExpression(propname: String): Boolean = js.native
  def removeFilter(pUnk: js.Any): Unit = js.native
  def replaceAdjacentText(where: String, newText: String): String = js.native
  /** @param containerCapture [containerCapture=true] */
  def setCapture(): Unit = js.native
  def setCapture(containerCapture: Boolean): Unit = js.native
  /** @param language [language=''] */
  def setExpression(propname: String, expression: String): Unit = js.native
  def setExpression(propname: String, expression: String, language: String): Unit = js.native
}

