package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.distCjsTypeMod.CssTypes.document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssDocumentAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var document: String
  
  var rules: js.Array[CssAtRuleAST]
  
  @JSName("type")
  var type_CssDocumentAST: document
  
  var vendor: js.UndefOr[String] = js.undefined
}
object CssDocumentAST {
  
  inline def apply(document: String, rules: js.Array[CssAtRuleAST], `type`: document): CssDocumentAST = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssDocumentAST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CssDocumentAST] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[CssAtRuleAST]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: CssAtRuleAST*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setType(value: document): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
