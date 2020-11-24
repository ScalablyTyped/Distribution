package typings.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains settings for the style of paragraphs with complex text layout. */
@js.native
trait ParagraphPropertiesAsian extends js.Object {
  
  /** determines if a distance between Asian text, western text or complex text is set. */
  var ParaIsCharacterDistance: Boolean = js.native
  
  /** determines if the rules for forbidden characters at the start or end of text lines are considered. */
  var ParaIsForbiddenRules: Boolean = js.native
  
  /** determines if hanging punctuation is allowed. */
  var ParaIsHangingPunctuation: Boolean = js.native
}
object ParagraphPropertiesAsian {
  
  @scala.inline
  def apply(ParaIsCharacterDistance: Boolean, ParaIsForbiddenRules: Boolean, ParaIsHangingPunctuation: Boolean): ParagraphPropertiesAsian = {
    val __obj = js.Dynamic.literal(ParaIsCharacterDistance = ParaIsCharacterDistance.asInstanceOf[js.Any], ParaIsForbiddenRules = ParaIsForbiddenRules.asInstanceOf[js.Any], ParaIsHangingPunctuation = ParaIsHangingPunctuation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphPropertiesAsian]
  }
  
  @scala.inline
  implicit class ParagraphPropertiesAsianOps[Self <: ParagraphPropertiesAsian] (val x: Self) extends AnyVal {
    
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
    def setParaIsCharacterDistance(value: Boolean): Self = this.set("ParaIsCharacterDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsForbiddenRules(value: Boolean): Self = this.set("ParaIsForbiddenRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsHangingPunctuation(value: Boolean): Self = this.set("ParaIsHangingPunctuation", value.asInstanceOf[js.Any])
  }
}
