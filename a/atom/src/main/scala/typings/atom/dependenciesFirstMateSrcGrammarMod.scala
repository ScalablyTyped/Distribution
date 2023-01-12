package typings.atom

import typings.atom.atomBooleans.`false`
import typings.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesFirstMateSrcGrammarMod {
  
  @js.native
  trait Grammar extends StObject {
    
    /** The name of the Grammar. */
    val name: String = js.native
    
    // Event Subscription
    def onDidUpdate(callback: js.Function0[Unit]): Disposable = js.native
    
    /** Undocumented: scope name of the Grammar. */
    val scopeName: String = js.native
    
    /**
      *  Tokenizes the line of text.
      *  @param line A string of text to tokenize.
      *  @param ruleStack An optional array of rules previously returned from this
      *  method. This should be null when tokenizing the first line in the file.
      *  @param firstLine A optional boolean denoting whether this is the first line
      *  in the file which defaults to `false`.
      *  @return An object representing the result of the tokenize.
      */
    def tokenizeLine(line: String): TokenizeLineResult = js.native
    /**
      *  Tokenizes the line of text.
      *  @param line A string of text to tokenize.
      *  @param ruleStack An optional array of rules previously returned from this
      *  method. This should be null when tokenizing the first line in the file.
      *  @param firstLine A optional boolean denoting whether this is the first line
      *  in the file which defaults to `false`.
      *  @return An object representing the result of the tokenize.
      */
    def tokenizeLine(line: String, ruleStack: js.Array[GrammarRule]): TokenizeLineResult = js.native
    def tokenizeLine(line: String, ruleStack: Null, firstLine: Boolean): TokenizeLineResult = js.native
    def tokenizeLine(line: String, ruleStack: Unit, firstLine: Boolean): TokenizeLineResult = js.native
    @JSName("tokenizeLine")
    def tokenizeLine_false(line: String, ruleStack: js.Array[GrammarRule], firstLine: `false`): TokenizeLineResult = js.native
    
    // Tokenizing
    /**
      *  Tokenize all lines in the given text.
      *  @param text A string containing one or more lines.
      *  @return An array of token arrays for each line tokenized.
      */
    def tokenizeLines(text: String): js.Array[js.Array[GrammarToken]] = js.native
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrammarRule] (val x: Self) extends AnyVal {
      
      inline def setContentScopeName(value: String): Self = StObject.set(x, "contentScopeName", value.asInstanceOf[js.Any])
      
      inline def setRule(value: js.Object): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GrammarToken extends StObject {
    
    var scopes: js.Array[String]
    
    var value: String
  }
  object GrammarToken {
    
    inline def apply(scopes: js.Array[String], value: String): GrammarToken = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrammarToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrammarToken] (val x: Self) extends AnyVal {
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenizeLineResult extends StObject {
    
    /** The string of text that was tokenized. */
    var line: String
    
    /**
      *  An array of rules representing the tokenized state at the end of the line.
      *  These should be passed back into this method when tokenizing the next line
      *  in the file.
      */
    var ruleStack: js.Array[GrammarRule]
    
    /**
      *  An array of integer scope ids and strings. Positive ids indicate the
      *  beginning of a scope, and negative tags indicate the end. To resolve ids
      *  to scope names, call GrammarRegistry::scopeForId with the absolute
      *  value of the id.
      */
    var tags: js.Array[Double | String]
    
    /**
      *  This is a dynamic property. Invoking it will incur additional overhead,
      *  but will automatically translate the `tags` into token objects with `value`
      *  and `scopes` properties.
      */
    var tokens: js.Array[GrammarToken]
  }
  object TokenizeLineResult {
    
    inline def apply(
      line: String,
      ruleStack: js.Array[GrammarRule],
      tags: js.Array[Double | String],
      tokens: js.Array[GrammarToken]
    ): TokenizeLineResult = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], ruleStack = ruleStack.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizeLineResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizeLineResult] (val x: Self) extends AnyVal {
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setRuleStack(value: js.Array[GrammarRule]): Self = StObject.set(x, "ruleStack", value.asInstanceOf[js.Any])
      
      inline def setRuleStackVarargs(value: GrammarRule*): Self = StObject.set(x, "ruleStack", js.Array(value*))
      
      inline def setTags(value: js.Array[Double | String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: (Double | String)*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTokens(value: js.Array[GrammarToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: GrammarToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
}
