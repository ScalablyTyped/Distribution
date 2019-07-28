package typings.angularDashSanitize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HtmlElements extends js.Object {
  var htmlElements: js.UndefOr[js.Array[String]] = js.undefined
  var htmlVoidElements: js.UndefOr[js.Array[String]] = js.undefined
  var svgElements: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_HtmlElements {
  @scala.inline
  def apply(
    htmlElements: js.Array[String] = null,
    htmlVoidElements: js.Array[String] = null,
    svgElements: js.Array[String] = null
  ): Anon_HtmlElements = {
    val __obj = js.Dynamic.literal()
    if (htmlElements != null) __obj.updateDynamic("htmlElements")(htmlElements)
    if (htmlVoidElements != null) __obj.updateDynamic("htmlVoidElements")(htmlVoidElements)
    if (svgElements != null) __obj.updateDynamic("svgElements")(svgElements)
    __obj.asInstanceOf[Anon_HtmlElements]
  }
}

