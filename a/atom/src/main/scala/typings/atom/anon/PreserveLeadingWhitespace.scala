package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreserveLeadingWhitespace extends js.Object {
  var preserveLeadingWhitespace: js.UndefOr[Boolean] = js.native
}

object PreserveLeadingWhitespace {
  @scala.inline
  def apply(): PreserveLeadingWhitespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveLeadingWhitespace]
  }
  @scala.inline
  implicit class PreserveLeadingWhitespaceOps[Self <: PreserveLeadingWhitespace] (val x: Self) extends AnyVal {
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
    def setPreserveLeadingWhitespace(value: Boolean): Self = this.set("preserveLeadingWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveLeadingWhitespace: Self = this.set("preserveLeadingWhitespace", js.undefined)
  }
  
}

