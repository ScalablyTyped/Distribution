package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.MessageParts
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localizeUtilsMod {
  
  @JSImport("@angular/compiler/src/render3/view/i18n/localize_utils", "createLocalizeStatements")
  @js.native
  def createLocalizeStatements(variable: ReadVarExpr, message: Message, params: StringDictionary[Expression]): js.Array[Statement] = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/localize_utils", "serializeI18nMessageForLocalize")
  @js.native
  def serializeI18nMessageForLocalize(message: Message): MessageParts = js.native
}
