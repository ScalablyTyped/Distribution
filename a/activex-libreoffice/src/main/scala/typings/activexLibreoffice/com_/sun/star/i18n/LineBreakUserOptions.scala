package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Line break options passed in calls to {@link XBreakIterator.getLineBreak()} . */
@js.native
trait LineBreakUserOptions extends StObject {
  
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
  implicit class LineBreakUserOptionsMutableBuilder[Self <: LineBreakUserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHyphenateEnglish(value: Boolean): Self = StObject.set(x, "allowHyphenateEnglish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPunctuationOutsideMargin(value: Boolean): Self = StObject.set(x, "allowPunctuationOutsideMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyForbiddenRules(value: Boolean): Self = StObject.set(x, "applyForbiddenRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenBeginCharacters(value: String): Self = StObject.set(x, "forbiddenBeginCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenEndCharacters(value: String): Self = StObject.set(x, "forbiddenEndCharacters", value.asInstanceOf[js.Any])
  }
}
