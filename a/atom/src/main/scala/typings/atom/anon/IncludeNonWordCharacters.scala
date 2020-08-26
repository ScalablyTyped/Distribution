package typings.atom.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeNonWordCharacters extends js.Object {
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.native
  var wordRegex: js.UndefOr[RegExp] = js.native
}

object IncludeNonWordCharacters {
  @scala.inline
  def apply(): IncludeNonWordCharacters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeNonWordCharacters]
  }
  @scala.inline
  implicit class IncludeNonWordCharactersOps[Self <: IncludeNonWordCharacters] (val x: Self) extends AnyVal {
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
    def setIncludeNonWordCharacters(value: Boolean): Self = this.set("includeNonWordCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeNonWordCharacters: Self = this.set("includeNonWordCharacters", js.undefined)
    @scala.inline
    def setWordRegex(value: RegExp): Self = this.set("wordRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordRegex: Self = this.set("wordRegex", js.undefined)
  }
  
}

