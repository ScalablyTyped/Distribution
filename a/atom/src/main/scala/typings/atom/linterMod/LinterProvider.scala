package typings.atom.linterMod

import typings.atom.atomStrings.file
import typings.atom.atomStrings.project
import typings.atom.mod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinterProvider extends js.Object {
  var grammarScopes: js.Array[String] = js.native
  var lintsOnChange: Boolean = js.native
  var name: String = js.native
  var scope: file | project = js.native
  def lint(editor: TextEditor): LintResult | js.Promise[LintResult] = js.native
}

object LinterProvider {
  @scala.inline
  def apply(
    grammarScopes: js.Array[String],
    lint: TextEditor => LintResult | js.Promise[LintResult],
    lintsOnChange: Boolean,
    name: String,
    scope: file | project
  ): LinterProvider = {
    val __obj = js.Dynamic.literal(grammarScopes = grammarScopes.asInstanceOf[js.Any], lint = js.Any.fromFunction1(lint), lintsOnChange = lintsOnChange.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinterProvider]
  }
  @scala.inline
  implicit class LinterProviderOps[Self <: LinterProvider] (val x: Self) extends AnyVal {
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
    def setGrammarScopesVarargs(value: String*): Self = this.set("grammarScopes", js.Array(value :_*))
    @scala.inline
    def setGrammarScopes(value: js.Array[String]): Self = this.set("grammarScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setLint(value: TextEditor => LintResult | js.Promise[LintResult]): Self = this.set("lint", js.Any.fromFunction1(value))
    @scala.inline
    def setLintsOnChange(value: Boolean): Self = this.set("lintsOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: file | project): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

