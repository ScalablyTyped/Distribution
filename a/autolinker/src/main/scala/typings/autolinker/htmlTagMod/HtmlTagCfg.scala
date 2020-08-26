package typings.autolinker.htmlTagMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlTagCfg extends js.Object {
  var attrs: js.UndefOr[StringDictionary[String]] = js.native
  var innerHTML: js.UndefOr[String] = js.native
  var innerHtml: js.UndefOr[String] = js.native
  var tagName: js.UndefOr[String] = js.native
}

object HtmlTagCfg {
  @scala.inline
  def apply(): HtmlTagCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlTagCfg]
  }
  @scala.inline
  implicit class HtmlTagCfgOps[Self <: HtmlTagCfg] (val x: Self) extends AnyVal {
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
    def setAttrs(value: StringDictionary[String]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHTML: Self = this.set("innerHTML", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
  
}

