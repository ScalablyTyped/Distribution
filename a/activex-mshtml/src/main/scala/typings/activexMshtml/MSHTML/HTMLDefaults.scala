package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLDefaults extends js.Object {
  @JSName("MSHTML.HTMLDefaults_typekey")
  var MSHTMLDotHTMLDefaults_typekey: HTMLDefaults = js.native
  var canHaveHTML: Boolean = js.native
  val constructor: js.Any = js.native
  var contentEditable: String = js.native
  var frozen: Boolean = js.native
  var isMultiLine: Boolean = js.native
  var scrollSegmentX: Double = js.native
  var scrollSegmentY: Double = js.native
  val style: IHTMLStyle = js.native
  var tabStop: Boolean = js.native
  var viewInheritStyle: Boolean = js.native
  var viewLink: IHTMLDocument = js.native
  var viewMasterTab: Boolean = js.native
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
  @scala.inline
  implicit class HTMLDefaultsOps[Self <: HTMLDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSHTMLDotHTMLDefaults_typekey(value: HTMLDefaults): Self = this.set("MSHTML.HTMLDefaults_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanHaveHTML(value: Boolean): Self = this.set("canHaveHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstructor(value: js.Any): Self = this.set("constructor", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentEditable(value: String): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrozen(value: Boolean): Self = this.set("frozen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMultiLine(value: Boolean): Self = this.set("isMultiLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollSegmentX(value: Double): Self = this.set("scrollSegmentX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollSegmentY(value: Double): Self = this.set("scrollSegmentY", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: IHTMLStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabStop(value: Boolean): Self = this.set("tabStop", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewInheritStyle(value: Boolean): Self = this.set("viewInheritStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewLink(value: IHTMLDocument): Self = this.set("viewLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMasterTab(value: Boolean): Self = this.set("viewMasterTab", value.asInstanceOf[js.Any])
  }
  
}

