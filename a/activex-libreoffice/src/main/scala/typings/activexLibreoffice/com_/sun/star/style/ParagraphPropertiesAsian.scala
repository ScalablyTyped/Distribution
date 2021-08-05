package typings.activexLibreoffice.com_.sun.star.style

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains settings for the style of paragraphs with complex text layout. */
trait ParagraphPropertiesAsian extends StObject {
  
  /** determines if a distance between Asian text, western text or complex text is set. */
  var ParaIsCharacterDistance: Boolean
  
  /** determines if the rules for forbidden characters at the start or end of text lines are considered. */
  var ParaIsForbiddenRules: Boolean
  
  /** determines if hanging punctuation is allowed. */
  var ParaIsHangingPunctuation: Boolean
}
object ParagraphPropertiesAsian {
  
  inline def apply(ParaIsCharacterDistance: Boolean, ParaIsForbiddenRules: Boolean, ParaIsHangingPunctuation: Boolean): ParagraphPropertiesAsian = {
    val __obj = js.Dynamic.literal(ParaIsCharacterDistance = ParaIsCharacterDistance.asInstanceOf[js.Any], ParaIsForbiddenRules = ParaIsForbiddenRules.asInstanceOf[js.Any], ParaIsHangingPunctuation = ParaIsHangingPunctuation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphPropertiesAsian]
  }
  
  extension [Self <: ParagraphPropertiesAsian](x: Self) {
    
    inline def setParaIsCharacterDistance(value: Boolean): Self = StObject.set(x, "ParaIsCharacterDistance", value.asInstanceOf[js.Any])
    
    inline def setParaIsForbiddenRules(value: Boolean): Self = StObject.set(x, "ParaIsForbiddenRules", value.asInstanceOf[js.Any])
    
    inline def setParaIsHangingPunctuation(value: Boolean): Self = StObject.set(x, "ParaIsHangingPunctuation", value.asInstanceOf[js.Any])
  }
}
