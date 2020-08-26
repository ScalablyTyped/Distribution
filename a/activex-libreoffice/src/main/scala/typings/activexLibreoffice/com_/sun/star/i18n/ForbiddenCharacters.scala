package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Locale (mostly CJK) dependent characters that are forbidden at the start or end of a line.
  *
  * Returned by {@link XLocaleData.getForbiddenCharacters()} and used with {@link XForbiddenCharacters} methods.
  */
@js.native
trait ForbiddenCharacters extends js.Object {
  var beginLine: String = js.native
  var endLine: String = js.native
}

object ForbiddenCharacters {
  @scala.inline
  def apply(beginLine: String, endLine: String): ForbiddenCharacters = {
    val __obj = js.Dynamic.literal(beginLine = beginLine.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForbiddenCharacters]
  }
  @scala.inline
  implicit class ForbiddenCharactersOps[Self <: ForbiddenCharacters] (val x: Self) extends AnyVal {
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
    def setBeginLine(value: String): Self = this.set("beginLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndLine(value: String): Self = this.set("endLine", value.asInstanceOf[js.Any])
  }
  
}

