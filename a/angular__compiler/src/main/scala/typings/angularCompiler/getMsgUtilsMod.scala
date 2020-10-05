package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/i18n/get_msg_utils", JSImport.Namespace)
@js.native
object getMsgUtilsMod extends js.Object {
  def createGoogleGetMsgStatements(
    variable: ReadVarExpr,
    message: Message,
    closureVar: ReadVarExpr,
    params: StringDictionary[Expression]
  ): js.Array[Statement] = js.native
  def serializeI18nMessageForGetMsg(message: Message): String = js.native
}

