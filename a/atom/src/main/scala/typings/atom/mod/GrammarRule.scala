package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrammarRule extends StObject {
  
  var contentScopeName: String = js.native
  
  // https://github.com/atom/first-mate/blob/v7.0.7/src/rule.coffee
  // This is private. Don't go down the rabbit hole.
  var rule: js.Object = js.native
  
  var scopeName: String = js.native
}
object GrammarRule {
  
  @scala.inline
  def apply(contentScopeName: String, rule: js.Object, scopeName: String): GrammarRule = {
    val __obj = js.Dynamic.literal(contentScopeName = contentScopeName.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarRule]
  }
  
  @scala.inline
  implicit class GrammarRuleMutableBuilder[Self <: GrammarRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentScopeName(value: String): Self = StObject.set(x, "contentScopeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: js.Object): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
  }
}
