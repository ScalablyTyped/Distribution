package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n/localize_utils", JSImport.Namespace)
@js.native
object localizeUtilsMod extends js.Object {
  def createLocalizeStatements(variable: ReadVarExpr, message: Message, params: StringDictionary[Expression]): js.Array[Statement] = js.native
  def serializeI18nMessageForLocalize(message: Message): AnonMessageParts = js.native
}

