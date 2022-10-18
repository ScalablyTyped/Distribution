package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.distCjsTypeMod.CssTypes.host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssHostAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var rules: js.Array[CssAtRuleAST]
  
  @JSName("type")
  var type_CssHostAST: host
}
object CssHostAST {
  
  inline def apply(rules: js.Array[CssAtRuleAST], `type`: host): CssHostAST = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssHostAST]
  }
  
  extension [Self <: CssHostAST](x: Self) {
    
    inline def setRules(value: js.Array[CssAtRuleAST]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: CssAtRuleAST*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setType(value: host): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
