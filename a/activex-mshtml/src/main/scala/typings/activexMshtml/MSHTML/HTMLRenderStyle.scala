package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLRenderStyle extends js.Object {
  @JSName("MSHTML.HTMLRenderStyle_typekey")
  var MSHTMLDotHTMLRenderStyle_typekey: HTMLRenderStyle
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

object HTMLRenderStyle {
  @scala.inline
  def apply(
    MSHTMLDotHTMLRenderStyle_typekey: HTMLRenderStyle,
    defaultTextSelection: String,
    renderingPriority: Double,
    textBackgroundColor: js.Any,
    textColor: js.Any,
    textDecoration: String,
    textDecorationColor: js.Any,
    textEffect: String,
    textLineThroughStyle: String,
    textUnderlineStyle: String
  ): HTMLRenderStyle = {
    val __obj = js.Dynamic.literal(defaultTextSelection = defaultTextSelection.asInstanceOf[js.Any], renderingPriority = renderingPriority.asInstanceOf[js.Any], textBackgroundColor = textBackgroundColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any], textDecorationColor = textDecorationColor.asInstanceOf[js.Any], textEffect = textEffect.asInstanceOf[js.Any], textLineThroughStyle = textLineThroughStyle.asInstanceOf[js.Any], textUnderlineStyle = textUnderlineStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLRenderStyle_typekey")(MSHTMLDotHTMLRenderStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLRenderStyle]
  }
}

