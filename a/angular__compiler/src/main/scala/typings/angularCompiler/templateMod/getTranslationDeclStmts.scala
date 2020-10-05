package typings.angularCompiler.templateMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/template", "getTranslationDeclStmts")
@js.native
object getTranslationDeclStmts extends js.Object {
  def apply(message: Message, variable: ReadVarExpr, closureVar: ReadVarExpr): js.Array[Statement] = js.native
  def apply(
    message: Message,
    variable: ReadVarExpr,
    closureVar: ReadVarExpr,
    params: js.UndefOr[scala.Nothing],
    transformFn: js.Function1[/* raw */ ReadVarExpr, Expression]
  ): js.Array[Statement] = js.native
  def apply(
    message: Message,
    variable: ReadVarExpr,
    closureVar: ReadVarExpr,
    params: StringDictionary[Expression]
  ): js.Array[Statement] = js.native
  def apply(
    message: Message,
    variable: ReadVarExpr,
    closureVar: ReadVarExpr,
    params: StringDictionary[Expression],
    transformFn: js.Function1[/* raw */ ReadVarExpr, Expression]
  ): js.Array[Statement] = js.native
}

