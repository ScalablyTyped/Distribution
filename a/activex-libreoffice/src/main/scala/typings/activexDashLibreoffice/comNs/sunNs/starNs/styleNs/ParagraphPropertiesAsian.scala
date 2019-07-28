package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains settings for the style of paragraphs with complex text layout. */
trait ParagraphPropertiesAsian extends js.Object {
  /** determines if a distance between Asian text, western text or complex text is set. */
  var ParaIsCharacterDistance: Boolean
  /** determines if the rules for forbidden characters at the start or end of text lines are considered. */
  var ParaIsForbiddenRules: Boolean
  /** determines if hanging punctuation is allowed. */
  var ParaIsHangingPunctuation: Boolean
}

object ParagraphPropertiesAsian {
  @scala.inline
  def apply(ParaIsCharacterDistance: Boolean, ParaIsForbiddenRules: Boolean, ParaIsHangingPunctuation: Boolean): ParagraphPropertiesAsian = {
    val __obj = js.Dynamic.literal(ParaIsCharacterDistance = ParaIsCharacterDistance, ParaIsForbiddenRules = ParaIsForbiddenRules, ParaIsHangingPunctuation = ParaIsHangingPunctuation)
  
    __obj.asInstanceOf[ParagraphPropertiesAsian]
  }
}

