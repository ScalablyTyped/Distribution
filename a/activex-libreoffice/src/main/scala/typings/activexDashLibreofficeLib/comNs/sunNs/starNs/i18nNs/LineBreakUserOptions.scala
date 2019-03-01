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

object LineBreakUserOptions {
  @scala.inline
  def apply(
    allowHyphenateEnglish: scala.Boolean,
    allowPunctuationOutsideMargin: scala.Boolean,
    applyForbiddenRules: scala.Boolean,
    forbiddenBeginCharacters: java.lang.String,
    forbiddenEndCharacters: java.lang.String
  ): LineBreakUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowHyphenateEnglish")(allowHyphenateEnglish)
    __obj.updateDynamic("allowPunctuationOutsideMargin")(allowPunctuationOutsideMargin)
    __obj.updateDynamic("applyForbiddenRules")(applyForbiddenRules)
    __obj.updateDynamic("forbiddenBeginCharacters")(forbiddenBeginCharacters)
    __obj.updateDynamic("forbiddenEndCharacters")(forbiddenEndCharacters)
    __obj.asInstanceOf[LineBreakUserOptions]
  }
}

