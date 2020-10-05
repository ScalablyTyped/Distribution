package typings.angularCompiler.cssAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssRuleAst")
@js.native
abstract class CssRuleAst protected () extends CssAst {
  def this(location: ParseSourceSpan) = this()
}

