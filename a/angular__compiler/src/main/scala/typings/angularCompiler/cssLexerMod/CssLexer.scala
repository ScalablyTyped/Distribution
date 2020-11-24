package typings.angularCompiler.cssLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_lexer", "CssLexer")
@js.native
class CssLexer () extends js.Object {
  
  def scan(text: String): CssScanner = js.native
  def scan(text: String, trackComments: Boolean): CssScanner = js.native
}
