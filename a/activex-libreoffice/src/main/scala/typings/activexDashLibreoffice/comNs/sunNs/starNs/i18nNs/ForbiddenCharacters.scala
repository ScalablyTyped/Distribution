package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Locale (mostly CJK) dependent characters that are forbidden at the start or end of a line.
  *
  * Returned by {@link XLocaleData.getForbiddenCharacters()} and used with {@link XForbiddenCharacters} methods.
  */
trait ForbiddenCharacters extends js.Object {
  var beginLine: String
  var endLine: String
}

object ForbiddenCharacters {
  @scala.inline
  def apply(beginLine: String, endLine: String): ForbiddenCharacters = {
    val __obj = js.Dynamic.literal(beginLine = beginLine, endLine = endLine)
  
    __obj.asInstanceOf[ForbiddenCharacters]
  }
}

