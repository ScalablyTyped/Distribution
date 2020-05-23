package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLDefaults extends js.Object {
  @JSName("MSHTML.HTMLDefaults_typekey")
  var MSHTMLDotHTMLDefaults_typekey: HTMLDefaults
  var canHaveHTML: Boolean
  val constructor: js.Any
  var contentEditable: String
  var frozen: Boolean
  var isMultiLine: Boolean
  var scrollSegmentX: Double
  var scrollSegmentY: Double
  val style: IHTMLStyle
  var tabStop: Boolean
  var viewInheritStyle: Boolean
  var viewLink: IHTMLDocument
  var viewMasterTab: Boolean
}

object HTMLDefaults {
  @scala.inline
  def apply(
    MSHTMLDotHTMLDefaults_typekey: HTMLDefaults,
    canHaveHTML: Boolean,
    constructor: js.Any,
    contentEditable: String,
    frozen: Boolean,
    isMultiLine: Boolean,
    scrollSegmentX: Double,
    scrollSegmentY: Double,
    style: IHTMLStyle,
    tabStop: Boolean,
    viewInheritStyle: Boolean,
    viewLink: IHTMLDocument,
    viewMasterTab: Boolean
  ): HTMLDefaults = {
    val __obj = js.Dynamic.literal(canHaveHTML = canHaveHTML.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], contentEditable = contentEditable.asInstanceOf[js.Any], frozen = frozen.asInstanceOf[js.Any], isMultiLine = isMultiLine.asInstanceOf[js.Any], scrollSegmentX = scrollSegmentX.asInstanceOf[js.Any], scrollSegmentY = scrollSegmentY.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabStop = tabStop.asInstanceOf[js.Any], viewInheritStyle = viewInheritStyle.asInstanceOf[js.Any], viewLink = viewLink.asInstanceOf[js.Any], viewMasterTab = viewMasterTab.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDefaults_typekey")(MSHTMLDotHTMLDefaults_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDefaults]
  }
}

