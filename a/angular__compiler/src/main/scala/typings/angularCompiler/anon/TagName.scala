package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.JSDocTag
import typings.angularCompiler.outputAstMod.JSDocTagName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagName extends JSDocTag {
  var tagName: JSDocTagName | String = js.native
  var text: js.UndefOr[String] = js.native
}

object TagName {
  @scala.inline
  def apply(tagName: JSDocTagName | String): TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName]
  }
  @scala.inline
  implicit class TagNameOps[Self <: TagName] (val x: Self) extends AnyVal {
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
    def setTagName(value: JSDocTagName | String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

