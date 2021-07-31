package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.MessageParts
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localizeUtilsMod {
  
  @JSImport("@angular/compiler/src/render3/view/i18n/localize_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createLocalizeStatements(variable: ReadVarExpr, message: Message, params: StringDictionary[Expression]): js.Array[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocalizeStatements")(variable.asInstanceOf[js.Any], message.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Array[Statement]]
  
  @scala.inline
  def serializeI18nMessageForLocalize(message: Message): MessageParts = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeI18nMessageForLocalize")(message.asInstanceOf[js.Any]).asInstanceOf[MessageParts]
}
