package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLRenderStyle extends js.Object {
  @JSName("MSHTML.IHTMLRenderStyle_typekey")
  var MSHTMLDotIHTMLRenderStyle_typekey: IHTMLRenderStyle = js.native
  var defaultTextSelection: String = js.native
  var renderingPriority: Double = js.native
  var textBackgroundColor: js.Any = js.native
  var textColor: js.Any = js.native
  var textDecoration: String = js.native
  var textDecorationColor: js.Any = js.native
  var textEffect: String = js.native
  var textLineThroughStyle: String = js.native
  var textUnderlineStyle: String = js.native
}

object IHTMLRenderStyle {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLRenderStyle_typekey: IHTMLRenderStyle,
    defaultTextSelection: String,
    renderingPriority: Double,
    textBackgroundColor: js.Any,
    textColor: js.Any,
    textDecoration: String,
    textDecorationColor: js.Any,
    textEffect: String,
    textLineThroughStyle: String,
    textUnderlineStyle: String
  ): IHTMLRenderStyle = {
    val __obj = js.Dynamic.literal(defaultTextSelection = defaultTextSelection.asInstanceOf[js.Any], renderingPriority = renderingPriority.asInstanceOf[js.Any], textBackgroundColor = textBackgroundColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any], textDecorationColor = textDecorationColor.asInstanceOf[js.Any], textEffect = textEffect.asInstanceOf[js.Any], textLineThroughStyle = textLineThroughStyle.asInstanceOf[js.Any], textUnderlineStyle = textUnderlineStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLRenderStyle_typekey")(MSHTMLDotIHTMLRenderStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLRenderStyle]
  }
  @scala.inline
  implicit class IHTMLRenderStyleOps[Self <: IHTMLRenderStyle] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLRenderStyle_typekey(value: IHTMLRenderStyle): Self = this.set("MSHTML.IHTMLRenderStyle_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTextSelection(value: String): Self = this.set("defaultTextSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderingPriority(value: Double): Self = this.set("renderingPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextBackgroundColor(value: js.Any): Self = this.set("textBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextColor(value: js.Any): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDecorationColor(value: js.Any): Self = this.set("textDecorationColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextEffect(value: String): Self = this.set("textEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextLineThroughStyle(value: String): Self = this.set("textLineThroughStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextUnderlineStyle(value: String): Self = this.set("textUnderlineStyle", value.asInstanceOf[js.Any])
  }
  
}

