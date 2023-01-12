package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.distCjsTypeMod.CssTypes.media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssMediaAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var media: String
  
  var rules: js.Array[CssAtRuleAST]
  
  @JSName("type")
  var type_CssMediaAST: media
}
object CssMediaAST {
  
  inline def apply(media: String, rules: js.Array[CssAtRuleAST], `type`: media): CssMediaAST = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssMediaAST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CssMediaAST] (val x: Self) extends AnyVal {
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[CssAtRuleAST]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: CssAtRuleAST*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setType(value: media): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
