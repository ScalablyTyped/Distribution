package typings.angularCompiler.cssAstMod

import typings.angularCompiler.cssLexerMod.CssToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "mergeTokens")
@js.native
object mergeTokens extends js.Object {
  
  def apply(tokens: js.Array[CssToken]): CssToken = js.native
  def apply(tokens: js.Array[CssToken], separator: String): CssToken = js.native
}
