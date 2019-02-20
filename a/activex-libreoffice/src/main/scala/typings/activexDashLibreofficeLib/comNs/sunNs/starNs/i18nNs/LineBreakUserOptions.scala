package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Line break options passed in calls to {@link XBreakIterator.getLineBreak()} . */
trait LineBreakUserOptions extends js.Object {
  var allowHyphenateEnglish: scala.Boolean
  /**
    * If punctuation characters are allowed at the end of the line if outside of the margins, resulting in a line not being wrapped if only the punctuation
    * would wrap.
    */
  var allowPunctuationOutsideMargin: scala.Boolean
  var applyForbiddenRules: scala.Boolean
  var forbiddenBeginCharacters: java.lang.String
  var forbiddenEndCharacters: java.lang.String
}

