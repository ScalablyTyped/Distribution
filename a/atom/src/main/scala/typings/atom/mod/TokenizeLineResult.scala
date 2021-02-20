package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenizeLineResult extends StObject {
  
  /** The string of text that was tokenized. */
  var line: String = js.native
  
  /**
    *  An array of rules representing the tokenized state at the end of the line.
    *  These should be passed back into this method when tokenizing the next line
    *  in the file.
    */
  var ruleStack: js.Array[GrammarRule] = js.native
  
  /**
    *  An array of integer scope ids and strings. Positive ids indicate the
    *  beginning of a scope, and negative tags indicate the end. To resolve ids
    *  to scope names, call GrammarRegistry::scopeForId with the absolute
    *  value of the id.
    */
  var tags: js.Array[Double | String] = js.native
  
  /**
    *  This is a dynamic property. Invoking it will incur additional overhead,
    *  but will automatically translate the `tags` into token objects with `value`
    *  and `scopes` properties.
    */
  var tokens: js.Array[GrammarToken] = js.native
}
object TokenizeLineResult {
  
  @scala.inline
  def apply(
    line: String,
    ruleStack: js.Array[GrammarRule],
    tags: js.Array[Double | String],
    tokens: js.Array[GrammarToken]
  ): TokenizeLineResult = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], ruleStack = ruleStack.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizeLineResult]
  }
  
  @scala.inline
  implicit class TokenizeLineResultMutableBuilder[Self <: TokenizeLineResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleStack(value: js.Array[GrammarRule]): Self = StObject.set(x, "ruleStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleStackVarargs(value: GrammarRule*): Self = StObject.set(x, "ruleStack", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Double | String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: (Double | String)*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[GrammarToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: GrammarToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}
