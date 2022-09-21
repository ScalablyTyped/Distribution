package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLInputTextElement extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLInputTextElement_typekey")
  var MSHTMLDotHTMLInputTextElement_typekey: HTMLInputTextElement = js.native
  
  var accessKey: String = js.native
  
  def addFilter(pUnk: Any): Unit = js.native
  
  val all: Any = js.native
  
  def blur(): Unit = js.native
  
  val children: Any = js.native
  
  var className: String = js.native
  
  def click(): Unit = js.native
  
  val clientHeight: Double = js.native
  
  val clientLeft: Double = js.native
  
  val clientTop: Double = js.native
  
  val clientWidth: Double = js.native
  
  def contains(pChild: IHTMLElement): Boolean = js.native
  
  def createTextRange(): IHTMLTxtRange = js.native
  
  var dataFld: String = js.native
  
  var dataFormatAs: String = js.native
  
  var dataSrc: String = js.native
  
  var defaultValue: String = js.native
  
  var disabled: Boolean = js.native
  
  val document: Any = js.native
  
  def filters(pvarIndex: Any): Any = js.native
  @JSName("filters")
  val filters_Original: IHTMLFiltersCollection = js.native
  
  def focus(): Unit = js.native
  
  def form(): Any = js.native
  def form(name: Any): Any = js.native
  def form(name: Any, index: Any): Any = js.native
  def form(name: Unit, index: Any): Any = js.native
  @JSName("form")
  val form_Original: IHTMLFormElement = js.native
  
  /** @param lFlags [lFlags=0] */
  def getAttribute(strAttributeName: String): Any = js.native
  def getAttribute(strAttributeName: String, lFlags: Double): Any = js.native
  
  var id: String = js.native
  
  var innerHTML: String = js.native
  
  var innerText: String = js.native
  
  def insertAdjacentHTML(where: String, html: String): Unit = js.native
  
  def insertAdjacentText(where: String, text: String): Unit = js.native
  
  val isTextEdit: Boolean = js.native
  
  var lang: String = js.native
  
  var language: String = js.native
  
  var maxLength: Double = js.native
  
  var name: String = js.native
  
  val offsetHeight: Double = js.native
  
  val offsetLeft: Double = js.native
  
  val offsetParent: IHTMLElement = js.native
  
  val offsetTop: Double = js.native
  
  val offsetWidth: Double = js.native
  
  var onafterupdate: Any = js.native
  
  var onbeforeupdate: Any = js.native
  
  var onblur: Any = js.native
  
  var onchange: Any = js.native
  
  var onclick: Any = js.native
  
  var ondataavailable: Any = js.native
  
  var ondatasetchanged: Any = js.native
  
  var ondatasetcomplete: Any = js.native
  
  var ondblclick: Any = js.native
  
  var ondragstart: Any = js.native
  
  var onerrorupdate: Any = js.native
  
  var onfilterchange: Any = js.native
  
  var onfocus: Any = js.native
  
  var onhelp: Any = js.native
  
  var onkeydown: Any = js.native
  
  var onkeypress: Any = js.native
  
  var onkeyup: Any = js.native
  
  var onmousedown: Any = js.native
  
  var onmousemove: Any = js.native
  
  var onmouseout: Any = js.native
  
  var onmouseover: Any = js.native
  
  var onmouseup: Any = js.native
  
  var onresize: Any = js.native
  
  var onrowenter: Any = js.native
  
  var onrowexit: Any = js.native
  
  var onselect: Any = js.native
  
  var onselectstart: Any = js.native
  
  var outerHTML: String = js.native
  
  var outerText: String = js.native
  
  val parentElement: IHTMLElement = js.native
  
  val parentTextEdit: IHTMLElement = js.native
  
  var readOnly: Boolean = js.native
  
  val recordNumber: Any = js.native
  
  /** @param lFlags [lFlags=1] */
  def removeAttribute(strAttributeName: String): Boolean = js.native
  def removeAttribute(strAttributeName: String, lFlags: Double): Boolean = js.native
  
  def removeFilter(pUnk: Any): Unit = js.native
  
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(varargStart: Any): Unit = js.native
  
  def select(): Unit = js.native
  
  /** @param lFlags [lFlags=1] */
  def setAttribute(strAttributeName: String, AttributeValue: Any): Unit = js.native
  def setAttribute(strAttributeName: String, AttributeValue: Any, lFlags: Double): Unit = js.native
  
  var size: Double = js.native
  
  val sourceIndex: Double = js.native
  
  var status: Any = js.native
  
  val style: IHTMLStyle = js.native
  
  var tabIndex: Double = js.native
  
  val tagName: String = js.native
  
  var title: String = js.native
  
  val `type`: String = js.native
  
  var value: String = js.native
}
