package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrammarRule extends StObject {
  
  var contentScopeName: String
  
  // https://github.com/atom/first-mate/blob/v7.0.7/src/rule.coffee
  // This is private. Don't go down the rabbit hole.
  var rule: js.Object
  
  var scopeName: String
}
object GrammarRule {
  
  inline def apply(contentScopeName: String, rule: js.Object, scopeName: String): GrammarRule = {
    val __obj = js.Dynamic.literal(contentScopeName = contentScopeName.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarRule]
  }
  
  extension [Self <: GrammarRule](x: Self) {
    
    inline def setContentScopeName(value: String): Self = StObject.set(x, "contentScopeName", value.asInstanceOf[js.Any])
    
    inline def setRule(value: js.Object): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
  }
}
