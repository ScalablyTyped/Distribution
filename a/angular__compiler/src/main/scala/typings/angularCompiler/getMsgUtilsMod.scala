package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMsgUtilsMod {
  
  @JSImport("@angular/compiler/src/render3/view/i18n/get_msg_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createGoogleGetMsgStatements(
    variable: ReadVarExpr,
    message: Message,
    closureVar: ReadVarExpr,
    params: StringDictionary[Expression]
  ): js.Array[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGoogleGetMsgStatements")(variable.asInstanceOf[js.Any], message.asInstanceOf[js.Any], closureVar.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Array[Statement]]
  
  @scala.inline
  def serializeI18nMessageForGetMsg(message: Message): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeI18nMessageForGetMsg")(message.asInstanceOf[js.Any]).asInstanceOf[String]
}
