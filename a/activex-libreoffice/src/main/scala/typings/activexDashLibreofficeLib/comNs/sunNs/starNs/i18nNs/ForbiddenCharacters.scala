package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Locale (mostly CJK) dependent characters that are forbidden at the start or end of a line.
  *
  * Returned by {@link XLocaleData.getForbiddenCharacters()} and used with {@link XForbiddenCharacters} methods.
  */
trait ForbiddenCharacters extends js.Object {
  var beginLine: java.lang.String
  var endLine: java.lang.String
}

object ForbiddenCharacters {
  @scala.inline
  def apply(beginLine: java.lang.String, endLine: java.lang.String): ForbiddenCharacters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginLine")(beginLine)
    __obj.updateDynamic("endLine")(endLine)
    __obj.asInstanceOf[ForbiddenCharacters]
  }
}

