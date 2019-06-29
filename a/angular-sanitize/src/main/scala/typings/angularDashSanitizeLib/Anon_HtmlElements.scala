package typings
package angularDashSanitizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HtmlElements extends js.Object {
  var htmlElements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var htmlVoidElements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var svgElements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_HtmlElements {
  @scala.inline
  def apply(
    htmlElements: js.Array[java.lang.String] = null,
    htmlVoidElements: js.Array[java.lang.String] = null,
    svgElements: js.Array[java.lang.String] = null
  ): Anon_HtmlElements = {
    val __obj = js.Dynamic.literal()
    if (htmlElements != null) __obj.updateDynamic("htmlElements")(htmlElements)
    if (htmlVoidElements != null) __obj.updateDynamic("htmlVoidElements")(htmlVoidElements)
    if (svgElements != null) __obj.updateDynamic("svgElements")(svgElements)
    __obj.asInstanceOf[Anon_HtmlElements]
  }
}

