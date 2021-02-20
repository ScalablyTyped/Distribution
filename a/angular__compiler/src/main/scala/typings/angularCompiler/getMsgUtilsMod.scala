package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMsgUtilsMod {
  
  @JSImport("@angular/compiler/src/render3/view/i18n/get_msg_utils", "createGoogleGetMsgStatements")
  @js.native
  def createGoogleGetMsgStatements(
    variable: ReadVarExpr,
    message: Message,
    closureVar: ReadVarExpr,
    params: StringDictionary[Expression]
  ): js.Array[Statement] = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/get_msg_utils", "serializeI18nMessageForGetMsg")
  @js.native
  def serializeI18nMessageForGetMsg(message: Message): String = js.native
}
