package typings.angularCompiler.cssAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssSelectorAst")
@js.native
class CssSelectorAst protected () extends CssSelectorPartAst {
  def this(location: ParseSourceSpan, selectorParts: js.Array[CssSimpleSelectorAst]) = this()
  var selectorParts: js.Array[CssSimpleSelectorAst] = js.native
  var strValue: String = js.native
}

