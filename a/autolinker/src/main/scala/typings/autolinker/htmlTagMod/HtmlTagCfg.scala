package typings.autolinker.htmlTagMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlTagCfg extends js.Object {
  var attrs: js.UndefOr[StringDictionary[String]] = js.undefined
  var innerHTML: js.UndefOr[String] = js.undefined
  var innerHtml: js.UndefOr[String] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
}

object HtmlTagCfg {
  @scala.inline
  def apply(
    attrs: StringDictionary[String] = null,
    innerHTML: String = null,
    innerHtml: String = null,
    tagName: String = null
  ): HtmlTagCfg = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (innerHtml != null) __obj.updateDynamic("innerHtml")(innerHtml.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlTagCfg]
  }
}

