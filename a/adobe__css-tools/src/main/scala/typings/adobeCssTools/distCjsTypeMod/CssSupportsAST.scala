package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.distCjsTypeMod.CssTypes.supports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssSupportsAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var rules: js.Array[CssAtRuleAST]
  
  var supports: String
  
  @JSName("type")
  var type_CssSupportsAST: supports
}
object CssSupportsAST {
  
  inline def apply(rules: js.Array[CssAtRuleAST], supports: String, `type`: supports): CssSupportsAST = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssSupportsAST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CssSupportsAST] (val x: Self) extends AnyVal {
    
    inline def setRules(value: js.Array[CssAtRuleAST]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: CssAtRuleAST*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setSupports(value: String): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    inline def setType(value: supports): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
