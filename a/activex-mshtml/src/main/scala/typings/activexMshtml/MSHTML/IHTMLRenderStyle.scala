package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLRenderStyle extends js.Object {
  @JSName("MSHTML.IHTMLRenderStyle_typekey")
  var MSHTMLDotIHTMLRenderStyle_typekey: IHTMLRenderStyle
  var defaultTextSelection: String
  var renderingPriority: Double
  var textBackgroundColor: js.Any
  var textColor: js.Any
  var textDecoration: String
  var textDecorationColor: js.Any
  var textEffect: String
  var textLineThroughStyle: String
  var textUnderlineStyle: String
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
}

