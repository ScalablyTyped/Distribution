package typings.angularCompiler.cssAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssSelectorRuleAst")
@js.native
class CssSelectorRuleAst protected () extends CssBlockRuleAst {
  def this(location: ParseSourceSpan, selectors: js.Array[CssSelectorAst], block: CssBlockAst) = this()
  var selectors: js.Array[CssSelectorAst] = js.native
  var strValue: String = js.native
}

