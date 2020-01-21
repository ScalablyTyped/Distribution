package typings.angularCompiler.cssAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssSelectorPartAst")
@js.native
abstract class CssSelectorPartAst protected () extends CssAst {
  def this(location: ParseSourceSpan) = this()
}

