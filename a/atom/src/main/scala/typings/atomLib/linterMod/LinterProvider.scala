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

