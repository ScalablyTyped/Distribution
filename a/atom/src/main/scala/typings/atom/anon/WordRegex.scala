package typings.atom.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordRegex extends js.Object {
  var wordRegex: js.UndefOr[RegExp] = js.native
}

object WordRegex {
  @scala.inline
  def apply(): WordRegex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordRegex]
  }
  @scala.inline
  implicit class WordRegexOps[Self <: WordRegex] (val x: Self) extends AnyVal {
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
    def setWordRegex(value: RegExp): Self = this.set("wordRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordRegex: Self = this.set("wordRegex", js.undefined)
  }
  
}

