package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGElement extends StObject {
  
  @JSName("MSHTML.SVGElement_typekey")
  var MSHTMLDotSVGElement_typekey: SVGElement = js.native
  
  val all: js.Any = js.native
  
  val children: js.Any = js.native
  
  var className: String = js.native
  
  def click(): Unit = js.native
  
  def contains(pChild: IHTMLElement): Boolean = js.native
  
  val document: js.Any = js.native
  
  def filters(pvarIndex: js.Any): js.Any = js.native
  @JSName("filters")
  val filters_Original: IHTMLFiltersCollection = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  /** @param lFlags [lFlags=0] */
  def getAttribute(strAttributeName: String): js.Any = js.native
  def getAttribute(strAttributeName: String, lFlags: Double): js.Any = js.native
  
  var id: String = js.native
  
  var innerHTML: String = js.native
  
  var innerText: String = js.native
  
  def insertAdjacentHTML(where: String, html: String): Unit = js.native
  
  def insertAdjacentText(where: String, text: String): Unit = js.native
  
  val isTextEdit: Boolean = js.native
  
  var lang: String = js.native
  
  var language: String = js.native
  
  val offsetHeight: Double = js.native
  
  val offsetLeft: Double = js.native
  
  val offsetParent: IHTMLElement = js.native
  
  val offsetTop: Double = js.native
  
  val offsetWidth: Double = js.native
  
  var onafterupdate: js.Any = js.native
  
  var onbeforeupdate: js.Any = js.native
  
  var onclick: js.Any = js.native
  
  var ondataavailable: js.Any = js.native
  
  var ondatasetchanged: js.Any = js.native
  
  var ondatasetcomplete: js.Any = js.native
  
  var ondblclick: js.Any = js.native
  
  var ondragstart: js.Any = js.native
  
  var onerrorupdate: js.Any = js.native
  
  var onfilterchange: js.Any = js.native
  
  var onhelp: js.Any = js.native
  
  var onkeydown: js.Any = js.native
  
  var onkeypress: js.Any = js.native
  
  var onkeyup: js.Any = js.native
  
  var onmousedown: js.Any = js.native
  
  var onmousemove: js.Any = js.native
  
  var onmouseout: js.Any = js.native
  
  var onmouseover: js.Any = js.native
  
  var onmouseup: js.Any = js.native
  
  var onrowenter: js.Any = js.native
  
  var onrowexit: js.Any = js.native
  
  var onselectstart: js.Any = js.native
  
  var outerHTML: String = js.native
  
  var outerText: String = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  val parentElement: IHTMLElement = js.native
  
  val parentTextEdit: IHTMLElement = js.native
  
  val recordNumber: js.Any = js.native
  
  /** @param lFlags [lFlags=1] */
  def removeAttribute(strAttributeName: String): Boolean = js.native
  def removeAttribute(strAttributeName: String, lFlags: Double): Boolean = js.native
  
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(varargStart: js.Any): Unit = js.native
  
  /** @param lFlags [lFlags=1] */
  def setAttribute(strAttributeName: String, AttributeValue: js.Any): Unit = js.native
  def setAttribute(strAttributeName: String, AttributeValue: js.Any, lFlags: Double): Unit = js.native
  
  val sourceIndex: Double = js.native
  
  val style: IHTMLStyle = js.native
  
  val tagName: String = js.native
  
  var title: String = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var xmlbase: String = js.native
}
