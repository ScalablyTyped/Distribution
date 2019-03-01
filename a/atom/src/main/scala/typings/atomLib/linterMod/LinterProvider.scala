package typings
package atomLib.linterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinterProvider extends js.Object {
  var grammarScopes: js.Array[java.lang.String]
  var lintsOnChange: scala.Boolean
  var name: java.lang.String
  var scope: atomLib.atomLibStrings.file | atomLib.atomLibStrings.project
  def lint(editor: atomLib.atomMod.TextEditor): LintResult | js.Promise[LintResult]
}

object LinterProvider {
  @scala.inline
  def apply(
    grammarScopes: js.Array[java.lang.String],
    lint: js.Function1[atomLib.atomMod.TextEditor, LintResult | js.Promise[LintResult]],
    lintsOnChange: scala.Boolean,
    name: java.lang.String,
    scope: atomLib.atomLibStrings.file | atomLib.atomLibStrings.project
  ): LinterProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grammarScopes")(grammarScopes)
    __obj.updateDynamic("lint")(lint)
    __obj.updateDynamic("lintsOnChange")(lintsOnChange)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinterProvider]
  }
}

