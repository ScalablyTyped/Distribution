package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Line break options passed in calls to {@link XBreakIterator.getLineBreak()} . */
trait LineBreakUserOptions extends js.Object {
  var allowHyphenateEnglish: Boolean
  /**
    * If punctuation characters are allowed at the end of the line if outside of the margins, resulting in a line not being wrapped if only the punctuation
    * would wrap.
    */
  var allowPunctuationOutsideMargin: Boolean
  var applyForbiddenRules: Boolean
  var forbiddenBeginCharacters: String
  var forbiddenEndCharacters: String
}

object LineBreakUserOptions {
  @scala.inline
  def apply(
    allowHyphenateEnglish: Boolean,
    allowPunctuationOutsideMargin: Boolean,
    applyForbiddenRules: Boolean,
    forbiddenBeginCharacters: String,
    forbiddenEndCharacters: String
  ): LineBreakUserOptions = {
    val __obj = js.Dynamic.literal(allowHyphenateEnglish = allowHyphenateEnglish.asInstanceOf[js.Any], allowPunctuationOutsideMargin = allowPunctuationOutsideMargin.asInstanceOf[js.Any], applyForbiddenRules = applyForbiddenRules.asInstanceOf[js.Any], forbiddenBeginCharacters = forbiddenBeginCharacters.asInstanceOf[js.Any], forbiddenEndCharacters = forbiddenEndCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBreakUserOptions]
  }
}

