package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGElement")
@js.native
class SVGElement protected () extends js.Object {
  var `MSHTML.SVGElement_typekey`: SVGElement = js.native
  val all: js.Any = js.native
  val children: js.Any = js.native
  var className: java.lang.String = js.native
  val document: js.Any = js.native
  @JSName("filters")
  val filters_Original: IHTMLFiltersCollection = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var id: java.lang.String = js.native
  var innerHTML: java.lang.String = js.native
  var innerText: java.lang.String = js.native
  val isTextEdit: scala.Boolean = js.native
  var lang: java.lang.String = js.native
  var language: java.lang.String = js.native
  val offsetHeight: scala.Double = js.native
  val offsetLeft: scala.Double = js.native
  val offsetParent: IHTMLElement = js.native
  val offsetTop: scala.Double = js.native
  val offsetWidth: scala.Double = js.native
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
  var outerHTML: java.lang.String = js.native
  var outerText: java.lang.String = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  val parentElement: IHTMLElement = js.native
  val parentTextEdit: IHTMLElement = js.native
  val recordNumber: js.Any = js.native
  val sourceIndex: scala.Double = js.native
  val style: IHTMLStyle = js.native
  val tagName: java.lang.String = js.native
  var title: java.lang.String = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: java.lang.String = js.native
  def click(): scala.Unit = js.native
  def contains(pChild: IHTMLElement): scala.Boolean = js.native
  def filters(pvarIndex: js.Any): js.Any = js.native
  /** @param lFlags [lFlags=0] */
  def getAttribute(strAttributeName: java.lang.String): js.Any = js.native
  def getAttribute(strAttributeName: java.lang.String, lFlags: scala.Double): js.Any = js.native
  def insertAdjacentHTML(where: java.lang.String, html: java.lang.String): scala.Unit = js.native
  def insertAdjacentText(where: java.lang.String, text: java.lang.String): scala.Unit = js.native
  /** @param lFlags [lFlags=1] */
  def removeAttribute(strAttributeName: java.lang.String): scala.Boolean = js.native
  def removeAttribute(strAttributeName: java.lang.String, lFlags: scala.Double): scala.Boolean = js.native
  def scrollIntoView(): scala.Unit = js.native
  def scrollIntoView(varargStart: js.Any): scala.Unit = js.native
  /** @param lFlags [lFlags=1] */
  def setAttribute(strAttributeName: java.lang.String, AttributeValue: js.Any): scala.Unit = js.native
  def setAttribute(strAttributeName: java.lang.String, AttributeValue: js.Any, lFlags: scala.Double): scala.Unit = js.native
}

