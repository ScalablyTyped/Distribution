package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLElement2")
@js.native
class IHTMLElement2 protected () extends js.Object {
  var `MSHTML.IHTMLElement2_typekey`: IHTMLElement2 = js.native
  var accessKey: java.lang.String = js.native
  val behaviorUrns: js.Any = js.native
  val canHaveChildren: scala.Boolean = js.native
  val clientHeight: scala.Double = js.native
  val clientLeft: scala.Double = js.native
  val clientTop: scala.Double = js.native
  val clientWidth: scala.Double = js.native
  val currentStyle: IHTMLCurrentStyle = js.native
  var dir: java.lang.String = js.native
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
  val scopeName: java.lang.String = js.native
  val scrollHeight: scala.Double = js.native
  var scrollLeft: scala.Double = js.native
  var scrollTop: scala.Double = js.native
  val scrollWidth: scala.Double = js.native
  var tabIndex: scala.Double = js.native
  var tagUrn: java.lang.String = js.native
  def addBehavior(bstrURL: java.lang.String): scala.Double = js.native
  def addBehavior(bstrURL: java.lang.String, pvarFactory: js.Any): scala.Double = js.native
  def addFilter(pUnk: js.Any): scala.Unit = js.native
  def applyElement(apply: IHTMLElement, where: java.lang.String): IHTMLElement = js.native
  def attachEvent(event: java.lang.String, pdisp: js.Any): scala.Boolean = js.native
  def blur(): scala.Unit = js.native
  def clearAttributes(): scala.Unit = js.native
  def componentFromPoint(x: scala.Double, y: scala.Double): java.lang.String = js.native
  def createControlRange(): js.Any = js.native
  def detachEvent(event: java.lang.String, pdisp: js.Any): scala.Unit = js.native
  def doScroll(): scala.Unit = js.native
  def doScroll(component: js.Any): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getAdjacentText(where: java.lang.String): java.lang.String = js.native
  def getBoundingClientRect(): IHTMLRect = js.native
  def getClientRects(): IHTMLRectCollection = js.native
  def getElementsByTagName(v: java.lang.String): IHTMLElementCollection = js.native
  def getExpression(propname: java.lang.String): js.Any = js.native
  def insertAdjacentElement(where: java.lang.String, insertedElement: IHTMLElement): IHTMLElement = js.native
  def mergeAttributes(mergeThis: IHTMLElement): scala.Unit = js.native
  def releaseCapture(): scala.Unit = js.native
  def removeBehavior(cookie: scala.Double): scala.Boolean = js.native
  def removeExpression(propname: java.lang.String): scala.Boolean = js.native
  def removeFilter(pUnk: js.Any): scala.Unit = js.native
  def replaceAdjacentText(where: java.lang.String, newText: java.lang.String): java.lang.String = js.native
  /** @param containerCapture [containerCapture=true] */
  def setCapture(): scala.Unit = js.native
  /** @param containerCapture [containerCapture=true] */
  def setCapture(containerCapture: scala.Boolean): scala.Unit = js.native
  /** @param language [language=''] */
  def setExpression(propname: java.lang.String, expression: java.lang.String): scala.Unit = js.native
  /** @param language [language=''] */
  def setExpression(propname: java.lang.String, expression: java.lang.String, language: java.lang.String): scala.Unit = js.native
}

