package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLElement2 extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLElement2_typekey")
  var MSHTMLDotIHTMLElement2_typekey: IHTMLElement2 = js.native
  
  var accessKey: String = js.native
  
  def addBehavior(bstrURL: String): Double = js.native
  def addBehavior(bstrURL: String, pvarFactory: Any): Double = js.native
  
  def addFilter(pUnk: Any): Unit = js.native
  
  def applyElement(apply: IHTMLElement, where: String): IHTMLElement = js.native
  
  def attachEvent(event: String, pdisp: Any): Boolean = js.native
  
  val behaviorUrns: Any = js.native
  
  def blur(): Unit = js.native
  
  val canHaveChildren: Boolean = js.native
  
  def clearAttributes(): Unit = js.native
  
  val clientHeight: Double = js.native
  
  val clientLeft: Double = js.native
  
  val clientTop: Double = js.native
  
  val clientWidth: Double = js.native
  
  def componentFromPoint(x: Double, y: Double): String = js.native
  
  def createControlRange(): Any = js.native
  
  val currentStyle: IHTMLCurrentStyle = js.native
  
  def detachEvent(event: String, pdisp: Any): Unit = js.native
  
  var dir: String = js.native
  
  def doScroll(): Unit = js.native
  def doScroll(component: Any): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getAdjacentText(where: String): String = js.native
  
  def getBoundingClientRect(): IHTMLRect = js.native
  
  def getClientRects(): IHTMLRectCollection = js.native
  
  def getElementsByTagName(v: String): IHTMLElementCollection = js.native
  
  def getExpression(propname: String): Any = js.native
  
  def insertAdjacentElement(where: String, insertedElement: IHTMLElement): IHTMLElement = js.native
  
  def mergeAttributes(mergeThis: IHTMLElement): Unit = js.native
  
  var onbeforecopy: Any = js.native
  
  var onbeforecut: Any = js.native
  
  var onbeforeeditfocus: Any = js.native
  
  var onbeforepaste: Any = js.native
  
  var onblur: Any = js.native
  
  var oncellchange: Any = js.native
  
  var oncontextmenu: Any = js.native
  
  var oncopy: Any = js.native
  
  var oncut: Any = js.native
  
  var ondrag: Any = js.native
  
  var ondragend: Any = js.native
  
  var ondragenter: Any = js.native
  
  var ondragleave: Any = js.native
  
  var ondragover: Any = js.native
  
  var ondrop: Any = js.native
  
  var onfocus: Any = js.native
  
  var onlosecapture: Any = js.native
  
  var onpaste: Any = js.native
  
  var onpropertychange: Any = js.native
  
  var onreadystatechange: Any = js.native
  
  var onresize: Any = js.native
  
  var onrowsdelete: Any = js.native
  
  var onrowsinserted: Any = js.native
  
  var onscroll: Any = js.native
  
  val readyState: Any = js.native
  
  def releaseCapture(): Unit = js.native
  
  def removeBehavior(cookie: Double): Boolean = js.native
  
  def removeExpression(propname: String): Boolean = js.native
  
  def removeFilter(pUnk: Any): Unit = js.native
  
  def replaceAdjacentText(where: String, newText: String): String = js.native
  
  val runtimeStyle: IHTMLStyle = js.native
  
  val scopeName: String = js.native
  
  val scrollHeight: Double = js.native
  
  var scrollLeft: Double = js.native
  
  var scrollTop: Double = js.native
  
  val scrollWidth: Double = js.native
  
  /** @param containerCapture [containerCapture=true] */
  def setCapture(): Unit = js.native
  def setCapture(containerCapture: Boolean): Unit = js.native
  
  /** @param language [language=''] */
  def setExpression(propname: String, expression: String): Unit = js.native
  def setExpression(propname: String, expression: String, language: String): Unit = js.native
  
  var tabIndex: Double = js.native
  
  var tagUrn: String = js.native
}
