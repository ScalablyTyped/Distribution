package typings.angularCompiler.cssAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssStylesBlockAst")
@js.native
class CssStylesBlockAst protected () extends CssBlockAst {
  def this(location: ParseSourceSpan, definitions: js.Array[CssDefinitionAst]) = this()
  var definitions: js.Array[CssDefinitionAst] = js.native
}

