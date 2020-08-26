package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenizeLineResult extends js.Object {
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
  implicit class TokenizeLineResultOps[Self <: TokenizeLineResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleStackVarargs(value: GrammarRule*): Self = this.set("ruleStack", js.Array(value :_*))
    @scala.inline
    def setRuleStack(value: js.Array[GrammarRule]): Self = this.set("ruleStack", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: (Double | String)*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Double | String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokensVarargs(value: GrammarToken*): Self = this.set("tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: js.Array[GrammarToken]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
  
}

