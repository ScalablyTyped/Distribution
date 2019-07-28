package typings.activexDashMshtml.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLOptionButtonElement")
@js.native
class HTMLOptionButtonElement protected () extends js.Object {
  var `MSHTML.HTMLOptionButtonElement_typekey`: HTMLOptionButtonElement = js.native
  var accessKey: String = js.native
  val all: js.Any = js.native
  var checked: Boolean = js.native
  val children: js.Any = js.native
  var className: String = js.native
  val clientHeight: Double = js.native
  val clientLeft: Double = js.native
  val clientTop: Double = js.native
  val clientWidth: Double = js.native
  var dataFld: String = js.native
  var dataFormatAs: String = js.native
  var dataSrc: String = js.native
  var defaultChecked: Boolean = js.native
  var disabled: Boolean = js.native
  val document: js.Any = js.native
  @JSName("filters")
  val filters_Original: IHTMLFiltersCollection = js.native
  @JSName("form")
  val form_Original: IHTMLFormElement = js.native
  var id: String = js.native
  var indeterminate: Boolean = js.native
  var innerHTML: String = js.native
  var innerText: String = js.native
  val isTextEdit: Boolean = js.native
  var lang: String = js.native
  var language: String = js.native
  var name: String = js.native
  val offsetHeight: Double = js.native
  val offsetLeft: Double = js.native
  val offsetParent: IHTMLElement = js.native
  val offsetTop: Double = js.native
  val offsetWidth: Double = js.native
  var onafterupdate: js.Any = js.native
  var onbeforeupdate: js.Any = js.native
  var onblur: js.Any = js.native
  var onchange: js.Any = js.native
  var onclick: js.Any = js.native
  var ondataavailable: js.Any = js.native
  var ondatasetchanged: js.Any = js.native
  var ondatasetcomplete: js.Any = js.native
  var ondblclick: js.Any = js.native
  var ondragstart: js.Any = js.native
  var onerrorupdate: js.Any = js.native
  var onfilterchange: js.Any = js.native
  var onfocus: js.Any = js.native
  var onhelp: js.Any = js.native
  var onkeydown: js.Any = js.native
  var onkeypress: js.Any = js.native
  var onkeyup: js.Any = js.native
  var onmousedown: js.Any = js.native
  var onmousemove: js.Any = js.native
  var onmouseout: js.Any = js.native
  var onmouseover: js.Any = js.native
  var onmouseup: js.Any = js.native
  var onresize: js.Any = js.native
  var onrowenter: js.Any = js.native
  var onrowexit: js.Any = js.native
  var onselectstart: js.Any = js.native
  var outerHTML: String = js.native
  var outerText: String = js.native
  val parentElement: IHTMLElement = js.native
  val parentTextEdit: IHTMLElement = js.native
  val recordNumber: js.Any = js.native
  val sourceIndex: Double = js.native
  var status: Boolean = js.native
  val style: IHTMLStyle = js.native
  var tabIndex: Double = js.native
  val tagName: String = js.native
  var title: String = js.native
  val `type`: String = js.native
  var value: String = js.native
  def addFilter(pUnk: js.Any): Unit = js.native
  def blur(): Unit = js.native
  def click(): Unit = js.native
  def contains(pChild: IHTMLElement): Boolean = js.native
  def filters(pvarIndex: js.Any): js.Any = js.native
  def focus(): Unit = js.native
  def form(): js.Any = js.native
  def form(name: js.Any): js.Any = js.native
  def form(name: js.Any, index: js.Any): js.Any = js.native
  /** @param lFlags [lFlags=0] */
  def getAttribute(strAttributeName: String): js.Any = js.native
  def getAttribute(strAttributeName: String, lFlags: Double): js.Any = js.native
  def insertAdjacentHTML(where: String, html: String): Unit = js.native
  def insertAdjacentText(where: String, text: String): Unit = js.native
  /** @param lFlags [lFlags=1] */
  def removeAttribute(strAttributeName: String): Boolean = js.native
  def removeAttribute(strAttributeName: String, lFlags: Double): Boolean = js.native
  def removeFilter(pUnk: js.Any): Unit = js.native
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(varargStart: js.Any): Unit = js.native
  /** @param lFlags [lFlags=1] */
  def setAttribute(strAttributeName: String, AttributeValue: js.Any): Unit = js.native
  def setAttribute(strAttributeName: String, AttributeValue: js.Any, lFlags: Double): Unit = js.native
}

