package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Line break options passed in calls to {@link XBreakIterator.getLineBreak()} . */
@js.native
trait LineBreakUserOptions extends js.Object {
  
  var allowHyphenateEnglish: Boolean = js.native
  
  /**
    * If punctuation characters are allowed at the end of the line if outside of the margins, resulting in a line not being wrapped if only the punctuation
    * would wrap.
    */
  var allowPunctuationOutsideMargin: Boolean = js.native
  
  var applyForbiddenRules: Boolean = js.native
  
  var forbiddenBeginCharacters: String = js.native
  
  var forbiddenEndCharacters: String = js.native
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
  
  @scala.inline
  implicit class LineBreakUserOptionsOps[Self <: LineBreakUserOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowHyphenateEnglish(value: Boolean): Self = this.set("allowHyphenateEnglish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPunctuationOutsideMargin(value: Boolean): Self = this.set("allowPunctuationOutsideMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyForbiddenRules(value: Boolean): Self = this.set("applyForbiddenRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenBeginCharacters(value: String): Self = this.set("forbiddenBeginCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenEndCharacters(value: String): Self = this.set("forbiddenEndCharacters", value.asInstanceOf[js.Any])
  }
}
