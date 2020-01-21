package typings.atom.linterMod

import typings.atom.atomStrings.file
import typings.atom.atomStrings.project
import typings.atom.mod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinterProvider extends js.Object {
  var grammarScopes: js.Array[String]
  var lintsOnChange: Boolean
  var name: String
  var scope: file | project
  def lint(editor: TextEditor): LintResult | js.Promise[LintResult]
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
}

